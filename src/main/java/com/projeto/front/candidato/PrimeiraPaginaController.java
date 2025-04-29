package com.projeto.front.candidato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/")
public class PrimeiraPaginaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/home")
    public String cadastroCandidato(Model model){
        model.addAttribute("pessoa", new Pessoa()); 
        return "primeiraPagina";
    }

    @GetMapping("/login")
    public String loginCandidato(){
        return "candidato/login";
    }

    @GetMapping("/situacao")
    public String situacaoCandidato(){
        return "candidato/situacao";
    }

    @PostMapping("/create")
    public String cadastroCandidatos(Pessoa pessoa, Model model){
        try {
            // Verifica se já existe um email cadastrado
            if (pessoaRepository.findByEmail(pessoa.getEmail()) != null) {
                model.addAttribute("erro", "Este email já está cadastrado.");
                return "candidato/emailErro";
            }

            // Verifica se já existe um usuário (nome) cadastrado
            if (pessoaRepository.findByUsuario(pessoa.getUsuario()) != null) {
                model.addAttribute("erro", "Este nome de usuário já está cadastrado.");
                return "candidato/usuarioErro";
            }

            pessoa.setSenha(Criptografia.criptografar(pessoa.getSenha())); 
            pessoaRepository.save(pessoa);
            model.addAttribute("pessoa", pessoa);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("erro", "Erro interno no servidor.");
            return "primeiraPagina";
        }
        return "candidato/info";
    }

    @PostMapping("/login")
    public String realizarLogin(String email, String senha, Model model) {
        Pessoa pessoa = pessoaRepository.findByEmail(email);

        if (pessoa != null) {
            try {
                String senhaDescriptografada = Criptografia.descriptografar(pessoa.getSenha());
                if (senhaDescriptografada.equals(senha)) {
                    return "redirect:/situacao";
                } else {
                    model.addAttribute("erro", "Senha incorreta!");
                    return "candidato/loginErro";
                }
            } catch (Exception e) {
                e.printStackTrace();
                model.addAttribute("erro", "Erro interno!");
                return "candidato/login";
            }
        } else {
            model.addAttribute("erro", "Usuário não encontrado!");
            return "candidato/login";
        }
    }
}
