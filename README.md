# Livraria Online

**Livraria Online** é um projeto de sistema de gerenciamento de catálogo de livros que oferece uma solução prática para a catalogação, pesquisa e gestão de livros. Nesta aplicação, os usuários podem armazenar informações sobre os livros que possuem ou desejam ler, além de acessar informações sobre uma variedade de livros disponíveis.

## Recursos Principais

- Cadastro de Livros: Permite aos usuários adicionar informações sobre livros ao catálogo, incluindo título, autor, ISBN, gênero, ano de publicação, editora, sinopse e capa do livro.

- Listagem de Livros: Exibe uma lista de todos os livros disponíveis no catálogo, permitindo aos usuários navegar e visualizar informações básicas sobre cada livro.

- Detalhes do Livro: Os usuários podem ver informações detalhadas sobre um livro específico, incluindo sinopse e capa do livro.

- Atualização de Livros: Permite aos usuários editar as informações de um livro existente no catálogo, caso desejem atualizar qualquer dado.

- Exclusão de Livros: Os usuários podem remover um livro do catálogo, se não desejarem mais mantê-lo.

- Pesquisa de Livros: Os usuários podem pesquisar livros com base em diferentes critérios, como título, autor ou gênero. A pesquisa pode ser filtrada para encontrar livros específicos.

- Gerenciamento de Conta: Os usuários podem criar uma conta para salvar seu catálogo de livros e manter um registro personalizado.

- Autenticação e Autorização (opcional): A aplicação pode incluir autenticação e autorização para proteger operações sensíveis, como atualização e exclusão de livros.

## Tecnologias Utilizadas

- **Spring Boot:** Para criar a API REST.
- **Banco de Dados (H2 para desenvolvimento, PostgreSQL para produção):** Para armazenar informações sobre os livros.
- **Spring Security:** Para gerenciar autenticação e autorização.
- **JSON Web Token (JWT):** Para autenticação segura.
- **Bean Validation:** Para validação de dados.
- **Spring DevTools:** Para facilitar o desenvolvimento.
- **Project Lombok:** Para reduzir o código boilerplate.
- **OpenFeign:** Para consumo de APIs externas.

## Configuração

Para configurar e executar o projeto em sua máquina local, siga as etapas abaixo:

1. Clone o repositório:

   ```shell
   https://github.com/rafaelmachadobr/LivrariaDigital.git

2. Execute o projeto:

   ```shell
   mvn spring-boot:run

3. Acesse a documentação da API com o Swagger em ```http://localhost:8080/swagger-ui.html```

## Licença

Este projeto é distribuído sob a licença MIT. Para mais informações, consulte o arquivo [LICENSE](LICENSE) neste repositório.
