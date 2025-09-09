package model;

public class Funcionario extends Pessoa{
	private String cargo;
	
	public Funcionario(String nome, String telefone, String cargo) {
		super(nome, telefone);
		this.cargo = cargo;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Funcionário: " + getNome() + 
							" | Cargo: " + cargo);
	}

}