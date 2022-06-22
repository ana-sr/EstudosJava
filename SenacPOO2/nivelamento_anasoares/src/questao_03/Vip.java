package questao_03;

public class Vip extends Ingresso{
	private double adicional;
	private double ingressoVip;
	
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public double adicional() {
		ingressoVip = this.getValor() + this.adicional;
		return ingressoVip;
		
	}
}
