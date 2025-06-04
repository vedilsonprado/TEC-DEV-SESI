# Introdução ao C++ com Arduino
Este tutorial aborda os fundamentos da programação em C++ no ambiente Arduino. Nessa aula, o foco é entender os diferentes tipos de variáveis e ver como elas funcionam na prática com exemplos simples, médios e complexos.

## 🎯 Objetivo da Aula:
- Entender os principais tipos de variáveis do C++.
- Aprender como declarar e usar cada tipo.
- Testar diferentes níveis com exemplos para cada tipo.

## 🧠 O que é uma variável?
Variáveis são espaços na memória onde você pode guardar informações temporárias para usar no seu programa. Cada variável tem:

- Um tipo (define que tipo de dado ela armazena),
- Um nome (escolhido por você),
- Um valor (que pode mudar durante a execução).

````cpp
int numero = 0;
// int - tipo
// numero - nome
// = - atribuição
// 0 - valor
// ; - encerra o comando
````

## 🧮 Tipos de Variáveis Abordados

### 🎯 bool - Lógico (verdadeiro/falso)
Armazena true (verdadeiro) ou false (falso), 0 ou 1.

````cpp
bool ligado = true;
````

#### Exemplos:
- Inicialização e visualização de variável booleana 

````cpp
bool valor = 0;
// Declarando e inicializando a variável

void setup(){
// Método de inicialização do Arduino
// É executado apenas uma vez
Serial.begin(9600);// Inicializa a comunicação serial com velocidade de 9600 bps
Serial.println(valor);
}

void loop(){
// Método de repetição do Arduino
// É executado repetidamente enquanto o Arduino estiver ligado.
valor = valor + 1;
Serial.println(valor);
delay(2000);
}
````

- Usando diretamente no hardware uma variável booleana
````cpp
bool estadoLED = true; // true = aceso, false = apagado

void setup() {
  pinMode(13, OUTPUT);   // Define o pino 13 como saída
  digitalWrite(13, estadoLED); // Acende o LED se estadoLED for true
}

void loop() {
  // Não faz nada, LED permanece no estado inicial
}
````

- Alternando o estado de variável booleana
````cpp
bool estadoLED = false;  // Começa apagado

void setup() {
  pinMode(13, OUTPUT);     // Define o pino 13 como saída
}

void loop() {
  estadoLED = !estadoLED;  // Inverte o valor: se for true, vira false; se for false, vira true
  digitalWrite(13, estadoLED);  // Aplica o estado atual no LED
  delay(500);  // Espera 0.5 segundos
}
````

> 💡 **Dica:** As variáveis booleanas são ideais para controle de estados simples como "ligado/desligado" ou "ativo/inativo".


### 🔢 int - Números inteiros
Armazena números sem casas decimais.

````cpp
int idade = 15;
````

#### Exemplos:
- Inicialização e visualização de variável int 

````cpp
int valor = 0;

void setup() {
  Serial.begin(9600);      // Inicia comunicação serial
  Serial.println(valor);   // Mostra o valor inicial
}

void loop() {
  // Não faz nada no loop
}
````

- Incrementando valor de variável int 

````cpp
int valor = 0;

void setup() {
  Serial.begin(9600);
}

void loop() {
  valor = valor + 1;        // Soma 1 ao valor atual
  Serial.println(valor);    // Mostra o novo valor
  delay(2000);              // Espera 2 segundos
}
````

- Alternando o estado de variável int

````cpp

int contador = 0;

void setup() {
  pinMode(13, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  contador++;

  // O LED acende quando contador é par, apaga quando é ímpar
  // Usamos o operador % (módulo) para alternar entre 0 e 1
  digitalWrite(13, contador % 2); // 0 (LOW) ou 1 (HIGH)

  Serial.println(contador);

  delay(1000);
}
````

> ❗ **Atenção:** No Arduino (que usa arquitetura de 8 ou 32 bits, dependendo da placa), os limites de int e long variam conforme o tipo de placa, mas nos modelos mais comuns como o Arduino Uno (ATmega328P), temos: <br> **int → 16 bits** <br> Valor mínimo: -32.768 <br> Valor máximo: 32.767<br> **long → 32 bits** <br> Valor mínimo: -2.147.483.648 <br> Valor máximo: 2.147.483.647

### 🔢 long – Números inteiros grandes
O tipo `long` serve para armazenar números inteiros maiores que o tipo int pode suportar. Ele é útil quando você precisa trabalhar com valores grandes, como contadores de tempo, valores acumulados, ou operações com milissegundos.

````cpp
long tempo = 100000;
````

#### Exemplos:
- Inicialização e exibição de variável long

````cpp
long tempo = 30000;  // 30 mil milissegundos = 30 segundos

void setup() {
  Serial.begin(9600);
  Serial.println(tempo);
}

void loop() {
  // Não faz nada no loop
}
````
- Contando o tempo desde que o Arduino foi ligado
````cpp
long inicio;

void setup() {
  Serial.begin(9600);
  inicio = millis();  // Captura o tempo em milissegundos desde que o Arduino ligou
}

void loop() {
  long agora = millis();
  long decorrido = agora - inicio;

  Serial.print("Tempo em milissegundos: ");
  Serial.println(decorrido);

  delay(1000);  // Espera 1 segundo
}
````
> 💡 Dica: Use long sempre que for lidar com funções de tempo como millis() ou micros(), pois elas retornam valores grandes que podem ultrapassar o limite do int.




### 🌊 float – Números Reais (com casas decimais)
O tipo float é usado para representar valores com ponto decimal, como medidas, porcentagens ou valores analógicos.

````cpp
float temperatura = 25.5;
````

#### Exemplos:
- Inicialização e visualização de variável float 

````cpp
float valor = 3.14;

void setup() {
  Serial.begin(9600);
  Serial.println(valor); // Mostra o número com casas decimais
}

void loop() {
  // Nada por enquanto
}
````

- Incrementando valor de variável int 
````cpp
float numero = 1.5;
float resultado;

void setup() {
  Serial.begin(9600);
}

void loop() {
  resultado = numero + 2.5;  // Multiplicando float por outro float
  Serial.println(resultado);
  delay(1000);
}
````

- Incrementando valor de variável int 
````cpp
float valor = 0.0;  // Inicializa a variável float com 0.0

void setup() {
  Serial.begin(9600);  // Inicializa comunicação serial
}

void loop() {
  Serial.println(valor);  // Imprime o valor atual

  valor += 0.1;  // Incrementa valor de 0.1 em 0.1

  // Reinicia o valor quando chegar a 1.0 usando operador ternário
  valor = (valor >= 1.0) ? 0.0 : valor;

  delay(1000);  // Espera 1 segundo
}
````
````cpp 
valor = (valor >= 1.0) ? 0.0 : valor;
//Essa é uma expressão condicional ternária, que funciona assim:
  //Primeiro, é avaliada a condição entre parênteses: valor >= 1.0
    //Se essa condição for verdadeira (ou seja, se o valor for maior ou igual a 1.0),
      //o resultado da expressão será o primeiro valor após o ?, que é 0.0.
    //Se for falsa (valor menor que 1.0),
      //o resultado será o valor após os dois pontos :, que é valor (ou seja, o próprio valor atual, sem mudança).
  //No final, essa expressão atribui a valor o resultado dessa condição: 
    //Se valor passou de 1.0, ele volta para 0.0 (reinicia o ciclo).
    //Caso contrário, continua com o valor atual.
````