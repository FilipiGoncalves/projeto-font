# 📋 Sistema de Cadastro e Login - Spring Boot + H2

Este é um projeto acadêmico que implementa um sistema de cadastro e login com verificação de dados duplicados e criptografia de senha. Desenvolvido com **Spring Boot**, utilizando banco de dados **H2 em memória**, ideal para testes e protótipos.

## 🔧 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (modo memória)
- HTML + Thymeleaf
- Maven

## 📌 Funcionalidades

- Cadastro de novos usuários
- Login com autenticação e verificação de senha
- Criptografia de senha (com base64, para fins acadêmicos)
- Impede cadastro com **email** ou **usuário já existentes**
- Exibição de mensagens de erro para login/senha inválidos

## 🛠️ Como rodar o projeto

### Pré-requisitos

- Java JDK instalado (17 ou superior)
- IDE como IntelliJ ou Spring Tools / Eclipse com suporte a Spring Boot
- Maven configurado

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

2. Abra o projeto na IDE e execute a classe principal (geralmente Application.java).

3. Acesse no navegador:
   ```bash
   Cadastro: http://localhost:8080/home
   Login: http://localhost:8080/login
   ```
   
4. Banco H2 pode ser acessado em:
   ```bash
   http://localhost:8080/h2-console
   ```
   
   Use as configurações:
   ```bash
   JDBC URL: jdbc:h2:mem:cadastro
   Username: admin
   Password: admin
   ```

## 🖼️ Prints 
   - Página Inicial - Modo Escuro
   ![image](https://github.com/user-attachments/assets/d2b70cad-89c0-4e1a-8ab5-9cadbc962698)
   - Página Inicial - Modo Claro
   ![image](https://github.com/user-attachments/assets/edf30edd-7864-4b69-b83e-39cc90a45391)
   - Página Inicial - Todos os campos necessários <br>
   ![image](https://github.com/user-attachments/assets/b60ed636-20b6-4f3a-97a8-48b890e9157c)
   - Página Inicial - Erro de e-mail já cadastrado <br>
   ![image](https://github.com/user-attachments/assets/213ceed4-fc3a-47ad-91ad-b53952703e63)
   - Página Inicial - Erro de usuário já cadastrado <br>
   ![image](https://github.com/user-attachments/assets/a8d4cb0c-cda9-48a2-b9c0-ad2471143f83)
   - Página Login - Senha incorreta <br>
   ![image](https://github.com/user-attachments/assets/ef4602c9-7e9a-4f72-9ca2-108e7c4ea962)
   - Página Situação - Login bem sucedido <br>
   ![image](https://github.com/user-attachments/assets/84f77505-05b5-4098-8f94-d0dec13fb07d)








## 🙋 Autor
- Filipi Mantelato Gonçalves - RGM: 11232100259 
- Lucas Leite Vieira - RGM: 11222100555



