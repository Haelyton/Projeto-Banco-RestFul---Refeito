API de Banco - Cadastro de Contas Bancárias e Transferências
📌 Descrição
Este projeto é uma API RESTful desenvolvida em Java utilizando Quarkus, com o objetivo de gerenciar contas bancárias e permitir transferências de dinheiro entre contas. A API possibilita o cadastro de contas bancárias, além da realização de transferências entre essas contas de forma segura e eficiente.

📌 Tecnologias Utilizadas no Projeto Quarkus
⚙️ Linguagem e Framework
Java 17+ → Linguagem principal do projeto.
Quarkus 3.18.2 → Framework Java otimizado para microsserviços e execução nativa.
🔄 Banco de Dados e Persistência
Quarkus JDBC PostgreSQL → Driver para conexão com o banco PostgreSQL.
Quarkus JDBC H2 → Banco de dados em memória para testes.
Quarkus Hibernate Validator → Validação de dados com Bean Validation.
Quarkus Spring Data JPA → Suporte a repositórios no estilo Spring Data.
Jakarta Persistence API (JPA) → Para mapeamento objeto-relacional.
🖥️ APIs e Comunicação
Quarkus REST (JAX-RS) → Para criação de endpoints RESTful.
Jakarta RESTful Web Services (JAX-RS) → API padrão para desenvolvimento REST.
Quarkus REST Jackson → Suporte para serialização e desserialização de JSON.
Quarkus Spring Web → Permite usar anotações do Spring para APIs REST.
🛠️ Ferramentas de Build e Plugins
Maven → Gerenciador de dependências e build.
Quarkus Maven Plugin → Geração de código e empacotamento de builds nativos.
Maven Compiler Plugin → Configuração do compilador Java.
Maven Surefire Plugin → Execução de testes unitários.
Maven Failsafe Plugin → Execução de testes de integração.
✅ Testes e Qualidade de Código
Quarkus JUnit 5 → Testes unitários e integração.
REST Assured → Testes de API REST.
🐳 Docker e Implantação
Quarkus suporta Docker nativamente → Pode ser containerizado facilmente.
