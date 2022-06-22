package model;

public class Perfumaria extends Produto{
	//atributos
	private TipoPerfumaria tipoPerfumaria;
	private double volume;
	
	//metodos
	public TipoPerfumaria getTipoPerfumaria() {
		return tipoPerfumaria;
	}
	public void setTipoPerfumaria(TipoPerfumaria tipoPerfumaria) {
		this.tipoPerfumaria = tipoPerfumaria;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	@Override
	public String toString() {
		return "Perfumaria [tipoPerfumaria=" + tipoPerfumaria + ", volume=" + volume + "]";
	}
	

	
	
}
