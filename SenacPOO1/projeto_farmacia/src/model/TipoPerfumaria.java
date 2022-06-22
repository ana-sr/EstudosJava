package model;

public class TipoPerfumaria {
	//atributo
	private String nome;
	private double desconto;
	
	//metodos
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public String toString() {
		return "\nNome: "+nome+"\nDesconto: "+desconto;
	}
}
