# Introdução ao C++ com Arduino - Operadores Matemáticos e Lógicos
Nesta aula, vamos entender o que são operadores lógicos e como usá-los para criar decisões e condições mais inteligentes no Arduino.

## 🎯 Objetivo da Aula:
- Conhecer os operadores matemáticos básicos e como usá-los.
- Entender como os operadores lógicos ajudam em decisões simples.
- Aplicar operadores em exemplos práticos no Arduino.

## ➕ Operadores Matemáticos
Os operadores matemáticos (ou aritméticos) servem para fazer contas com números:

| Operador | Nome           | Exemplo  | Resultado |
| -------- | -------------- | -------- | --------- |
| `+`      | Soma           | `3 + 2`  | `5`       |
| `-`      | Subtração      | `5 - 1`  | `4`       |
| `*`      | Multiplicação  | `4 * 3`  | `12`      |
| `/`      | Divisão        | `10 / 2` | `5`       |
| `%`      | Módulo (resto) | `7 % 3`  | `1`       |


## ✅ Exemplos:

### ➕ Soma (+)

````cpp
int a = 4;
int b = 6;
int resultado;

void setup() {
  Serial.begin(9600);
  resultado = a + b;
  Serial.println(resultado); // Resultado: 10
}

void loop() {

}
````

- Contador de tempo para piscar LED
````cpp
int contador = 0;

void setup() {
  Serial.begin(9600);
}

void loop() {
  contador = contador + 1;
  Serial.println(contador);
  delay(1000);
}
````

### ➖ Subtração (-)

````cpp
int a = 10;
int b = 3;
int resultado;

void setup() {
  Serial.begin(9600);
  resultado = a - b;
  Serial.println(resultado); // Resultado: 7
}

void loop() {

}
````

- Contagem regressiva a partir de 10
````cpp
int tempoRestante = 10;

void setup() {
  Serial.begin(9600);
}

void loop() {
  tempoRestante = tempoRestante - 1;
  Serial.println(tempoRestante);
  delay(1000);
}
````

### ✖️ Multiplicação (*)

````cpp
int a = 5;
int b = 4;
int resultado;

void setup() {
  Serial.begin(9600);
  resultado = a * b;
  Serial.println(resultado); // Resultado: 20
}

void loop() {}
````

- Calcular valor proporcional ao tempo
````cpp
int tempo = 2;
int fator = 100;
int resultado = 0;

void setup() {
  Serial.begin(9600);
}

void loop() {
  resultado = tempo * fator;
  Serial.println(resultado);
  delay(1000);
}
````

### ➗ Divisão (/)

````cpp
int a = 20;
int b = 4;
int resultado;

void setup() {
  Serial.begin(9600);
  resultado = a / b;
  Serial.println(resultado); // Resultado: 5
}

void loop() {

}
````

- Converter milissegundos para segundos
````cpp
int milissegundos = 5000;
int segundos = 0;

void setup() {
  Serial.begin(9600);
}

void loop() {
  segundos = milissegundos / 1000;
  Serial.println(segundos);
  delay(1000);
}
	
````

### 🧮 Módulo (%)

````cpp
int a = 7;
int b = 3;
int resultado;

void setup() {
  Serial.begin(9600);
  resultado = a % b;
  Serial.println(resultado); // Resultado: 1 (resto da divisão)
}

void loop() {

}
````

- Acende e apaga LED alternando a cada ciclo
````cpp
int contador = 0;

void setup() {
  pinMode(13, OUTPUT);
}

void loop() {
  contador = contador + 1;
  digitalWrite(13, contador % 2); // 1 = acende, 0 = apaga
  delay(1000);
}
````

> 💡 Dica: Use operadores matemáticos para criar comportamentos dinâmicos em seu código, como contagens, cálculos de tempo, ajustes de brilho e movimento. Sempre que o valor precisa mudar com base em outro, pense em usar +, -, *, / ou %.

## 🔗 Operadores Lógicos
Os operadores lógicos trabalham com valores booleanos (verdadeiro ou falso) e são muito usados em condições.
| Operador | Nome       | Descrição                                              | Exemplo   |
| -------- | ---------- | ------------------------------------------------------ | --------- |
| `&&`     | E lógico   | Verdadeiro se **ambas** as condições forem verdadeiras | `A && B`  |
| `\\`     | OU lógico  | Verdadeiro se **pelo menos uma** for verdadeira        | `A \\ B`  |
| `!`      | NÃO lógico | Inverte o valor lógico (true ↔ false)                  | `!A`      |

### ⚙️ Exemplo: Botões em paralelo com || (OU)
- Acender o LED se qualquer um dos dois botões estiver pressionado.

````cpp
const int botao1 = 2;
const int botao2 = 3;
const int led = 13;

void setup() {
  pinMode(botao1, INPUT_PULLUP);
  pinMode(botao2, INPUT_PULLUP);
  pinMode(led, OUTPUT);
}

void loop() {
  bool estado1 = digitalRead(botao1) == LOW;
  bool estado2 = digitalRead(botao2) == LOW;

  digitalWrite(led, estado1 || estado2); // Acende se qualquer botão estiver pressionado
}
````
### ⚙️ Exemplo: Botões em série com && (E)
- Só acende o LED se dois botões estiverem pressionados
````cpp
void setup() {
  pinMode(2, INPUT);
  pinMode(3, INPUT);
  pinMode(13, OUTPUT);
}

void loop() {
  bool botao1 = digitalRead(2);
  bool botao2 = digitalRead(3);

  if (botao1 && botao2) {
    digitalWrite(13, HIGH);
  } else {
    digitalWrite(13, LOW);
  }
}
````

### ⚙️ Exemplo: Invertendo lógica com ! (NÃO)
- Só acende o LED se dois botões estiverem pressionados
````cpp
void setup() {
  pinMode(2, INPUT);
  pinMode(13, OUTPUT);
}

void loop() {
  bool botao = digitalRead(2);
  digitalWrite(13, !botao);  // Acende o LED quando o botão NÃO está pressionado
}
````

> 💡 Dica:
Operadores lógicos são muito úteis quando você precisa tomar decisões baseadas em múltiplas condições. Por exemplo: <BR>
&& (E) → Tudo deve ser verdadeiro para a condição funcionar. <br>
|| (OU) → Basta uma condição ser verdadeira.<br>
! (NÃO) → Inverte o valor lógico (true vira false e vice-versa).