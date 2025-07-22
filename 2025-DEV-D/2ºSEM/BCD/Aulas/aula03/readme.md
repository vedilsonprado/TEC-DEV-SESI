# 👨🏻‍💻 Técnico em Desenvolvimento de Sistemas - TURMA DEV-Clarios
## 🤖 BANCO DE DADOS - Aula 03 - Tipos de Atributos e Entidades
|Objetivo:|
|-|
|Desenvolver capacidades técnicas e socioemocionais relativas à criação da estrutura para armazenamento, manipulação e persistência de dados.|

### O que são Atributos?
**Definição:** São propriedades (características) que identificam as entidades. 
Uma entidade é representada por um conjunto de atributos. 

**Tipos de atributos:**
- **Atributo Simples**: Recebe um valor único a cada ocorrência da entidade. 
	- **Exemplo**: Cada CLENTE possui apenas um NOME e um CPF.
- **Atributo Composto**: O seu conteúdo é formado por vários itens menores. 
	- **Exemplo**: O ENDEREÇO de um CLIENTE poderá ser dividido em vários outros atributos, como RUA, CIDADE, etc.
- **Atributo Multivalorado**: O seu conteúdo é formado por mais de um valor. 
	- **Exemplo**: Cada CLENTE poderá ter mais de um TELEFONE.
- **Atributo Determinante**: Identifica de forma única uma entidade, ou seja, não pode se repetir.
	- **Exemplo**: Cada CLENTE terá um CPF, Matrícula, chave primária. Esse valor nunca se repetirá, sendo um valor único para cada cliente.
- **Atributo Derivado**: São valores obtidos após algum processamento das informações do próprio banco de dados.
	- **Exemplo**: idade de um cliente, tempo de locação, total de mídias locadas por cliente, todos são atributos derivados. **idade = dataAtual – dataNascimento**

### O que são Entidades?
**Definição:** Conjunto de objetos ou conceito identificáveis no mundo real sobre os quais deseja-se manter informações no banco de dados.

**Tipos de entidades:**
- **Entidade Forte**: É um tipo de entidade em um modelo de banco de dados que possui uma chave primária única, o que a torna independente de outras entidades para ser identificada.

	Isso significa que cada registro dessa entidade pode ser unicamente identificada por seus próprios atributos, sem necessidade de referenciar qualquer outra entidade.

- **Entidade Fraca**:Uma entidade fraca é um tipo de entidade em um modelo de banco de dados que não pode ser unicamente identificada por seus próprios atributos.
 
	Ela depende de uma entidade forte, através de uma relação de existência, para garantir sua identificação única dentro do banco de dados.

- **Entidade Associativa**: Também conhecida como uma "tabela associativa", é usada para implementar relações muitos-para-muitos (N:N) entre duas entidades em um modelo de banco de dados.
	
	Esta entidade captura a associação entre as entidades participantes e pode armazenar atributos adicionais que estão diretamente relacionados à associação.

	Esse tipo de entidade surge quando há a necessidade de associar uma entidade a um relacionamento existente. 
	
	Sempre acontecerá na relação de muitos para muitos

## Conhecimentos Trabalhados:
- 1. Sistema Gerenciador de Banco de Dados (SGBD)
	- 1.4. Estrutura
		- 1.4.1.Tabela
		- 1.4.2.Registro
		- 1.4.3.Campo
		- 1.4.4.Tipos de dados
- 2. Modelo relacional
	- 2.1. Modelagem
		- 2.1.2.Modelo Entidade Relacionamento - MER
		- 2.1.3.Diagrama Entidade Relacionamento - DER
## Capacidade técnica trabalhada:
- 4. Elaborar diagramas de modelagem do banco de dados de acordo com a arquitetura definida
- 5. Utilizar relacionamentos entre as tabelas do banco de dados

### Critérios Críticos trabalhados:
 - Produziu diagramas de modelagem em conformidade com a arquitetura definida apresentando representação das entidades, relacionamentos, atributos e chaves.
 - Estabeleceu relacionamentos entre as tabelas definindo chaves primárias e estrangeiras com integridade referencial entre as tabelas. 

### Critérios Desejáveis trabalhados:
- Fez uso de notações apropriadas e convenções visuais eficientes para produzir diagramas de modelagem em conformidade com a arquitetura definida apresentando representação das entidades, relacionamentos, atributos e chaves.
- Fez uso boas práticas para estabelecer relacionamentos entre as tabelas ao definir chaves primárias e estrangeiras observando a consistência dos dados.



## Para Saber Mais
Video Aula

## [Slides Aula 03](../aula01/aula03.pdf)