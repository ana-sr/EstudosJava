package model;

import java.util.Date;

public class Medicamento extends Produto{
	private String faixa;
	private String bula;
	private Date dataValidade;
	
	//METODOS
	public String getFaixa() {
		return faixa;
	}

	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}

	public String getBula() {
		return bula;
	}

	public void setBula(String bula) {
		this.bula = bula;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public String toString() {
		return "Medicamento [faixa=" + faixa + ", bula=" + bula +
				", dataValidade=" + dataValidade + "]";
	}
	
	
}
