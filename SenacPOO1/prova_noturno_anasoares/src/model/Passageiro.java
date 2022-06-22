package model;

import java.util.Date;

public class Passageiro extends Pessoa {
	private Consumidor consumidor;
	private String numeroCartao, documento;

	public Passageiro(long id, String nome, String email, String telefone, String usuario, String senha,
			Date dataNascimento, Endereco endereco, Consumidor consumidor, String numeroCartao, String documento) {
		super(id, nome, email, telefone, usuario, senha, dataNascimento, endereco);
		this.consumidor = consumidor;
		this.numeroCartao = numeroCartao;
		this.documento = documento;
	}

	public Passageiro() {
		// TODO Auto-generated constructor stub
	}

	public Consumidor getConsumidor() {
		return consumidor;
	}

	public void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "\nPassageiro \nconsumidor=" + consumidor.getDescricao() + ", \nnumeroCartao=" + numeroCartao
				+ ", \ndocumento=" + documento;
	}

}

