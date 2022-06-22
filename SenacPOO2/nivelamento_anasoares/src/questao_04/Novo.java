package questao_04;

public class Novo extends Imovel {
	private int imovelNovo;
	private int valorImovel;
	
	
	
	public int getImovelNovo() {
		return imovelNovo;
	}

	public void setImovelNovo(int imovelNovo) {
		this.imovelNovo = imovelNovo;
	}
	
	public int valorImovel() {
		setValorImovel(this.getPreco() + this.imovelNovo);
		return valorImovel();
	}

	public int getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(int valorImovel) {
		this.valorImovel = valorImovel;
	}
}
