package model;

public class Carro {
	private String modelo;
	private String placa;
	private Cliente dono;

	public Carro(String modelo, String placa, Cliente dono) {
		this.modelo = modelo;
		this.placa = placa;
		this.dono = dono;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public Cliente getDono() {
		return dono;
	}
	
	public void setDono(Cliente dono) {
		this.dono = dono;
	}
	
	public void exibirInfo() {
		System.out.println("Carro: " + modelo +
							" | Placa: " + placa +
							" | Dono: " + dono.getNome());
	}

}









