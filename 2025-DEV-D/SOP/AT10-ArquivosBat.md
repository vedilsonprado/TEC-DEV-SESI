# 📘 04-04 | AT10 - Automação de tarefas com .bat e Agendador de Tarefas (Windows 11)

**📁 Pasta de trabalho:** `D:\Temp\DEV-1D\SOP`
**🗒️Todas as atividades serão feitas no bloco de notas***

---

## 🔰 Nível 1 – Primeiros passos com arquivos .bat

### 🧪 Atividade 1: Olá, Mundo!
- Criar um arquivo .bat com a mensagem:
```bat
@echo off
echo Olá, Mundo! Bem-vindo ao mundo dos BATS!
pause
```
- Salvar como: `atividade1_ola_mundo.bat`

---

### 🌞 Atividade 2: Mensagem de bom dia
```bat
@echo off
echo Bom dia, [SEU NOME]! Hoje será um ótimo dia de estudos :)
pause
```
- Salvar como: `atividade2_bom_dia.bat`

---

### 📋 Atividade 3: Agenda do dia
```bat
@echo off
echo Sua agenda do dia:
echo - 08:00 - Café da manhã
echo - 09:00 - Aula de informática
echo - 12:00 - Almoço
echo - 15:00 - Estudo com .BAT!
pause
```
- Salvar como: `atividade3_agenda.bat`

---

## ⚙️ Nível 2 – Interatividade básica

### ⏳ Atividade 4: Calculadora de descanso
```bat
@echo off
set /p hora=Digite a hora atual (ex: 14):
set /a intervalo=16 - %hora%
echo Faltam %intervalo% horas para o descanso das 16h!
pause
```
- Salvar como: `atividade4_intervalo.bat`

---

### 📂 Atividade 5: Criando pastas mágicas
```bat
@echo off
set /p nome=Digite seu nome:
mkdir D:\Temp\DEV-1D\SOP\pasta_%nome%
echo Pasta criada com sucesso!
pause
```
- Salvar como: `atividade5_pasta_magica.bat`

---

### 🔒 Atividade 6: Diário secreto
```bat
@echo off
set /p recado=Escreva uma mensagem secreta:
echo %recado% > D:\Temp\DEV-1D\SOP\diario.txt
echo Diário salvo!
pause
```
- Salvar como: `atividade6_diario.bat`

---

## 📀 Nível 3 – Automatizando tarefas

### 🌐 Atividade 7: Abrindo o navegador automaticamente
```bat
@echo off
start microsoft-edge:https://www.google.com
pause
```
- Salvar como: `atividade7_abrir_google.bat`

---

### 🖥️ Atividade 8: Abrindo vários programas
```bat
@echo off
start notepad
start calc
start mspaint
echo Ferramentas abertas!
pause
```
- Salvar como: `atividade8_multiplas_janelas.bat`

---

### 🗃️ Atividade 9: Backup de arquivos
```bat
@echo off
mkdir D:\Temp\DEV-1D\SOP\backup
copy D:\Temp\DEV-1D\SOP\*.bat D:\Temp\DEV-1D\SOP\backup\
echo Backup concluído!
pause
```
- Salvar como: `atividade9_backup.bat`

---

## ⏰ Nível 4 – Agendador de Tarefas

### ⏲️ Atividade 10: Mensagem de bom dia agendada
- Agendar `atividade2_bom_dia.bat` para executar às **08:00**.

---

### 📆 Atividade 11: Agenda do dia agendada
- Agendar `atividade3_agenda.bat` para executar às **09:00** todos os dias.

---

### 📝 Atividade 12: Diário automático às 17h
```bat
@echo off
echo Hoje foi um bom dia de aula! >> D:\Temp\DEV-1D\SOP\diario.txt
```
- Salvar como: `atividade12_diario_automatico.bat`
- Agendar para **17:00** todos os dias.

---

## 🧐 Nível 5 – Personalização e desafios

### ⏰ Atividade 13: Despertador com vídeo
```bat
@echo off
echo Hora de levantar! Aula em 10 minutos!
start msedge https://www.youtube.com/watch?v=2vjPBrBU-TM
pause
```
- Agendar para **07:45**.

---

### 🗣️ Atividade 14: Mini questionário
```bat
@echo off
set /p nome=Digite seu nome:
set /p idade=Digite sua idade:
echo Nome: %nome% >> D:\Temp\DEV-1D\SOP\respostas.txt
echo Idade: %idade% >> D:\Temp\DEV-1D\SOP\respostas.txt
echo Obrigado por responder!
pause
```
- Salvar como: `atividade14_questionario.bat`

---

### 🛠️ Atividade 15: Crie sua própria rotina!
**Desafio:**
- Criar um .bat que:
  - Mostre uma mensagem inicial;
  - Abra 2 programas à sua escolha;
  - Crie um arquivo com seu nome;
  - Seja agendado para um horário personalizado.

---
