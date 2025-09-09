package model;

public class Servico {
	private String descricao;
	private double valor;
	private Carro carro;
	private Funcionario funcionario;
	
	public Servico(String descricao, double valor, Carro carro, Funcionario funcionario) {
		this.descricao = descricao;
		this.valor = valor;
		this.carro = carro;
		this.funcionario = funcionario;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Carro getCarro() {
		return carro;
	}
	
	public void setCarro (Carro carro) {
		this.carro = carro;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void exibirInfo() {
		System.out.println("Servico: " + descricao +
							" | Valor: R$ " + valor +
							" | Carro: " + carro.getModelo() +
							" | Mecânico: " + funcionario.getNome());
		
	}
	
}