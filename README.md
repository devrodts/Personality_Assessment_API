
#### Projeto em fase de construção e testes.

Este projeto é composto por uma aplicação distribuída que realiza a avaliação de traços de personalidade. Ele é dividido em microserviços, a saber, *Assessment Service* e *Question Service*, cada um implementando funcionalidades específicas e integrando-se por meio de APIs REST.

## Tecnologias Utilizadas

- **Java 21:** Versão atual do Java SDK utilizada para o desenvolvimento de toda a aplicação.
- **Spring MVC & Spring Boot:** Frameworks empregados para a criação de endpoints REST, injeção de dependências, gerenciamento de ciclo de vida dos beans e outras funcionalidades.
- **Jakarta EE:** Utilizado para implementar APIs com as novas convenções de Jakarta, mantendo a compatibilidade com as especificações modernas de enterprise.
- **Docker & Docker Compose:** Ferramentas usadas para containerização dos serviços e orquestração dos contêineres, garantindo um ambiente consistente e isolado para desenvolvimento e produção.
- **PostgreSQL:** Banco de dados relacional utilizado no projeto.
- **JUnit e Spring Test:** Para facilitar a criação de testes unitários e de integração, garantindo a qualidade do código e a robustez da aplicação.

## Metodologias e Boas Práticas

- **Arquitetura Baseada em Microserviços:** Cada microserviço é responsável por uma parte específica da aplicação, facilitando escalabilidade, manutenção e deploy independentes.
- **Injeção de Dependências:** Uso extensivo do Spring para promover a inversão de controle (IoC), facilitando a testabilidade e modularização do código.
- **Programação Orientada a Objetos:** Estruturas de classes bem definidas, encapsulamento e separação de responsabilidades.
- **Validação e Tratamento de Erros:** Utilização de anotações de validação (por exemplo, `@Valid`) e tratamento centralizado de exceções via `@ControllerAdvice` para retornar mensagens de erro amigáveis.
- **Containerização:** Cada serviço é containerizado utilizando Docker, promovendo consistência entre ambientes de desenvolvimento, testes e produção.
- **Integração Contínua e Deploy Contínuo (CI/CD):** A estrutura da aplicação e seu ambiente Docker possibilita a automação do build, testes e deploy, garantindo agilidade nas atualizações e confiabilidade nas releases.
- **Documentação da API:** Recomenda-se a integração com ferramentas como Swagger, a fim de manter a documentação da API sempre atualizada e acessível.

## Estrutura do Projeto

- **Assessment Service:** Responsável por processar as respostas, calcular a avaliação de personalidade e fornecer o resultado ao cliente via uma API REST.
- **Question Service:** Gerencia as questões e respostas associadas que compõem a avaliação.
- **Banco de Dados (PostgreSQL):** Armazena os dados da aplicação, incluindo informações dos usuários, respostas e demais informações necessárias para a avaliação.

## Como Realizar o Build e Subir a Aplicação

### Pré-requisitos

- [Docker](https://docs.docker.com/get-docker/) instalado na máquina.
- [Docker Compose](https://docs.docker.com/compose/install/) devidamente configurado.

### Passo a Passo

1. **Clone o repositório:**

   ```bash
   git clone https://seu-repositorio.com/seu-projeto.git
   cd seu-projeto