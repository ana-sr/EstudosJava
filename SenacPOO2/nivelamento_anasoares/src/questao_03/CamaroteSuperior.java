package questao_03;

public class CamaroteSuperior extends Vip{
	private double camaroteVip;

	
	public double getCamaroteVip() {
		return camaroteVip;
	}

	public void setCamaroteVip(double camaroteVip) {
		this.camaroteVip = camaroteVip;
	}
	
	public double valorCamaroteVip() {
		camaroteVip = this.getCamaroteVip() + getValor(); 
		return camaroteVip;
	}
}
