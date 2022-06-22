package model;

public class Produto {
	private int codigo;
    private String nome;
    private double preco;
    private boolean precisaReceita, temEstoque, eNovo, estaVencido;
    private char tipo;
    
    public String verificarTipo(){
   	 switch(tipo) {
   	 case 'I':return "Importado"; 
   	 case 'N':return "Nacinal";
   	 default: return "Erro";
   	 }
    }

    
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isPrecisaReceita() {
		return precisaReceita;
	}

	public void setPrecisaReceita(boolean precisaReceita) {
		this.precisaReceita = precisaReceita;
	}

	public boolean isTemEstoque() {
		return temEstoque;
	}

	public void setTemEstoque(boolean temEstoque) {
		this.temEstoque = temEstoque;
	}

	public boolean iseNovo() {
		return eNovo;
	}

	public void seteNovo(boolean eNovo) {
		this.eNovo = eNovo;
	}

	public boolean isEstaVencido() {
		return estaVencido;
	}

	public void setEstaVencido(boolean estaVencido) {
		this.estaVencido = estaVencido;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", precisaReceita="
				+ precisaReceita + ", temEstoque=" + temEstoque + ", eNovo=" + eNovo + ", estaVencido=" + estaVencido
				+ ", tipo=" + tipo + "]";
	}
	
	
    
    
}