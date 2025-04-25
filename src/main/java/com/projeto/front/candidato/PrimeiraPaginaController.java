package com.projeto.front.candidato;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/")
public class PrimeiraPaginaController {

    @GetMapping("home")
    public String cadastroCandidato(Model model){
        model.addAttribute("mensagemDaController", "Primeira mensagem vinda do Controller");
        return "primeiraPagina";
    }

    @GetMapping("/login")
    public String loginCandidato(){
        return "candidato/login";
    }

    @PostMapping("create")
    public String cadastroCandidatos(Model model, Pessoa pessoa){
        System.out.println("Nome:" + pessoa.nome);
        System.out.println("Email:" + pessoa.email);
        System.out.println("Usuário:" + pessoa.usuario);

        model.addAttribute("pessoa", pessoa);
        return "candidato/info";
    }

    record Pessoa(String nome, String email, String usuario){

    }
}
