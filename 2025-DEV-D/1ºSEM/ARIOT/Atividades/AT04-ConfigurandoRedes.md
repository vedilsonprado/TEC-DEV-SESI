# 📘 04-09 | AT04 - Configurando Redes no Packet Tracer

**📁 Pasta onde salvar os trabalho:** `D:\Temp\DEV-1D\ARIOT`

**👨🏻‍🏫 Enviar os arquivos no Classroom**

**Faça

## ATIVIDADE 1 — Rede Local Simples com 1 Switch (Classe C)
### **Objetivo:** Criar uma rede local com um switch e 4 computadores, todos pertencentes à mesma rede Classe C.

Regras:

- 1 Switch.
- 4 Computadores conectados ao switch com cabo direto.
- Rede: 192.168.10.0
- Mascara de rede: 255.255.255.0

Todos os PCs devem se comunicar entre si. Efetue testes de ping.

### **Salvar com o nome Atividade01.pkt**

## ATIVIDADE 2 — 3 Switches em Redes Separadas (Classes A, B e C)
### **Objetivo:** Montar uma rede com 3 switches independentes. Cada switch terá 4 computadores configurados em uma classe de IP diferente.

Regras:

**Use a Ferramenta Draw Rectangle para delimitar o espaço decada rede. Use o nome da Classe e informe a rede da area. 
Exemplo:
Classe A
Rede: 10.0.0.0**

- Switch 1 — Classe A:
  - 4 Computadores conectados ao switch com cabo direto.
  - Rede: 10.0.0.0
  - Mascara de rede: 255.0.0.0

- Switch 2 — Classe B:
  - 4 Computadores conectados ao switch com cabo direto.
  - Rede: 172.16.0.0
  - Mascara de rede: 255.255.0.0

- Switch 3 — Classe C:
  - 4 Computadores conectados ao switch com cabo direto.
  - Rede: 192.168.1.0
  - Mascara de rede: 255.255.255.0

Testar comunicação apenas dentro do mesmo switch.

Os switchs devem estar conectados entre si, para isso conecte-os utilizando um cabo de par trançado e conectando nas portas GigabitEthernet.

### **Salvar com o nome Atividade02.pkt**

## ATIVIDADE 3 — Roteador com 2 Redes (Classes B e C)
### **Objetivo:** Utilizar 1 roteador 2811 e 2 switches. Cada switch terá 4 computadores, mas em redes diferentes (Classe B e Classe C). O roteador fará a interligação entre as redes.

**Use a Ferramenta Draw Rectangle para delimitar o espaço decada rede. Use o nome da Classe e informe a rede da area. 
Exemplo:
Classe A
Rede: 10.0.0.0**

Regras:

- Switch 1 — Classe B:
  - 4 Computadores conectados ao switch com cabo direto.
  - Rede: 172.30.0.0
  - Mascara de rede: 255.255.0.0
  - Gateway: 172.30.0.1
  - Distribuir os IPs a partir do 172.30.10.100

- Switch 2 — Classe C:
  - 4 Computadores conectados ao switch com cabo direto.
  - Rede: 192.168.10.0
  - Mascara de rede: 255.255.255.0
  - Gateway: 192.168.10.1
  - Distribuir os IPs a partir do 192.168.10.100

- Roteador — Utilizar o 2811
  - Conectar a FastEthernet0/0 do roteador na  FastEthernet0/24 do Switch 1 com um par trançado
  - Conectar a FastEthernet0/1 do roteador na  FastEthernet0/24 do Switch 2 com um par trançado
  - Configurar o IP de cada porta, conforme os Gateways

Testar a comunicação entre todos os PCs (de diferentes redes).

### **Salvar com o nome Atividade03.pkt**