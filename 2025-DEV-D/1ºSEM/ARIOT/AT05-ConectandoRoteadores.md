# 📘 📘 04-16 | ATIVIDADES AVANÇADAS — Redes com Roteadores (Cisco Packet Tracer)

**📁 Pasta onde salvar os trabalho:** `D:\Temp\DEV-1D\ARIOT`

**👨🏻‍🏫 Enviar os arquivos no Classroom**



## 🔧 ATIVIDADE 4 — Dois Roteadores com Redes Locais (Classes B e C)
### **Objetivo:** Interligar dois roteadores via conexão serial, cada um com sua rede local conectada a um switch.

### 📂 Salvar como: 'Atividade04.pkt'

**Regras:**
- 2 Roteadores Cisco 4331 (Adicionar módulo NIM-2T em cada um)
- Conexão Serial entre os roteadores: Serial0/0/0 ↔ Serial0/0/0
- Roteador 1 (Classe B):
  - 1 Switch com 3 PCs
  - Rede: 172.16.0.0
  - Máscara: 255.255.0.0
  - IP do Roteador: 172.16.0.1
  - IPs dos PCs: 172.16.0.10 ~ 172.16.0.12
- Roteador 2 (Classe C):
  - 1 Switch com 3 PCs
  - Rede: 192.168.1.0
  - Máscara: 255.255.255.0
  - IP do Roteador: 192.168.1.1
  - IPs dos PCs: 192.168.1.10 ~ 192.168.1.12
- Endereçamento da conexão serial:
  - 10.0.0.0/30
  - Roteador 1: 10.0.0.1
  - Roteador 2: 10.0.0.2

**🧪 Teste de ping entre PCs de redes diferentes.**
### 💾 Salvar como: `Atividade04.pkt`

<br><br>

## ATIVIDADE 5 — Três Roteadores com Redes Separadas (Classes A, B e C)
### **Objetivo:** Criar uma topologia com 3 roteadores interligados via conexões seriais. Cada roteador está conectado a uma rede de classe diferente.

**Regras:**
- 3 Roteadores Cisco 4331 (com placa NIM-2T)
- Conexão serial:
  - R1 ↔ R2: 10.0.0.0/30
  - R2 ↔ R3: 10.0.0.4/30
- Roteador 1 — Classe A
  - Rede: 10.0.0.0
  - Máscara: 255.0.0.0
  - IP do Roteador: 10.0.0.1
  - 3 PCs: 10.0.0.10 ~ 10.0.0.12
- Roteador 2 — Classe B
  - Rede: 172.16.0.0
  - Máscara: 255.255.0.0
  - IP do Roteador: 172.16.0.1
  - 3 PCs: 172.16.0.10 ~ 172.16.0.12
- Roteador 3 — Classe C
  - Rede: 192.168.1.0
  - Máscara: 255.255.255.0
  - IP do Roteador: 192.168.1.1
  - 3 PCs: 192.168.1.10 ~ 192.168.1.12
** 🧪 Configurar rotas estáticas e testar a comunicação entre todas as redes. **
#### 💾 Salvar como: `Atividade05.pkt`

## ATIVIDADE 6 — Quatro Roteadores com Redes Mistas (Classes A, B, C e Sub-redes)
### **Objetivo:** Criar uma rede de maior escala com quatro roteadores interconectados via serial, explorando sub-redes e diferentes classes de IPs.

**Use a Ferramenta Draw Rectangle para delimitar o espaço decada rede. Use o nome da Classe e informe a rede da area. 
Exemplo:
Classe A
Rede: 10.0.0.0**

**Regras:**
Executar conforme a imagem

![ds00](./assets/Atividade06.png)

**🧪 Configurar rotas estáticas para garantir comunicação entre todos os PCs das 4 redes.**
### 💾 Salvar como: `Atividade06.pkt`