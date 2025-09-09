package model;

public class Cliente extends Pessoa {

	public Cliente(String nome, String telefone) {
		super(nome, telefone);
	}

	@Override
	public void exibirInfo() {
		System.out.println("Cliente: " + getNome() + " | Tel: " + getTelefone());
	}
}
