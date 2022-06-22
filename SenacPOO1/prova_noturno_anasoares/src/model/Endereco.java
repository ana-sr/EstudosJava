package model;

public class Endereco {
	private long id;
	private String rua, complemento, bairro, cidade, estado, pais;
	private int numero;

	public Endereco(long id, String rua, String complemento, String bairro, String cidade, String estado, String pais,
			int numero) {
		super();
		this.id = id;
		this.rua = rua;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.numero = numero;
	
	}

	public Endereco() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "\nEndereco \nid=" + id + ", \nrua=" + rua + ", \ncomplemento=" + complemento + ", \nbairro=" + bairro
				+ ", \ncidade=" + cidade + ", \nestado=" + estado + ", \npais=" + pais + ", \nnumero=" + numero;
	}

}
