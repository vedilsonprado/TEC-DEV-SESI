# 📘 04-30 | Redes com Servidores (DHCP)

**📁 Pasta onde salvar os trabalho:** `D:\Temp\DEV-1D\ARIOT`

**👨🏻‍🏫 Enviar os arquivos no Classroom**

## 🔧 ATIVIDADE 6 — Três Redes Locais DHCP
### **Objetivo:** Interligar três roteadores via conexão serial, cada um com sua rede local conectada a um switch. Configurar dinâmicamente os IPs dos computadores.

**Regras:**
- 3 Roteadores Cisco 4331 (Adicionar módulo NIM-2T em cada um)
- Conexão entre os roteadores:
  - Roteador01: 10.0.0.1/30 ↔ Roteador01: 10.0.0.2/30
  - Roteador02: 10.0.0.5/30 ↔ Roteador03: 10.0.0.6/30 
  - /30 = subrede com mascara 255.255.255.252
<Br><Br>
- **Rede 1** (Roteador 1) - Classe C:
  - 1 Switch com 10 PCs
  - Rede: 192.168.1.0/24 (255.255.255.0)
  - Gateway: 192.168.1.1
  - Servidor DHCP: 192.168.1.2
  - IPs dos PCs: 192.168.1.10 (Permitir 15 dispositivos na rede)
<Br><Br>
- **Rede 2** (Roteador 2) - Classe B:
  - 1 Switch com 10 PCs
  - Rede: 172.16.0.0/16 (255.255.0.0)
  - IP do Roteador: 172.16.0.1
  - Servidor DHCP: 172.16.0.2
  - IPs dos PCs: 172.16.10.50 (Permitir 30 dispositivos na rede)
<Br><Br>
- **Rede 3** (Roteador 3) - Classe A:
  - 1 Switch com 10 PCs
  - Rede: 30.0.0.0/8 (255.0.0.0)
  - IP do Roteador: 30.0.0.1
  - IPs dos PCs: 30.20.10.0(Permitir 60 dispositivos na rede)
<Br><Br>

**🧪 Teste de ping entre PCs de redes diferentes.**
### 💾 Salvar como: `Atividade06.pkt`
