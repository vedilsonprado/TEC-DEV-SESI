package system;

import java.util.Scanner;

import model.Carro;
import model.Cliente;
import model.Funcionario;
import model.Servico;

public class SistemaMecanica {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Cliente cliente = null;
		Funcionario funcionario = null;
		Carro carro = null;
		Servico servico = null;
		
		int opcao;
		do {
			System.out.println("MECÂNICA VRUM VRUM");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Funcionário");
			System.out.println("3 - Cadastrar Carro");
			System.out.println("4 - Cadastrar Serviço");
			System.out.println("5 - Exibir dados");
			System.out.println("0 - Sair");
			System.out.println("Escolha: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			
			case 1:
				System.out.println("Nome do cliente: ");
				String nomeCliente = scanner.nextLine();
				System.out.println("Telefone: ");
				String telCliente = scanner.nextLine();
				
				cliente = new Cliente(nomeCliente, telCliente);
				
				System.out.println("Cliente cadastrado!");
				break;
				
			case 2:
				System.out.println("Nome do funcionário: ");
				String nomeFun = scanner.nextLine();
				System.out.println("Telefone: ");
				String telFun = scanner.nextLine();
				System.out.println("Cargo: ");
				String cargoFun = scanner.nextLine();
				
				funcionario = new Funcionario(nomeFun, telFun, cargoFun);
				
				System.out.println("Funcionário cadastrado!");
				break;
				
			case 3:
				if (cliente == null) {
					System.out.println("Cadastre um cliente antes!");
				} else {
					System.out.println("Modelo do carro: ");
					String modelo = scanner.nextLine();
					System.out.println("Placa: ");
					String placa = scanner.nextLine();
					
					carro = new Carro(modelo, placa, cliente);
					
					System.out.println("Carro cadastrado!");
				}
				break;
				
			case 4:
				if (carro == null || funcionario == null) {
					System.out.println("Cadastre um carro e funcionário antes!");
				} else {
					System.out.println("Descrição do serviço: ");
					String desc = scanner.nextLine();
					System.out.println("Valor: ");
					double valor = scanner.nextDouble();
					scanner.nextLine();
					
					servico = new Servico(desc, valor, carro, funcionario);
					
					System.out.println("Serviço cadastrado!");
				}
				break;
				
			case 5:
				System.out.println("\nDados cadastrados:");
				
				if (cliente != null) {
					cliente.exibirInfo();
				}
				
				if (funcionario != null) funcionario.exibirInfo();
				
				if (carro != null) carro.exibirInfo();
				
				if (servico != null) servico.exibirInfo();
				
				if (cliente == null && funcionario == null && carro == null && servico == null) {
					System.out.println("Nenhum dado cadastrado ainda.");
				}
				break;
				
			case 0:
				System.out.println("Saindo do sistema!");
				break;
			
			default:
				System.out.println("Opção inválida!");
			}

			
		} while (opcao !=0);
		
		scanner.close();

	}

}