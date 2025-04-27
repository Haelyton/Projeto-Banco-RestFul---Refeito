API de Banco - Cadastro de Contas Bancárias e Transferências
📌 Descrição
Este projeto é uma API RESTful desenvolvida em Java utilizando Spring Boot, com o objetivo de gerenciar contas bancárias e permitir transferências de dinheiro entre contas. A API possibilita o cadastro de contas bancárias, além da realização de transferências entre essas contas de forma segura e eficiente.

🚀 Funcionalidades
✅ Cadastro de Conta Bancária
ID da conta
Nome do titular
CPF do titular
Data de nascimento do titular
Senha da conta (armazenada de forma segura)
Saldo inicial (padrão: R$ 0,00, caso não informado)
🔄 Transferência de Dinheiro
ID da transferência
ID da conta emitente
ID da conta de recebimento
Valor da transferência
Validação de saldo antes da operação
🛠 Tecnologias Utilizadas
Java 17+
Spring Boot (Web, Data JPA, Validation)
PostgreSQL ou H2 (para ambiente de testes)
Maven (gerenciamento de dependências)
Lombok (eliminação de código boilerplate)
🔥 Melhorias Futuras
📦 Implementação de Docker para facilitar a execução e o deploy da API
✅ Testes Unitários com JUnit e Mockito para garantir a qualidade do código
🔑 Autenticação e Segurança utilizando JWT para proteger as rotas
📊 Monitoramento e Logs com Spring Actuator
