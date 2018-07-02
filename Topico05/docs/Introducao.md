# 1. Introdução

### 1. 1. Tema

Definição e desenvolvimento de um projeto de integração de aplicações no qual troca de mensagens é utilizada.

### 1. 2. Objetivo do Projeto

A integração deve necessariamente fazer uso de troca de mensagens, ou seja, mensagens serão entregues entre as aplicações por meio de um “canal” ou “fila”. Trata-se de um estilo de integração assíncrono e com entrega confiável das mensagens.

#### 1. 2. 1. Contexto

Criação de um jogo de 'Pergunta e Resposta'. Um usuário (produtor de perguntas) realiza uma pergunta, essa pergunta é enviada para o servidor (fila de perguntas) onde ficará até outro usuário (consumidor de perguntas) logar, após logar irá receber essa pergunta, não mantendo nenhum registro da pergunta na fila, então o usuário (além de consumidor de perguntas ele também é um produtor de respostas) poderá responder, após sua resposta ela será enviada para o servidor (fila de respostas) onde ficará até um usuário (produtor de perguntas também é um consumidor de respostas) logar, após logar irá receber a resposta (sairá da fila de respostas sem manter nenhum registro).

* Observação: Não contará com meios de criar perguntas ou respostas (apesar que pode ser implementado), elas já estarão pré-cadastradas (build).

### 1. 3. Delimitação do Problema 

Troca (assíncrona) de mensagens entre aplicações por meio de uma fila.

### 1. 4. Justificativa da Escolha do Tema 

Tema escolhido com intuito de ajudar o aluno a compreender as possibilidades e dificuldades de uma comunicação (mensagens) assíncrona, mantendo um certo nível de segurança entre elas.

### 1. 5. Principais Tecnologias Utilizadas

O projeto terá como base a utilização da linguagem java.

- **Spring Boot:** Micro Framework. Seu objetivo não é trazer novas soluções para problemas que já foram resolvidos, mas sim reaproveitar estas tecnologias e aumentar a produtividade do desenvolvedor;
- **Activemq:** É um message broker de código-fonte aberto escrito em Java, juntamente com um cliente completo de Java Message Service (JMS). Ele fornece "recursos empresariais", ou seja, promove a comunicação de mais de um cliente ou servidor;
- **JMS:** É uma API da linguagem Java para middleware orientado a mensagens. Através da API JMS, duas ou mais aplicações podem se comunicar por mensagens;
- **Maven:** É uma ferramenta de automação de compilação utilizada primariamente em projetos Java.
- **Recurso JSON:** Uso do 'Jackson' que é um processador JSON de alto desempenho para Java.
