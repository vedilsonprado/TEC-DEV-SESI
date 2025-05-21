# 📘 05-12 | AT01-iot - Explorando Componentes

**📁 Pasta onde salvar os trabalho:** `D:\Temp\DEV-1D\ARIOT`

**👨🏻‍🏫 Enviar os arquivos no Thikercad**

**🔧 Acessar o [TinkerCad](https://www.tinkercad.com/joinclass/NR3PP9END)**

## 🧪 ATIVIDADE 1 — Acendendo um LED com a Fonte
### **Objetivo:** Entender a ligação de um LED e resistência com uma fonte de energia.

**Componentes:**
- 1 LED vermelho
- 1 resistência de 220 Ω
- 1 fonte de energia (pilha de 9V)

**Regras:**
- Conecte o LED à pilha, passando pela resistência.
- Verifique a polaridade correta (anodo e catodo do LED).
- Simule e veja o LED acendendo.
- Teste o que acontece se inverter o LED ou remover a resistência.


### 💾 Salvar como: `01 - SeuNome`

<br><br>

## 🧪 ATIVIDADE 2 — Interruptor Ligando o LED
### **Objetivo:** Introduzir o conceito de controle com chave (botão).

**Componentes:**
- 1 LED vermelho
- 1 resistência de 220 Ω
- 1 fonte de energia (pilha de 9V)
- 1 Botão

**Regras:**
- Monte o circuito com o botão entre a fonte e o LED.
- Utilize a resistência para proteger o LED.
- O LED deve acender apenas quando o botão for pressionado.
- Teste a simulação.

### 💾 Salvar como: `02 - SeuNome`

## 🧪 ATIVIDADE 3 — Semáforo Simples com Chaves
### **Objetivo:** Reproduzir um semáforo básico usando 3 LEDs e 3 chaves.

**Componentes:**
- 1 LED vermelho
- 1 LED amarelo
- 1 LED verde
- 3 resistências de 220 Ω
- 3 botões
- 1 fonte de 9V
- 1 protoboard

**Regras:**
- Cada botão deve acender um LED de uma cor diferente.
- Respeitar as conexões corretas dos terminais.
- Organize o circuito de forma clara e funcional.

### 💾 Salvar como: `03 - SeuNome`

## 🧪 ATIVIDADE 4 — Acendendo um LED com o Arduino
### **Objetivo:** Substituir a fonte por um Arduino e acender um LED com programação em blocos.

**Componentes:**
- 1 LED vermelho
- 1 resistência de 220 Ω
- 1 Arduino UNO
- 1 protoboard

**Regras:**
- Conecte o LED ao pino digital 13 (através da resistência).
- Use a programação em blocos para acender o LED permanentemente.

### 💾 Salvar como: `04 - SeuNome`

## 🧪 ATIVIDADE 5 — LED com Botão e Arduino
### **Objetivo:** Controlar o LED com um botão usando o Arduino e programação em blocos.

**Componentes:**
- 1 LED vermelho
- 1 resistência de 220 Ω
- 1 botão
- 1 Arduino UNO
- 1 protoboard

**Regras:**
- Conecte o botão ao pino digital 2 e o LED ao pino 13 (com resistência).
- Programe com blocos: se o botão for pressionado, o LED acende.
- Se o botão não estiver pressionado, o LED permanece apagado.
- Dica: use o bloco “se... então...” e “ler pino digital”.

### 💾 Salvar como: `05 - SeuNome`

## 🧪 ATIVIDADE 6 — Semáforo com Arduino
### **Objetivo:** Simular um semáforo com Arduino controlando 3 LEDs em sequência com tempo.

**Componentes:**
- 1 LED vermelho
- 1 LED amarelo
- 1 LED verde
- 3 resistências de 220 Ω
- 1 Arduino UNO
- 1 protoboard

**Regras:**
- Conecte os LEDs aos pinos 10 (vermelho), 9 (amarelo) e 8 (verde).
- Programe com blocos: o Arduino deve simular o funcionamento de um semáforo.
- Sequência sugerida:
	- Verde acende por 3 segundos
	- Apaga o verde e acende o amarelo por 1 segundo
	- Apaga o amarelo e acende o vermelho por 3 segundos
	- Reinicia o ciclo

### 💾 Salvar como: `06 - SeuNome`

## 🧪 Desafio 1 — Cruzamento Semáforo com Arduino
### **Objetivo:** Simular um semáforo duplo com Arduino controlando 6 LEDs.

**Componentes:**
- 1 LED vermelho
- 1 LED amarelo
- 1 LED verde
- 3 resistências de 220 Ω
- 1 Arduino UNO
- 1 protoboard

**Regras:**
- Sequência sugerida:
	- Vermelho acende por 4 segundos
	- Apaga o Vermelho e acende o amarelo por 1 segundo
	- Apaga o amarelo e acende o verde por 3 segundos
  - Não deve haver delay entre um leg apagar e o outro ascender
	- Reinicia o ciclo

### 💾 Salvar como: `Desafio 01 - SeuNome`

## 🧪 Desafio 2 — Cruzamento Semáforo com Arduino
### **Objetivo:** Simular um semáforo duplo com Arduino controlando 6 LEDs.

**Componentes:**
- 1 LED RGB
- 1 resistências de 220 Ω
- 1 Arduino UNO
- 1 protoboard

**Regras:**
- Sequência sugerida:
	- Vermelho acende por 4 segundos
	- Apaga o Vermelho e acende o amarelo por 1 segundo
	- Apaga o amarelo e acende o verde por 3 segundos
  - Não deve haver delay entre um leg apagar e o outro ascender
	- Reinicia o ciclo

### 💾 Salvar como: `Desafio 02 - SeuNome`