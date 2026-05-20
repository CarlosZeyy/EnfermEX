# 🏥 EnfermEX - Sistema de Gestão para Enfermagem Domiciliar (Homecare)

> Um sistema web completo (Full Stack) desenvolvido para modernizar, organizar e digitalizar o atendimento domiciliar de enfermagem, substituindo os prontuários de papel por uma plataforma segura e acessível de qualquer lugar.

## 📖 Sobre o Projeto

O EnfermEX nasceu da necessidade real de resolver um problema do dia a dia: a organização de prontuários, consultas e anotações para profissionais de enfermagem que atuam em formato *homecare* (atendimento domiciliar). 

O sistema foi arquitetado em um modelo de **Monorepo**, garantindo uma comunicação fluida entre uma API robusta em Java e uma interface dinâmica em React, tudo orquestrado e conteinerizado via Docker para facilitar tanto o desenvolvimento quanto o deploy em produção.

## ✨ Funcionalidades Principais

* **🔒 Autenticação e Segurança:** Login e registro seguros com JWT (JSON Web Tokens), validação de COREN e criptografia de senhas.
* **📧 Recuperação de Senha:** Sistema integrado de envio de e-mails transacionais (SMTP) com templates dinâmicos para redefinição de senha.
* **👥 Gestão de Pacientes:** Cadastro completo, histórico e controle de prontuários eletrônicos.
* **📅 Agendamentos e Consultas:** Controle de visitas domiciliares e status de atendimento.
* **💊 Controle Clínico:** Registro de medicamentos, dosagens e anotações diárias de enfermagem.
* **📱 Interface Responsiva (SPA):** Navegação rápida e fluida sem recarregamento de páginas.

## 🛠️ Tecnologias Utilizadas

### Backend (API Rest)
* **Java 21**
* **Spring Boot 3** (Spring Web, Spring Data JPA, Spring Security)
* **PostgreSQL** (Banco de dados relacional)
* **Hibernate** (Mapeamento Objeto-Relacional)
* **JavaMailSender & Thymeleaf** (Envio e template de e-mails)

### Frontend (SPA)
* **React** (com TypeScript)
* **Vite** (Build tool e servidor de desenvolvimento)
* **Axios** (Comunicação HTTP e interceptadores)
* **React Router Dom** (Roteamento)
* **Nginx** (Servidor web estático e proxy reverso para produção)

### Infraestrutura & DevOps
* **Docker & Docker Compose** (Conteinerização do ambiente)
* **Hostinger VPS** (Hospedagem em nuvem)
* **Coolify** (Orquestrador de Deploy e CI/CD)
* **Traefik** (Proxy reverso e gerador de certificados SSL/Let's Encrypt)

---

## 🚀 Como executar o projeto localmente

### Pré-requisitos
Certifique-se de ter instalado em sua máquina:
* [Git](https://git-scm.com/)
* [Docker](https://www.docker.com/)
* [Docker Compose](https://docs.docker.com/compose/)

### 1. Clonando o repositório
```bash
git clone https://github.com/CarlosZeyy/EnfermEX.git

cd EnfermEX
```

### 2. Configurando as Variáveis de Ambiente
Na raiz do projeto (onde está o arquivo docker-compose.yml), crie um arquivo chamado .env e preencha com as suas informações:

#### Configurações do Banco de Dados
```bash
POSTGRES_USER=seu_usuario_db

POSTGRES_PASSWORD=sua_senha_db

POSTGRES_DB=enfermex_db
```

#### Configurações de E-mail (Para recuperação de senha)
```bash
GMAIL_EMAIL=seu_email@gmail.com

GMAIL_PASSWORD=sua_senha_de_app_do_google
```


### Configurações de URL
```bash
URL=http://localhost:5173

VITE_API_URL=http://localhost:8080
```

### 3. Subindo os Contêineres
Com o Docker rodando na sua máquina, execute o comando mágico na raiz do projeto:

```bash
docker-compose up -d --build
```
O Docker fará o download das imagens, compilará o código Java, gerará a build de produção do React e iniciará todos os serviços.

### 4. Acessando a Aplicação
Frontend (Interface): http://localhost:80

Backend (API): http://localhost:8080

Banco de Dados (Adminer): http://localhost:8081

#### 👨‍💻 Autor
Desenvolvido por Carlos Moises Mariano Lopes Ferreira.
Um projeto focado em resolver problemas reais através de código limpo e arquitetura escalável.

[LinkedIn](https://www.linkedin.com/in/carlosmoisesdev/)

[GitHub](https://github.com/CarlosZeyy)

Este projeto foi criado com fins de solucionar uma demanda real de gestão de homecare, além de servir como portfólio prático de engenharia de software Full Stack e DevOps.
