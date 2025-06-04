# 📘 06-04 | AT02 iot - IoT com Arduino (Blocos)

**👨🏻‍🏫 Enviar os arquivos no Thikercad**

## 🧪 10 — Acender e apagar LED manualmente

### **Objetivo:** Acender o LED 13 por 2 segundos e apagar por 2 segundos, repetindo.

**Componentes:**
- 1 LED no pino 13
- 1 resistor 220 Ω
- Arduino UNO
- Protoboard

**Montagem:**
- LED com resistor conectado ao pino 13 e GND.

**Lógica:**
- Usar digitalWrite(13, HIGH); para acender LED.
- delay(2000); para esperar 2 segundos.
- digitalWrite(13, LOW); para apagar LED.
- delay(2000); para esperar 2 segundos.
- Repetir no loop().

### 💾 Salvar como: `AT10 - SeuNome`

## 🧪 11 — Incrementar variável int e mostrar no Serial

### **Objetivo:**  Criar variável int, incrementar de 0 até 10, imprimindo a cada segundo.

**Componentes:**
- Arduino UNO

**Montagem:**
- LED com resistor conectado ao pino 13 e GND.

**Lógica:**
- Criar int contador = 0;
- No loop, imprimir contador no Serial.
- Incrementar contador com contador = contador + 1;
- delay(1000);
- Não usar condicional para reiniciar (pode passar de 10).

### 💾 Salvar como: `AT11 - SeuNome`

## 🧪 12 — Usar variável bool para ligar/desligar LED estático

### **Objetivo:**   Usar variável bool para ligar/desligar LED estático

**Componentes:**
- LED no pino 13
- Resistor 220 Ω
- Arduino UNO

**Lógica:**
- Declarar bool estadoLED = true;
- No setup(), usar digitalWrite(13, estadoLED); para ligar LED.
- No loop(), não fazer nada.

### 💾 Salvar como: `AT12 - SeuNome`

## 🧪 13 — Variável float e incremento no Serial

### **Objetivo:** Mostrar uma variável float iniciando em 0.0 e incrementar 0.1 a cada segundo.

**Componentes:**
- Arduino UNO

**Lógica:**
- Criar float valor = 0.0;
- No loop, imprimir valor no Serial.
- Incrementar valor += 0.1;
- Usar delay de 1000ms.

### 💾 Salvar como: `AT13 - SeuNome`

## 🧪 14 — Variável float e incremento no Serial

### **Objetivo:** Fazer LED piscar alternando ligado e desligado a cada segundo usando contador e %.

**Componentes:**
- LED no pino 13
- Resistor 220 Ω
- Arduino UNO

**Lógica:**
- Criar int contador = 0;
- No loop incrementar contador com contador++
- Usar digitalWrite(13, contador % 2); para alternar LED ON/OFF
- Delay 1000 ms.

### 💾 Salvar como: `AT14 - SeuNome`

## 🧪 15 — Multiplicação simples com variável int

### **Objetivo:** Mostrar resultado de tempo * fator no Serial, onde tempo é 2 e fator é 100.

**Componentes:**
- Arduino UNO

**Lógica:**
- Declarar int tempo = 2; int fator = 100; int resultado;
- No loop calcular resultado = tempo * fator;
- Imprimir resultado no Serial a cada 1 segundo.

### 💾 Salvar como: `AT15 - SeuNome`

## 🧪 16 — Multiplicação simples com variável int

### **Objetivo:** Mostrar no Serial a conversão de milissegundos para segundos.

**Componentes:**
- Arduino UNO

**Lógica:**
- Criar int milissegundos = 5000;
- Calcular int segundos = milissegundos / 1000;
- Imprimir segundos no Serial a cada 1 segundo.

### 💾 Salvar como: `AT16 - SeuNome`

## 🧪 17 — Piscar LED com variável bool alternando

### **Objetivo:** Alternar variável bool que controla LED a cada 500 ms para piscar.

**Componentes:**
- LED pino 13
- Resistor 220 Ω
- Arduino UNO

**Lógica:**
- Declarar bool estadoLED = false;
- No loop inverter estadoLED = !estadoLED;
- Aplicar digitalWrite(13, estadoLED);
- Delay 500 ms.

### 💾 Salvar como: `AT17 - SeuNome`

## 🧪 18 — Incremento float com reset por operador ternário

### **Objetivo:** Incrementar float de 0.0 até 1.0, depois resetar para 0.0 usando expressão ternária.

**Componentes:**
- Arduino UNO

**Lógica:**
- Declarar float valor = 0.0;
- Incrementar valor += 0.1;
- Resetar com: valor = (valor >= 1.0) ? 0.0 : valor;
- Imprimir no Serial a cada 1 segundo.

### 💾 Salvar como: `AT18 - SeuNome`

## 🧪 19 — Contador usando variável long e millis()

### **Objetivo:** Mostrar tempo decorrido em milissegundos usando long e millis().

**Componentes:**
- Arduino UNO

**Lógica:**
- Declarar long inicio = millis(); no setup()
- No loop calcular long agora = millis(); long decorrido = agora - inicio;
- Imprimir decorrido no Serial a cada 1 segundo.

### 💾 Salvar como: `AT19 - SeuNome`

## 🧪 20 — Semáforo Simples com Contador de Ciclos

### **Objetivo:** Criar um sistema de semáforo simples (3 LEDs) que alterna automaticamente entre os estados VERMELHO, VERDE e AMARELO com tempos diferentes. O sistema deve contar e mostrar no Serial Monitor quantos ciclos completos foram executados.

**Componentes:**
- 1 LED vermelho
- 1 LED amarelo
- 1 LED verde
- 3 resistores de 220 Ω
- Arduino UNO
- Protoboard

🔧 Regras:
- O LED VERDE deve ficar aceso por 3 segundos
- O LED AMARELO deve ficar aceso por 1 segundo
- O LED VERMELHO deve ficar aceso por 3 segundos
- Após um ciclo completo (verde → amarelo → vermelho), o Arduino deve:
	- Aumentar uma variável de contagem
	- Imprimir no Serial Monitor: "Ciclo número: X"

**Lógica:**
- Use 3 variáveis com os pinos dos LEDs (ledVerde, ledAmarelo, ledVermelho)
- Use uma variável int ciclo = 0; para contar os ciclos
- No loop(), acenda os LEDs na sequência, usando digitalWrite e delay()
- Após o vermelho, incremente ciclo com ciclo = ciclo + 1;
- Use Serial.begin(9600); no setup() e Serial.println() no loop() para mostrar o número de ciclos no monitor serial

### 💾 Salvar como: `AT20 - SeuNome`
