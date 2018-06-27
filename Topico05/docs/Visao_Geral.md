# 1. Visão Geral

### 1. 1. Descrição do Problema 

O Orientador do projeto quer nos incentivar a aprendizagem em trocas de mensagens de uma maneira segura entre duas aplicações sendo que, o sistema em questão afetará todos aqueles que querem ter uma ideia em trocas de mensagens (assíncronas) usando java, principalmente estudantes na área de desenvolvimento. Como solução estaremos usando ferramentas (descritas na introdução) para essa abordagem e usaremos filas para manter os dados temporariamente.

### 1. 2. Principais Envolvidos e suas CaracterÌsticas

#### 1.2.1. Usuários do Sistema

O sistema será destinado a estudantes na área de desenvolvimento que querem aprender e ter uma ideia sobre trocas de mensagens usando a linguagem java.

#### 1.2.2. Desenvolvedores do Sistema

O sistema consta com apenas um desenvolvedor e um orientador. 

### 1. 3. Regras de Negócio

O sistema deverá manter uma certa segurança para a troca de mensagens, usando fila (manterá os registros das mensagens até o momento de chegar ao seu destinatário) para esssa eventuaidade, a troca será feita entre duas pessoas, possuindo apenas o limite (registros) que caiba no servidor e será de maneira assíncrona, os registros devem ser mantidos até o momento que a pessoa receberá a mensagem.

