package questao_04;

public class Velho extends Imovel{
	private int imovelVelho;
	private int valorImovel;

	
	
	public int getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(int valorImovel) {
		this.valorImovel = valorImovel;
	}

	public int getImovelVelho() {
		return imovelVelho;
	}

	public void setImovelVelho(int imovelVelho) {
		this.imovelVelho = imovelVelho;
	}
	
	public int valorImovel() {
		setValorImovel(this.getPreco() - this.imovelVelho);
		return valorImovel();
	}
}
