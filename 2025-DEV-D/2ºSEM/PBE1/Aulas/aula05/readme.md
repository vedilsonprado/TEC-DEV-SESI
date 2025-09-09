# 👨🏻‍💻 Técnico em Desenvolvimento de Sistemas - TURMA MANGAL DEV-D 2025

## 🍵 Programação Backend - Aula 05 - Revisão - POO Aplicada em Projeto Real: Sistema de Mecânica
|Objetivo:|
|-|
|Consolidar os pilares da Programação Orientada a Objetos (POO) aplicados em um sistema de mecânica automotiva, explorando conceitos como abstração, encapsulamento, herança e polimorfismo em um projeto real.|

---

## Estrutura do Projeto

- **Pessoa.java** → Classe genérica para representar qualquer pessoa (cliente ou funcionário).  
- **Cliente.java** → Especialização de `Pessoa`.  
- **Funcionario.java** → Outra especialização de `Pessoa`, com atributo extra `cargo`.  
- **Carro.java** → Representa o carro de um cliente.  
- **Servico.java** → Representa um serviço realizado em um carro, atribuído a um funcionário.  
- **SistemaMecanica.java** → Classe principal (`main`) que organiza a interação entre os objetos.  

---

## Pilar 1 - Abstração

A abstração foca apenas nas informações essenciais.

**Exemplo:**  
A classe `Carro` guarda apenas o que importa para o contexto da oficina: **modelo, placa e dono**.

```java
public class Carro {
    private String modelo;
    private String placa;
    private Cliente dono;
}
````

> 👉 Não precisamos guardar “quantos cavalos de potência o carro tem” se a oficina só precisa de identificação e vínculo ao cliente.

----

## Pilar 2 - Encapsulamento

Atributos ficam privados e acessados via getters e setters, garantindo segurança e controle.

````java
public class Pessoa {
    protected String nome;
    protected String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}
````

> 👉 Com isso, os dados não ficam expostos diretamente e podem ser validados antes de mudar.

----

## Pilar 3 - Herança

Permite criar hierarquias, reaproveitando código.

- `Cliente` e `Funcionario` **herdam de Pessoa.**
- Ambos compartilham **nome** e **telefone**, mas têm comportamentos próprios.


#### `Cliente`
````java
public class Cliente extends Pessoa {
    public Cliente(String nome, String telefone) {
        super(nome, telefone);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cliente: " + getNome() + " | Tel: " + getTelefone());
    }
}
````

#### `Funcionario`

````java
public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String telefone, String cargo) {
        super(nome, telefone);
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Funcionário: " + getNome() + " | Cargo: " + cargo);
    }
}
````
----

## Pilar 4 - Polimorfismo

Um mesmo método pode se comportar de formas diferentes.

- `exibirInfo()` é sobrescrito em **Cliente** e **Funcionario**.
- A chamada é a mesma, mas a saída depende do objeto.

````java
Pessoa p1 = new Cliente("João", "1111-2222");
Pessoa p2 = new Funcionario("Maria", "3333-4444", "Mecânica");

p1.exibirInfo(); // Cliente: João | Tel: 1111-2222
p2.exibirInfo(); // Funcionário: Maria | Cargo: Mecânica
````

----

## O Papel do `this`

Dentro dos construtores e métodos, this diferencia o atributo da instância do parâmetro recebido:

````java
public Carro(String modelo, String placa, Cliente dono) {
    this.modelo = modelo; // "this" indica que é o atributo da classe
    this.placa = placa;
    this.dono = dono;
}
````
## A Classe `Main`

No sistema, o ponto de entrada é a classe SistemaMecanica, que possui o método main:

````java
public class SistemaMecanica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente("Ana", "9999-8888");
        Funcionario funcionario = new Funcionario("Carlos", "5555-4444", "Mecânico");
        Carro carro = new Carro("Civic", "ABC-1234", cliente);
        Servico servico = new Servico("Troca de óleo", 150.0, carro, funcionario);

        cliente.exibirInfo();
        funcionario.exibirInfo();
        System.out.println("Serviço: " + servico.getDescricao() + " - R$" + servico.getValor());
    }
}
````

## Usando o `super`
O super é um dos pontos-chave quando começamos a lidar com herança em Java. Ele tem dois usos principais, ambos aparecendo no seu projeto da oficina mecânica:

#### 1. Chamar o construtor da classe pai

Quando uma classe filha herda de uma classe pai, ela pode (e geralmente deve) **aproveitar o construtor da superclasse** para inicializar atributos herdados.

No seu código, por exemplo:
````java
public class Cliente extends Pessoa {
    public Cliente(String nome, String telefone) {
        super(nome, telefone); // chama o construtor da classe Pessoa
    }
}
````
Aqui, `super(nome, telefone)` está chamando o construtor da classe Pessoa, que já sabe como inicializar `nome` e `telefone`.
> 👉 Isso evita duplicação de código e mantém a lógica centralizada na superclasse.

#### 2. Acessar métodos ou atributos da classe pai

Além dos construtores, super pode ser usado dentro de métodos da classe filha para invocar métodos já definidos na classe pai.

Exemplo adaptado ao seu projeto:

````java
public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String telefone, String cargo) {
        super(nome, telefone); // inicializa parte herdada
        this.cargo = cargo;    // inicializa parte específica
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // poderia chamar a versão da classe Pessoa
        System.out.println("Cargo: " + cargo);
    }
}
````
Se a classe `Pessoa` tivesse um `exibirInfo()` básico, poderíamos reaproveitá-lo e apenas **adicionar detalhes específicos** do `Funcionario`.

👉 Resumindo:

- Use `super(...)` no construtor para aproveitar a inicialização feita na classe pai.
- Use `super.metodo()` quando quiser reutilizar ou complementar um comportamento já definido na superclasse.



---

## Conhecimentos Trabalhados
- 4. Programação orientada a objetos
	- 4.1. Definição
	- 4.2. Pacotes
	- 4.3. Classes
		- 4.3.1. Abstrata
		- 4.3.4. Atributos
		- 4.3.5. Métodos
		- 4.3.6. Modificadores de acesso (encapsulamento)
	- 4.4. Objetos
	- 4.6. Polimorfismo
	- 4.8. Relacionamentos de objetos
		- 4.8.1. Herança

- 5. Documentação
	- 5.1. Diagrama de classes

---

## Capacidade Técnica Desenvolvida
- 1. Utilizar o paradigma da programação orientada a objetos
- 2. Elaborar diagramas de classe  
- 3. Aplicar técnicas de código limpo (clean code) 

### Critérios Críticos trabalhados:
- Distinguiu corretamente as entidades, atributos e métodos do sistema, demonstrando a compreensão do domínio na utilização de cada um.
- Criou diagramas de classe UML, representando as entidades do sistema e seus relacionamentos (herança, agregação, composição)
- Aplicou práticas de clean code no código Java, demonstrando a capacidade de escrever código legível, organizado e de acordo com um guia de estilo.

### Critérios Desejáveis trabalhados:
- Implementou as classes das entidades em Java, incluindo atributos, construtores e métodos básicos, demonstrando a capacidade de traduzir o modelo conceitual em código.
- Justificou as escolhas de modelagem e os tipos de relacionamentos utilizados nos diagramas de classe, demonstrando a compreensão dos conceitos e sua aplicação no contexto do sistema. 
- Analisou um trecho de código Java com problemas de clean code e propõe soluções para refatorar o código, demonstrando a capacidade de identificar e corrigir problemas de legibilidade e organização. 

---

## Para Saber Mais
📑 [Slides Aula 05](../aula05/prjMecanicaVrumVrum/)
