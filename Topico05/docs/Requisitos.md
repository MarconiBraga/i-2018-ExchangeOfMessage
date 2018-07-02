# 1. Requisitos

### 1. 1. Requisitos Funcionais 

**RF. 1: Realiza Pergunta.**
 - Descrição: O usuário poderá realizar uma pergunta a outro usuário.
 - Entrada: 'string'.
 - Processo: A pergunta será adicionada na fila de um servidor.
 - Saída: Mensagem de confirmação bem sucedido da pergunta caso tenha sido efetuado com sucesso, senão, mensagem de erro.

**RF. 2: Realiza Resposta.**
 - Descrição: O usuário poderá realizar uma resposta a certa pergunta realizada por outro usuário.
 - Entrada: 'string'.
 - Processo: A resposta será adicionada na fila de um servidor.
 - Saída: Mensagem de confirmação bem sucedido da resposta caso tenha sido efetuado com sucesso, senão, mensagem de erro.
 
**RF. 3: Envia Pergunta.**
 - Descrição: O servidor enviará a pergunta ao destinatário.
 - Entrada: Usuário que possui perguntas destinadas a ele entra no servidor.
 - Processo: A pergunta terá seu registro retirado da fila e enviado para o destinatário.
 - Saída: Mensagem de confirmação bem sucedido do envio da pergunta caso tenha sido efetuado com sucesso, senão, mensagem de erro.
 
**RF. 4: Envia Resposta.**
 - Descrição: O servidor enviará a resposta ao destinatário.
 - Entrada: Usuário que possui respostas destinadas a ele entra no servidor.
 - Processo: A resposta terá seu registro retirado da fila e enviado para o destinatário.
 - Saída: Mensagem de confirmação bem sucedido do envio da resposta caso tenha sido efetuado com sucesso, senão, mensagem de erro.
 
### 1. 2. Requisitos Não Funcionais

#### 1.2.1 Requisitos Organizacionais

**RNF. 1: Software**
 - Será usado duas filas (pergunta e resposta) no servidor para gurdar os registros temporariamente.
 
**RNF. 2: Linguagem de Programação**
 - O sistema será feito em java, linguagem de progamação orientada a objetos.

**RNF. 3: Hardware**
 - Será usado uma api da linguagem Java para middleware orientado a mensagens.

### 1. 3. Atributos 

**Disponibilidade:**
 - Não há necessidade das aplicações estarem disponíveis (poderá 'logar' em qualquer momento que desejar) apenas o servidor que deve estar sempre disponível, caso ocorra alguma interrupção ele deve ser restaurado o mais rápido possível.

**Segurança:**
 - Como o sistema trocará mensagens individuais, ele deverá ter uma boa segurança para que não haja registros das mensagens após recebimento.
