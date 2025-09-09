# 🔧 Sistema de Mecânica Automotiva

Um projeto educacional em **Java** desenvolvido para demonstrar na prática os **pilares da Programação Orientada a Objetos (POO)**.  
O sistema simula a gestão de uma oficina mecânica, permitindo cadastrar **clientes, funcionários, carros e serviços**, explorando conceitos como **abstração, encapsulamento, herança e polimorfismo**.

---

## 🚀 Tecnologias
- [Java 17+](https://openjdk.org/)  
- Estrutura simples em **pacotes** (`model` e `system`)  
- Execução via terminal  

---

## 📂 Estrutura do Projeto
src/<BR>
├── model/<BR>
│ ├── Pessoa.java<BR>
│ ├── Cliente.java<BR>
│ ├── Funcionario.java<BR>
│ ├── Carro.java<BR>
│ └── Servico.java<BR>
└── system/<BR>
└── SistemaMecanica.java<BR>

---

## 📖 Conceitos Aplicados
- **Abstração** → classes como `Carro` e `Servico` representam apenas informações essenciais.  
- **Encapsulamento** → atributos privados acessados por getters e setters.  
- **Herança** → `Cliente` e `Funcionario` herdam de `Pessoa`.  
- **Polimorfismo** → método `exibirInfo()` implementado de formas diferentes em `Cliente` e `Funcionario`.  

---

## 🛠️ Como Executar
1. Clone este repositório:
```bash
git clone https://github.com/seu-usuario/sistema-mecanica.git
````

2. Compile os arquivos Java:
```bash
javac src/model/*.java src/system/SistemaMecanica.java
````


3. Execute o sistema:
```bash
java -cp src system.SistemaMecanica
````
## 📌 Exemplo de Uso
````bash
===== MENU OFICINA =====
1. Cadastrar Cliente
2. Cadastrar Funcionário
3. Cadastrar Carro
4. Registrar Serviço
5. Sair
========================
Escolha uma opção:
````

### Exemplo de execução:

````bash
Cliente: Ana | Tel: 9999-8888
Funcionário: Carlos | Cargo: Mecânico
Serviço: Troca de óleo - R$150.0
````

## 🎯 Objetivo Educacional

Este projeto foi desenvolvido como material didático para o curso **Técnico em Desenvolvimento de Sistemas - SENAI**, turma MANGAL DEV-D 2025.

Ele não visa uso em produção, mas sim servir de base para estudos de POO em Java.
