# i-2018-ExchangeOfMessage

Bem Vindo!! Abaixo, algumas informações que podem ser relevantes para você!  

## Descrição do Projeto
  
  Projeto conduzido por aluno da Disciplina "Intregação de Aplicações 2018", com supervisão do professor (Fábio Nogueira Lucena), para troca (assíncrona) de mensagens.

## Detalhes do Projeto
 - [Introdução](https://github.com/MarconiBraga/i-2018-ExchangeOfMessage/blob/master/Topico05/docs/Introducao.md)
 - [Visão Geral](https://github.com/MarconiBraga/i-2018-ExchangeOfMessage/blob/master/Topico05/docs/Visao_Geral.md)
 - [Requisitos](https://github.com/MarconiBraga/i-2018-ExchangeOfMessage/blob/master/Topico05/docs/Requisitos.md)
 - [Diagrama de Integração](https://github.com/MarconiBraga/i-2018-ExchangeOfMessage/blob/master/Topico05/docs/Integration_Diagram.pdf)	
 
## Equipe

 - [Marconi Braga](https://github.com/MarconiBraga)

## Funcionamento

	Há duas aplicações, onde ambas se comunicam de forma assíncrona. 
	Uma das aplicações é responsável por criar e enviar as perguntas para quem estiver "escutando" o canal de perguntas.
	A outra aplicação estará escutando a "fila" de perguntas cadastradas, ao se conectar à "fila" o cliente (jogador) recebe a pergunta, que por sua fez é removida da "fila" de perguntas. Ao responder a pergunta é enviado de volta para o servidor de perguntas qual a resposta escolhida pelo cliente.
	A criação e envio das perguntas foi separada por categorias.
 
## Obtendo o Projeto

`git clone https://github.com/MarconiBraga/i-2018-ExchangeOfMessage.git`  

## Instruções para importação do projeto

### Baixar o ActiveMQ

- [download ActiveMQ] (http://activemq.apache.org/download.html)
- rodar o ActiveMQ
```
executar ../dir_activemq/activemq.bat
```

### Executar no diretório de cada aplicação
```
mvn spring-boot:run
```
### Sugestões(Ajuda)
- Usar o sistema operacional: Windows (maior facilidade de executar o ActiveMQ) ou Linux;
- Após execução do ActiveMQ retornará um 'localhost', onde poderá verificar os estados de envio e recebimento das perguntas e respostas.
