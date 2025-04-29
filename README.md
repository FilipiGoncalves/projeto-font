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
