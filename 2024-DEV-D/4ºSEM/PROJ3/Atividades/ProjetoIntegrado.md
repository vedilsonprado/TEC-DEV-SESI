# Desenvolvimento do Projeto Integrador

## 📁 1. Documentação Geral do Projeto 
<details>
 <summary>Ver mais</summary>

<details>
	<summary>📌 1.1. Visão do Projeto</summary>

#### 1.1.1. Nome do projeto
**O que é:** Identificador oficial do sistema ou software. <br>
**Exemplo:**
Nome: Sistema de Agendamento Médico Online (SAMEO)
	
#### 1.1.2. Justificativa
**O que é:** Explica por que o projeto é necessário. Pode incluir problemas atuais e os benefícios da solução. <BR>
**Exemplo:** <BR>
O atual processo de marcação de consultas é manual e centralizado por telefone, o que gera atrasos, congestionamento de ligações e insatisfação dos pacientes. A digitalização desse processo trará agilidade, redução de erros e melhora na experiência do usuário.

#### 1.1.3. Objetivo
**O que é:** Declara a finalidade geral do sistema, o que ele se propõe a resolver.
**Exemplo:**
Objetivo: Desenvolver uma plataforma web que permita pacientes agendarem consultas médicas de forma online, otimizando o tempo de atendimento e reduzindo filas nas clínicas.

#### 1.1.4. Público-alvo
**O que é:** Identifica quem usará ou será beneficiado pelo sistema.

**Exemplo:**
- Pacientes de clínicas médicas particulares
- Secretárias e atendentes
- Médicos e administradores das unidades de saúde
<BR><BR>
</details>

<details>
	<summary> 📌 1.2. Escopo</summary>
	
#### 1.2.1. Funcionalidades principais
**O que é:** Lista das principais capacidades do sistema.<BR>
**Exemplo:**
- Funcionalidades principais:
	- Cadastro e login de pacientes
	- Agendamento e cancelamento de consultas
	- Notificações por e-mail/SMS
	- Painel administrativo para médicos e atendentes

#### 1.2.2. Limitações e exclusões
**O que é:** Define o que está fora do escopo do projeto (o que não será implementado, ao menos inicialmente).<br>

**Exemplo:**
- Não haverá integração com sistemas públicos de saúde (como o SUS) na versão inicial
- O sistema não oferecerá videochamadas para teleconsulta
<BR><BR>
</details>
<details>
	<summary> 📌 1.3. Stakeholders</summary>
	
#### 1.3.1. Equipe técnica
**O que é:** Pessoal responsável pelo desenvolvimento, testes, segurança, etc.<BR>
**Exemplo:**
- João Silva – Desenvolvedor Backend
- Ana Souza – UX Designer
- Pedro Lima – Scrum Master

#### 1.3.2. Usuários finais
**O que é:** Quem utilizará o sistema na prática.
**Exemplo:**
- Pacientes que marcam consultas
- Recepcionistas das clínicas
- Médicos que consultam a agenda

#### 1.3.3. Clientes e patrocinadores
**O que é:** Quem está financiando ou encomendando o projeto.
**Exemplo:**
- Clínica Vida Leve (contratante)
- Cooperativa Médica Uniclin (patrocinadora)
<BR><BR>
</details>

<details>
	<summary> 📌 1.4. Glossário de termos</summary>
	
#### 1.4.1. Definições de termos técnicos e específicos do domínio
**O que é:** Lista com explicações de siglas, termos técnicos ou jargões que aparecem na documentação.

**Exemplo:**
| Termo       | Definição                                                                          |
| ----------- | ---------------------------------------------------------------------------------- |
| **API**     | Interface de Programação de Aplicações, usada para comunicação entre sistemas.     |
| **SUS**     | Sistema Único de Saúde, rede pública de saúde brasileira.                          |
| **CRUD**    | Acrônimo para Create, Read, Update, Delete — operações básicas em bancos de dados. |
| **Backlog** | Lista priorizada de funcionalidades, correções e melhorias de um produto no Scrum. |
</details>
</details>

## 📐 2. Requisitos
Esta seção define o que o sistema deve fazer (funcionalidades) e como ele deve se comportar (qualidade, desempenho, restrições). Serve como base para o desenvolvimento, testes e validação do sistema.

<details>
 <summary>Ver mais</summary>
 
<details>
	<summary> 📌 2.1. Requisitos Funcionais</summary>
	
**O que é:**
Descrevem as funções específicas que o sistema deve executar, ou seja, comportamentos observáveis.

**Exemplo:**
- RF01: O sistema deve permitir que o paciente se cadastre com nome, CPF, e-mail e telefone.
- RF02: O sistema deve permitir que o paciente visualize os horários disponíveis de um médico.
- RF03: O sistema deve enviar um e-mail de confirmação após o agendamento da consulta.
<BR><BR>
</details>
<details>
	<summary> 📌 2.2. Requisitos Não Funcionais</summary>

**O que é:**
Definem restrições de qualidade ou desempenho, como segurança, tempo de resposta, compatibilidade, etc.

**Exemplo:**
- RNF01: O sistema deve estar disponível 24 horas por dia, 7 dias por semana.
- RNF02: O tempo de resposta para carregamento da agenda médica não deve ultrapassar 3 segundos.
- RNF03: As informações dos pacientes devem ser armazenadas com criptografia AES-256.
<BR><BR>
</details>
<details>
	<summary> 📌 2.3. Casos de Uso / Histórias de Usuário</summary>

**O que é:**

**Casos de Uso:** representam interações entre o usuário (ator) e o sistema, detalhando o fluxo de ações.
Histórias de Usuário (formato ágil): descrevem funcionalidades na perspectiva do usuário com valor de negócio.

**Exemplo (História de Usuário):**

**ID:** HU01<BR>
**Como** paciente,<BR>
**Quero** agendar uma consulta com um médico,<BR>
**Para que** eu possa garantir meu atendimento no horário desejado.<BR>
**Critérios de aceitação:**
- Deve ser possível selecionar a especialidade.
- Deve ser possível escolher data e horário disponíveis.
- O sistema deve exibir uma mensagem de confirmação.

**Exemplo (Caso de Uso):**

**Caso de Uso:** Agendar Consulta<BR>
**Ator:** Paciente<BR>
**Fluxo principal:**<BR>
1. O paciente acessa o sistema e faz login.
2. Escolhe a especialidade médica.
3. Seleciona o médico e a data/hora desejada.
4. Confirma a consulta.
5. O sistema salva o agendamento e envia um e-mail de confirmação.

**Fluxo alternativo:**
3a. Se não houver horário disponível, o sistema exibe uma mensagem informando indisponibilidade.
<BR><BR>
</details>
<details>
	<summary> 📌 2.4. Regras de Negócio</summary>
	
**O que é:** <BR>
Declaram políticas, restrições ou cálculos que o sistema deve seguir conforme as regras do domínio de negócio.

**Exemplo:**
- RN01: Um paciente não pode agendar duas consultas no mesmo horário.
- RN02: Agendamentos podem ser cancelados com no mínimo 2 horas de antecedência.
- RN03: Um médico pode atender no máximo 20 pacientes por dia útil.
<BR><BR>
</details>

</details>

## 🏗️ 3. Arquitetura e Design
Esta seção descreve como o sistema é estruturado internamente, suas camadas, componentes, tecnologias e como eles se relacionam. Ajuda desenvolvedores e arquitetos a compreenderem o funcionamento técnico e a manterem a consistência do projeto.

<details>
 <summary>Ver mais</summary>

<details>
	<summary> 📌 3.1. Arquitetura de Software</summary>
	
- **O que é:**
Define a estrutura global do sistema, os principais módulos, seus relacionamentos e a abordagem arquitetural adotada (ex: MVC, monolito, microserviços, etc.).

- **Exemplo:**
**Estilo arquitetural:** MVC (Model-View-Controller)
**Descrição:**
O sistema utiliza uma arquitetura MVC dividida em três camadas principais:

- **Model:** responsável pela lógica de negócio e acesso ao banco de dados.
- **View:** páginas web renderizadas para o usuário.
- **Controller:** gerencia as requisições, coordena os modelos e define as respostas.

[Cliente Web]<BR>
		|<BR>
[Controller] → [Model] → [Banco de Dados]
    <BR> ↓<BR>
   [View]
 <BR><BR> 
   
</details>
<details>
	<summary> 📌 3.2. Design de Sistema</summary>
**O que é:**
Detalha o design interno dos módulos, objetos, e a interação entre componentes. Pode usar diagramas UML como classes, sequência, atividade, etc.

**Exemplo:**

Diagrama de classes (resumo):

|     Paciente     |<>-----|    Agendamento      |
|------------------|    -  |---------------------|
| - nome           |       | - data              |
| - email          |       | - hora              |
| - telefone       |       | - status            |

Descrição:

- Um Paciente pode ter vários Agendamentos.
- Cada Agendamento tem data, hora e status (confirmado, cancelado, etc.).
<BR><BR>
</details>
<details>
	<summary> 📌 3.3. Tecnologias e Ferramentas</summary>

**O que é:**

Lista todas as linguagens, bibliotecas, frameworks e ferramentas utilizadas no projeto, com sua finalidade.

**Exemplo:**
| Categoria          | Tecnologia/Ferramenta | Finalidade                           |
| ------------------ | --------------------- | ------------------------------------ |
| Linguagem          | Java					 | Backend da aplicação                 |
| Framework Web      | JavaScript            | Interface do usuário (Frontend)      |
| Banco de Dados     | PostgreSQL            | Armazenamento de dados               |
| Controle de Versão | Git + GitHub          | Versionamento e colaboração          |
| Testes             | Jest                  | Testes automatizados (unidade)       |
| Documentação API   | Swagger/OpenAPI       | Descrição e testes de endpoints REST |
<BR><BR>
</details>
</details>

## 🧪 4. Qualidade e Testes
Essa seção documenta as estratégias de verificação e validação usadas para garantir que o software funcione corretamente, atenda aos requisitos e tenha qualidade técnica e funcional.
<details>
 <summary>Ver mais</summary>
 
<details>
	<summary> 📌 4.1. Plano de Testes</summary>
	
**O que é:**<BR>
Documento que define a estratégia geral de testes, o que será testado, por quem, com que frequência e quais critérios determinam o sucesso ou falha.

**Exemplo:**<BR>
**Plano de Testes – Sistema de Agendamento Médico (SAMEO)**
- **Objetivo:** Garantir que as funcionalidades principais operem corretamente e com segurança.
- **Escopo:** Cadastro, login, agendamento, cancelamento, notificações.
- **Responsáveis:** Equipe de QA e desenvolvedores
- **Critérios de entrada:** Funcionalidade implementada e integrada
- **Critérios de saída:** 100% dos testes automatizados e manuais aprovados sem erros críticos
<BR><BR>
</details>
<details>
	<summary> 📌 4.2. Casos de Teste</summary>

**O que é:**
Descrições detalhadas de cenários específicos que serão testados. Cada caso de teste valida se uma funcionalidade funciona corretamente sob determinadas condições.

**Exemplo:**<BR>
**Caso de Teste CT-002 – Agendar Consulta**<BR>
- **Objetivo:** Verificar se o paciente consegue agendar uma consulta com um médico disponível.
- **Pré-condição:** O paciente está autenticado e o médico possui horários disponíveis.
- **Passos:**

		1. Acessar o menu "Agendar Consulta"
		2. Selecionar especialidade e médico
		3. Escolher data e horário
		4. Confirmar agendamento

**Resultado Esperado:** O sistema exibe mensagem de sucesso e envia e-mail de confirmação.
<BR><BR>
</details>
<details>
	<summary> 📌 4.3. Resultados dos Testes</summary>
	
**O que é:**
Relatório contendo o registro dos testes executados, com suas datas, status (aprovado/reprovado), falhas encontradas e observações.

**Exemplo:**
| ID Teste | Funcionalidade      | Status    | Observações                              |
| -------- | ------------------- | --------- | ---------------------------------------- |
| CT-001   | Cadastro de usuário | Aprovado  | Sem falhas                               |
| CT-002   | Agendamento         | Reprovado | Sistema não enviou e-mail de confirmação |
| CT-003   | Cancelamento        | Aprovado  | Funcionando conforme esperado            |
<BR><BR>
</details>
<details>
	<summary> 📌 4.4. Testes Automatizados</summary>
	
**O que é:**
Testes escritos em código, que são executados automaticamente para verificar o comportamento do sistema a cada alteração (muito usados com CI/CD).

**Exemplo:**
Tecnologia utilizada: Jest (para testes unitários em JavaScript)
````JavaScript
test("deve retornar sucesso ao agendar consulta", () => {
  const resultado = agendarConsulta(paciente, medico, "2025-08-10 14:00");
  expect(resultado.status).toBe("confirmado");
});
````

**Cobertura de Testes:**
- 90% de cobertura de código em módulos críticos
- Executado a cada push no repositório (via GitHub Actions)
<BR><BR>
</details>
</details>

## 📚 5. Manual do Usuário
Esta seção orienta o **usuário final** sobre como **navegar e utilizar o sistema**, explicando o funcionamento das principais telas, ações disponíveis e o que fazer em situações comuns. Idealmente, deve ser simples, objetiva e acessível até para pessoas não técnicas.
<details>
 <summary>Ver mais</summary>
 
<details>
	<summary> 📌 5.1. Guia de Navegação</summary>
	
**O que é:**
Explica a estrutura do sistema, menus, botões e caminhos que o usuário pode seguir.

**Exemplo:**<BR>
**Página Inicial (Home):**
Apresenta um resumo do sistema e opções para login ou cadastro.

**Menu Principal:**
- **Agendar Consulta** – Permite escolher especialidade, médico, data e hora.
- **Minhas Consultas** – Lista as consultas futuras e passadas.
- **Perfil** – Permite editar dados pessoais e senha.
- **Sair** – Encerra a sessão do usuário.
	
**Fluxo Básico para o Paciente:**
1. Acessar o sistema pelo navegador: http://localhost:3000
2. Fazer login com e-mail e senha
3. Escolher “Agendar Consulta”
4. Selecionar a especialidade e médico
5. Escolher data e horário disponíveis
6. Confirmar
7. Visualizar confirmação e receber e-mail
<BR><BR>
</details>
<details>
	<summary> 📌 5.2. FAQs e Problemas Comuns</summary>
	
**O que é:**
Lista de perguntas frequentes e soluções para dúvidas ou dificuldades comuns.

**Exemplo:**
| Pergunta                              | Resposta                                                               |
| ------------------------------------- | ---------------------------------------------------------------------- |
| **Esqueci minha senha. E agora?**     | Clique em “Esqueci minha senha” na tela de login e siga as instruções. |
| **Não recebi e-mail de confirmação.** | Verifique a caixa de spam ou tente reagendar a consulta.               |
| **O botão “Agendar” não funciona.**   | Verifique se você escolheu uma data e horário válidos.                 |
| **Posso cancelar uma consulta?**      | Sim, até 2 horas antes da consulta, na aba “Minhas Consultas”.         |
| **Funciona no celular?**              | Sim, o sistema é responsivo e funciona em navegadores móveis modernos. |
<BR><BR>
</details>
</details>

## 🛠️ 6. Manual Técnico
Esta seção orienta desenvolvedores e administradores sobre a estrutura do código-fonte, execução local, boas práticas de contribuição, e documentação das APIs disponíveis. É essencial para manutenção, expansão e integração do sistema.
<details>
 <summary>Ver mais</summary>
 
<details>
	<summary> 📌 6.1. Guia do Desenvolvedor</summary>

**O que é:**
Descreve a organização dos diretórios, como iniciar o ambiente de desenvolvimento e boas práticas para contribuir com o projeto.

**Exemplo:**

**Estrutura de diretórios:**

/sameo<br>
├── /frontend          → Aplicação web (React/HTML/JS/CSS)<br>
├── /backend           → API em Java (Spring Boot)<br>
├── /database          → Scripts SQL (schema e dados iniciais)<br>
└── README.md          → Instruções básicas do projeto<br>

<br><br>

#### 6.1.1. Guia de Instalação:

**O que é:**
Passo a passo para preparar o ambiente local, instalar dependências e executar o sistema completo.

**Exemplo (Ambiente local):**

Pré-requisitos:
- Java JDK 17+
- Node.js 18+ e npm
- MySQL 8+
- Git instalado
- IDE recomendadas: Spring (backend), VS Code (frontend)

**Passos de instalação:**
1. Clonar o repositório:
````bash
git clone https://github.com/usuario/sameo.git
cd sameo
````

2. Configurar o banco de dados (MySQL):
	- Criar banco: CREATE DATABASE sameo;
	- Usuário/senha padrão: root/root
	- Importar script: /database/schema.sql

3. Executar o backend (API - Spring Boot):
	- Navegar até /backend
	- Configurar application.properties:
````propriets
spring.datasource.url=jdbc:mysql://localhost:3306/sameo
spring.datasource.username=root
spring.datasource.password=root
````
- Rodar o projeto com:
````bash
./mvnw spring-boot:run
````

4. Executar o frontend (JS/HTML/CSS):
	- Navegar até /frontend
	- Instalar dependências:
````bash
npm install
````
- Iniciar servidor local:
````bash
npm run dev
````
- Acesse: http://localhost:3000
<BR><BR>
</details>
<details>
	<summary> 📌 6.2. API Documentation</summary>
	
**O que é:**
Lista e descreve os endpoints da API, com seus métodos, parâmetros e retornos. Pode ser gerado automaticamente com ferramentas como Swagger.

- Exemplo (documentação básica):

| Método | Endpoint              | Descrição                          | Autenticação |
| ------ | --------------------- | ---------------------------------- | ------------ |
| GET    | `/api/pacientes`      | Lista todos os pacientes           | Sim          |
| POST   | `/api/pacientes`      | Cadastra um novo paciente          | Não          |
| POST   | `/api/login`          | Realiza autenticação do usuário    | Não          |
| GET    | `/api/consultas`      | Lista consultas do paciente logado | Sim          |
| POST   | `/api/consultas`      | Agenda uma nova consulta           | Sim          |
| DELETE | `/api/consultas/{id}` | Cancela uma consulta               | Sim          |


**Formato de exemplo de request:**
```` json
POST /api/consultas
{
  "pacienteId": 5,
  "medicoId": 2,
  "dataHora": "2025-08-01T14:00:00"
}
````

**Resposta esperada:**
```` json
POST /api/consultas
{
  "status": "confirmado",
  "mensagem": "Consulta agendada com sucesso."
}
````

📌 6.3. Padrões de Código
- **O que é:**
Define convenções para manter o código consistente, legível e sustentável.

- **Exemplo:**

**Backend – Java (Spring Boot):**
- Nome de classes em PascalCase: PacienteController, AgendamentoService
- Nome de variáveis em camelCase: dataConsulta, nomeCompleto
- Organização por camadas:
````bash
/controller
/service
/repository
/entity
````

**Frontend – JavaScript:**
- Componentes React em PascalCase: AgendamentoForm.jsx
- Separação de responsabilidades (componentes, páginas, estilos)
- Uso de ESLint + Prettier para padronização automática
	
**Boas práticas gerais:**
- Código comentado sempre que necessário
- Funções curtas, com nomes descritivos
- Commits claros (ex: fix: validação de e-mail no cadastro)

<BR><BR>
</details>
</details>

## 📑 7. Proposta Comercial
Esta seção apresenta oferta de valores, prazos e condições para a contratação do desenvolvimento e implantação do sistema.
<details>
 <summary>Ver mais</summary>

<details>
	<summary> 📌 7.1. Descrição da Proposta</summary>
	
**O que é:** Resumo executivo da solução, objetivos e entregáveis.

**Exemplo:**
Desenvolveremos o Sistema de Agendamento Médico Online (SAMEO) conforme especificado, incluindo frontend em JavaScript/HTML/CSS, API Java Spring e banco de dados MySQL, para rodar em ambiente local. O pacote inclui levantamento de requisitos, design, implementação, testes, implantação e treinamento.
<BR><BR>
</details>
<details>
	<summary> 📌 7.2. Escopo Comercial</summary>
	
**O que é:** Lista de itens e atividades cobertas pela proposta, com o que está incluso e exclusivo.

**Exemplo:**

**Incluso:**

- Workshops de levantamento de requisitos (até 3 sessões)
- Desenvolvimento de todas as funcionalidades descritas nos requisitos
- Testes unitários e integrados
- Documentação completa (usuário, técnico, implantação)
- Treinamento remoto de até 8 horas

**Excluso:**
- Hospedagem em nuvem ou servidores externos
- Integrações futuras com sistemas de terceiros (ex: SUS)
- Manutenção após 3 meses de garantia

</details>
<details>
	<summary> 📌 7.3. Preço e Condições de Pagamento</summary>
	
**O que é:** Valor total do projeto, forma e prazos de pagamento.

**Exemplo:**

Valor Total Consolidado: R$ 60.650,00

| **Item**           | **Descrição**                                                   | **Qtd/Horas** | **Valor Unitário (R$)** | **Total (R$)**   |
| ------------------ | --------------------------------------------------------------- | ------------- | ------------------------ | ----------------- |
| **1. Mão de Obra** |                                                                 |               |                          |                   |
| 1.1                | Analista de Requisitos (levantamento, documentação funcional)   | 40h           | 70,00                    | 2.800,00          |
| 1.2                | Desenvolvedor Backend (Java Spring – APIs e lógica de negócios) | 100h          | 75,00                    | 7.500,00          |
| 1.3                | Desenvolvedor Frontend (JS, HTML, CSS – telas web responsivas)  | 60h           | 65,00                    | 3.900,00          |
| 1.4                | Analista de Testes e QA                                         | 18h           | 65,00                    | 1.170,00          |
| 1.5                | Gerente de Projeto (Scrum Master, reuniões e acompanhamento)    | 18h           | 60,00                    | 1.080,00          |
|                    | **Subtotal Mão de Obra**                                        |               |                          | **R$ 16.450,00** |
| **2. Infraestrutura e Equipamentos** |                                                          |                |                          |                   |
| 2.1                                  | Notebook de desenvolvimento/teste (uso interno – rateio) | 1              | 3.000,00                 | 3.000,00          |
| 2.2                                  | Tablet para interface de recepção (Samsung Tab 4)        | 2              | 1.200,00                 | 2.400,00          |
| 2.3                                  | Servidor local (mini-PC dedicado – offline)              | 1              | 2.800,00                 | 2.800,00          |
| 2.4                                  | Licença IDE (IntelliJ, WebStorm – uso da equipe)         | 3              | 400,00                   | 1.200,00          |
| 2.5                                  | Licença Antivírus/Firewall local                         | 1              | 200,00                   | 200,00            |
| 2.6                                  | Internet dedicada (uso da clínica – estimativa setup)    | 1              | 500,00                   | 500,00            |
|                                      | **Subtotal Infraestrutura**                              |                |                          | **R$ 10.100,00** |
| **3. Software** |                                                               |                |                          |                  |
| 3.1             | Desenvolvimento da aplicação web (interface paciente e admin) | 1              | 6.000,00                 | 6.000,00         |
| 3.2             | Desenvolvimento da API REST em Java Spring                    | 1              | 3.000,00                 | 3.000,00         |
| 3.3             | Banco de dados MySQL (modelagem, queries e integração)        | 1              | Incluso no item 3.2      | -                |
| 3.4             | Configuração e instalação local do sistema                    | 1              | Incluso no item 3.2      | -                |
|                 | **Subtotal Software**                                         |                |                          | **R$ 9.000,00** |
| **4. Treinamento e Capacitação** |                                                               |           |                      |                  |
| 4.1                              | Treinamento com a recepção (uso do sistema e dashboard)       | 6h        | 250,00               | 1.500,00         |
| 4.2                              | Treinamento com o médico/gestor (cadastros, relatórios, etc.) | 6h        | 250,00               | 1.500,00         |
|                                  | **Subtotal Treinamento**                                      |           |                      | **R$ 3.000,00** |

#### 💰 Total Geral do Projeto SAMEO
R$ 38.550,00 (mão de obra)
R$ 10.100,00 (infraestrutura)
R$ 9.000,00 (software)
R$ 3.000,00 (treinamento)

👉 Valor Total Consolidado: R$ 60.650,00

Condições:
- 30% na assinatura do contrato (R$ 13.500,00)
- 40% na conclusão da Sprint de meio de projeto (R$ 18.000,00)
- 30% na entrega final e aceite (R$ 13.500,00)
</details>
<details>
	<summary> 📌 7.4. Cronograma de Entrega</summary>
	
**O que é:** Linha do tempo prevista para cada fase do projeto.

**Exemplo:**

| Fase                        | Duração estimada | Data de Início | Data de Término |
| --------------------------- | ---------------- | -------------- | --------------- |
| Planejamento e Kick-off     | 1 semana         | 05/08/2025     | 12/08/2025      |
| Desenvolvimento (3 Sprints) | 9 semanas        | 13/08/2025     | 14/10/2025      |
| Testes e Ajustes Finais     | 2 semanas        | 15/10/2025     | 29/10/2025      |
| Treinamento e Entrega       | 1 semana         | 30/10/2025     | 06/11/2025      |

</details>
<details>
	<summary> 📌 7.5. Termos e Condições</summary>

**O que é:** Regras contratuais, garantias, confidencialidade e propriedade intelectual.

**Exemplo:**

- O cliente terá garantia de 3 meses para correções de bugs sem custo adicional.
- Qualquer customização além do escopo será cobrada à parte, em contrato suplementar.
- Todo o código-fonte desenvolvido será de propriedade do cliente, mediante quitação integral.
- As partes assinam acordo de confidencialidade (NDA) para proteger informações sensíveis.

</details>
<details>
	<summary> 📌 7.6. Validade da Proposta</summary>

**O que é:** Prazo máximo para aceitação da oferta.

**Exemplo:**

Esta proposta é válida por 30 dias a partir da data de envio (até 29 de agosto de 2025). Após esse prazo, valores e prazos poderão ser revistos.

</details>
</details>

## 📎 8. Anexos
A seção de anexos reúne materiais complementares, documentos auxiliares e recursos visuais que apoiam a compreensão, operação e evolução do sistema. É útil para manter tudo organizado em um só lugar, facilitando o acesso à informação por diferentes públicos: usuários, desenvolvedores, gerência ou clientes.
<details>
 <summary>Ver mais</summary>
 
<details>
	<summary> 📌 8.1. Diagramas</summary>
	
**O que é:**
Representações visuais da arquitetura, fluxos de dados e funcionamento do sistema.

Exemplo de anexos possíveis:
- Diagrama de arquitetura: mostrando a relação entre frontend, API e banco de dados.
- Diagrama de casos de uso: ilustrando ações dos perfis (paciente, médico, atendente).
- Diagrama de classes (Java): detalhando estrutura orientada a objetos no backend.
- Fluxogramas: de login, agendamento, cancelamento de consulta, etc.
<BR><BR>
</details>
<details>
	<summary> 📌 8.2. Modelos e Templates</summary>
	
**O que é:**
Arquivos reutilizáveis usados ao longo do projeto, especialmente para documentação e gestão.

Exemplo de anexos possíveis:
- Template de relato de bug
- Template de registro de reunião
- Formulário de levantamento de requisitos
- Modelo de contrato de confidencialidade (NDA)
- Termo de aceite do sistema (assinatura do cliente)
<BR><BR>
</details>
<details>
	<summary> 📌 8.3. Códigos e Scripts Auxiliares</summary>
	
**O que é:**

Pequenos trechos de código, scripts SQL ou comandos úteis que não estão no core do sistema, mas são importantes para implantação, manutenção ou testes.

Exemplo de anexos possíveis:
- Script init.sql para criação do banco e tabelas no MySQL
- Comando curl para testar autenticação na API
- Script de limpeza do banco local (truncate.sql)
- Script para backup do banco:

````bash
mysqldump -u root -p sameo > backup_sistema.sql
````
<BR><BR>
</details>
<details>
	<summary> 📌 8.4. Manuais Complementares</summary>
	
**O que é:**
Materiais que expandem os manuais já apresentados, ou que servem como apoio didático para os usuários e equipe técnica.

Exemplo de anexos possíveis:
- PDF com o manual do usuário final ilustrado
- Manual resumido impresso para recepcionistas
- Guia de instalação offline para ambiente Windows/Linux
- Slides de treinamento e vídeo-aulas
<BR><BR>
</details>
<details>
	<summary> 📌 8.5. Documentos Legais</summary>

**O que é:**
Qualquer documento jurídico relacionado ao sistema, à contratação ou ao tratamento de dados.

Exemplo de anexos possíveis:
- Contrato de desenvolvimento assinado
- Termo de responsabilidade sobre os dados (LGPD)
- Proposta comercial final com aceite do cliente
- Política de privacidade e termos de uso
</details>
</details>