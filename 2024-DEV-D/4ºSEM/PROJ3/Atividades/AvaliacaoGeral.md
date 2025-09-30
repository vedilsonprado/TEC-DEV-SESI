# Avaliação Geral em Preparação para o SAEP

## 📁 1. ORIENTAÇÕES GERAIS 

- Desligue e guarde o seu dispositivo inteligente (smartphone, smartwatch ou qualquer dispositivo
com acesso a internet).
- Proibido o uso de internet.
- Antes de iniciar a avaliação, leia atentamente as instruções contidas neste documento e esclareça as dúvidas com o avaliador, caso necessário.
- Para a execução desta prova estão disponíveis máquinas, equipamentos, instrumentos,
ferramentas, materiais de consumo e/ou toda a documentação técnica necessária.
- Ao realizar as atividades, lembre-se de cumprir todas as exigências referentes às normas de saúde, segurança do trabalho e de meio ambiente.
- Ao final da avaliação, este caderno e demais itens disponibilizados devem ser devolvidos ao
avaliador.
- Em caso de dúvida, dirija-se somente ao avaliador.

## 📁 2. CONTEXTUALIZAÇÃO

Uma livraria de médio porte enfrenta desafios críticos na gestão de estoque devido à falta de um
sistema informatizado para controlar a entrada e saída de livros e materiais de papelaria. Isso
resulta em ausência de títulos muito procurados em momentos de alta demanda, além do acúmulo
de edições antigas e pouco vendidas, o que aumenta custos e ocupa espaço desnecessário no
estoque.<BR><BR>
Entre os itens comercializados estão livros de diferentes gêneros (romances, técnicos, didáticos),cada um com especificidades como ISBN, autor, editora e edição. Também há variações em
papelaria, como cadernos, canetas e agendas, cada qual com características próprias de cor,
tamanho e marca. Essa diversidade de produtos exemplifica a complexidade da gestão, que exige
um controle preciso e detalhado.

## 📁 3. RESULTADOS E ENTREGAS ESPERADAS
|Nº|Nome da Entrega|Tipo de Entrega|
|--|---------------|---------------|
|1 | Lista de requisitos funcionais |Documentação de requisitos|
|2|Diagrama entidaderelacionamento (DER)|Modelagem do banco de dados|
|3|Script de criação e população do banco de dados|Desenvolvimento do banco de dados|
|4|Interface de autenticação de usuários (login)|Desenvolvimento do sistema|
|5|Interface cadastro de produto|Desenvolvimento do sistema|
|6|Interface gestão de estoque|Desenvolvimento do sistema|
|7|Interface principal do sistema|Desenvolvimento do sistema|
|8|Descritivo de Casos de Teste de Software|Documentação de testes|
|9|Lista de requisitos de infraestrutura|Documentação do sistema|

- 1 - Lista de requisitos funcionais
	- 1.1. Descrever os requisitos funcionais do sistema.
	- 1.2. Entrega consiste em preencher o item ENTREGA 01 – Requisitos Funcionais do ANEXO III – documentacao.docx, ou formato previamente acordado com o avaliador.
- 2 - Diagrama entidade relacionamento (DER)
	- 2.1. Entregar o DER em formato de imagem (.png, .jpeg) ou num formato previamente acordado com o avaliador.
- 3 - Script de criação e população do banco de dados
	- 3.1. Nomear o banco de dados com o nome “saep_db”.
	- 3.2. No script devem existir pelo menos três registros para todas as tabelas criadas, respeitando os tipos de dados, chaves primárias e estrangeiras.
	- 3.3. Entregar o script no formato .sql ou num formato previamente acordado com o avaliador.
- 4 - Interface de autenticação de usuários (login)
	- 4.1. Em caso de falha de autenticação, informar ao usuário o motivo da falha e posteriormente redirecionar novamente à tela de autenticação
	- 4.2. Design e layout da interface ficam à sua escolha.
- 5 - Interface principal do sistema
	- 5.1. Esta interface deve atender aos seguintes requisitos:
		- 5.1.1. Exibir nome do usuário logado.
		- 5.1.2. Desenvolver um meio para o usuário fazer logout, redirecionando à tela de login desenvolvida no item 4.
		- 5.1.3. Desenvolver um meio de acessar a interface de "Cadastro de Produto", a qual será implementada no item 6.
		- 5.1.4. Desenvolver um meio para acessar a interface "Gestão de Estoque", a qual será implementada no item 7.
		- 5.1.5. Design e layout da interface ficam à sua escolha.
- 6 - Interface cadastro de produto
	- 6.1. Esta interface deve atender aos seguintes requisitos:
		- 6.1.1. Listar os produtos cadastrados no banco de dados conforme item 3.2. Esta listagem deve ser realizada em uma tabela e os dados devem ser carregados automaticamente ao acessar a interface de cadastro de produto.
		- 6.1.2. Implementar um campo de busca para que o usuário possa inserir o termo de busca, o qual, após inserção e confirmação, deverá gerar a atualização da listagem dos valores da tabela com os registros que correspondem ao termo.
		- 6.1.3. Desenvolver um meio para o usuário inserir os dados de um novo produto no banco de dados.
		- 6.1.4. Desenvolver um meio para o usuário realizar a edição de um produto existente no banco de dados.
		- 6.1.5. Desenvolver um meio para o usuário realizar a exclusão de um produto existente no banco de dados.
		- 6.1.6. Realizar validações dos dados inseridos nos campos para a criação de um novo produto ou a alteração de um existente, exibindo alertas ao usuário nos casos de ausência de inserção ou inserção inválida de dados.
		- 6.1.7. Desenvolver um meio para o usuário retornar para a interface principal do sistema, desenvolvida no item 5.
		- 6.1.8. Design e layout da interface ficam à sua escolha.
- 7 - Interface gestão de estoque
	- 7.1. Esta interface deve atender aos seguintes requisitos:
		- 7.1.1. Listar os produtos cadastrados no banco de dados conforme item 3.2. em ordem alfabética. Utilizar um algoritmo de ordenação para tal, ficando a seu critério qual algoritmo aplicar.
		- 7.1.2. Desenvolver um meio de selecionar o produto que terá movimentação de estoque, habilitando a opção de escolha por parte do usuário, se será uma movimentação de "entrada" ou "saída".
		- 7.1.3. Desenvolver um meio do usuário inserir a data da movimentação que ele está realizando, seja de entrada ou saída.
		- 7.1.4. Implementar uma verificação automática a cada movimentação de saída de estoque, gerando um alerta em caso de estoque abaixo do mínimo configurado.
		- 7.1.5. Design e layout da interface ficam à sua escolha.
- 8 - Descritivo de teste de software
	- 8.1 Descrever ferramentas, ambiente e os casos de teste de software para cada requisito funcional.
	- 8.2 Entrega consiste em preencher o item 8.1 (Casos de Teste) e item 8.2 (Ferramentas e Ambientes de Teste) do ANEXO III – documentacao.docx, ou formato previamente acordado com o avaliador.
- 9 - Lista de requisitos de infraestrutura
	- 9.1. A lista de requisitos de infraestrutura deve conter os seguintes itens:
		- 9.1.1. O SGBD utilizado e sua respectiva versão.
		- 9.1.2. A linguagem de programação e versão utilizada no desenvolvimento do sistema.
		- 9.1.3. O sistema operacional utilizado e sua versão no desenvolvimento do sistema.
	- 9.2. Entrega consiste em preencher o item ENTREGA 9 – Lista de requisitos de infraestrutura do anexo ANEXO III - documentacao.docx, ou formato previamente acordado com o avaliador.

## 📁 4. FORMATO DAS ENTREGAS
Efetuar as entregas no seguinte formato:
 - Uma pasta compactada (formato .zip, .rar ou .7zip) nomeada com seu nome completo, contendo os seguintes arquivos:
	- Lista de requisitos funcionais (entrega 1)
	- Diagrama de entidade e relacionamento (DER) (entrega 2).
	- Script de criação e população do banco de dados (entrega 3).
	- Uma pasta chamada “sistema” contendo os arquivos do código-fonte do sistema desenvolvido (entregas 4, 5, 6 e 7).
	- Descritivo de Casos de Teste de Software (entrega 8).
	- Lista de requisitos de infraestrutura (entrega 9).