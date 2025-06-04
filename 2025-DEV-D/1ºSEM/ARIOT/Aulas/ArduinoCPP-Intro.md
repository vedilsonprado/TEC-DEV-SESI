# Introdução ao C++ com Arduino - Comandos Básicos do Arduino
Nesta aula, vamos aprender os primeiros comandos fundamentais para controlar componentes eletrônicos com Arduino, utilizando a linguagem C++. Vamos entender como configurar pinos, ler entradas e exibir informações no monitor serial.

## 🎯 Objetivo da Aula:
- Entender o que é e como usar pinMode, digitalRead, digitalWrite, Serial.begin() e Serial.println().
- Ler entradas de sensores ou botões.
- Enviar informações para o computador pelo monitor serial.

## 🔌 pinMode(pin, modo)
Define o modo de funcionamento de um pino digital: se será de entrada (INPUT) ou de saída (OUTPUT).

| Exemplo               | Explicação                                          |
| --------------------- | --------------------------------------------------- |
| `pinMode(13, OUTPUT)` | O pino 13 será usado para enviar sinais (ex: LED)   |
| `pinMode(2, INPUT)`   | O pino 2 será usado para receber sinais (ex: botão) |


## ⚙️ Exemplo: Configurar um LED como saída

````cpp
void setup() {
  pinMode(13, OUTPUT); // LED no pino 13
}

void loop() {
  digitalWrite(13, HIGH); // Liga o LED
  delay(1000);
  digitalWrite(13, LOW);  // Desliga o LED
  delay(1000);
}
````

## 📥 digitalRead(pin)
Lê o valor de um pino de entrada. Retorna HIGH (1) se estiver em nível alto ou LOW (0) se estiver em nível baixo.

## ⚙️ Exemplo: Ler botão e acender LED
````cpp
void setup() {
  pinMode(2, INPUT);     // Botão no pino 2
  pinMode(13, OUTPUT);   // LED no pino 13
}

void loop() {
  int estadoBotao = digitalRead(2);
  digitalWrite(13, estadoBotao); // Copia o estado do botão para o LED
}
````
> 💡 Dica: Use INPUT_PULLUP para ativar um resistor interno e evitar ruídos:<BR>pinMode(2, INPUT_PULLUP);


## 📥 digitalRead(pin)
Lê o valor de um pino de entrada. Retorna HIGH (1) se estiver em nível alto ou LOW (0) se estiver em nível baixo.

## ⚙️ Exemplo: Ler botão e acender LED
````cpp
void setup() {
  pinMode(2, INPUT);     // Botão no pino 2
  pinMode(13, OUTPUT);   // LED no pino 13
}

void loop() {
  int estadoBotao = digitalRead(2);
  digitalWrite(13, estadoBotao); // Copia o estado do botão para o LED
}
````
> 💡 Dica: Use INPUT_PULLUP para ativar um resistor interno e evitar ruídos: