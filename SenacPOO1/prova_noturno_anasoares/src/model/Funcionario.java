package model;

import java.util.Date;

public class Funcionario extends Pessoa {
	private String codigo, contaCorrente;
	private NivelFuncionario nivelfuncionario;

	public Funcionario(long id, String nome, String email, String telefone, String usuario, String senha,
			Date dataNascimento, Endereco endereco, String codigo, String contaCorrente,
			NivelFuncionario nivelfuncionario) {
		super(id, nome, email, telefone, usuario, senha, dataNascimento, endereco);
		this.codigo = codigo;
		this.contaCorrente = contaCorrente;
		this.nivelfuncionario = nivelfuncionario;
	}

	public Funcionario() {
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public NivelFuncionario getNivelfuncionario() {
		return nivelfuncionario;
	}

	public void setNivelfuncionario(NivelFuncionario nivelfuncionario) {
		this.nivelfuncionario = nivelfuncionario;
	}

	@Override
	public String toString() {
		return "\nFuncionario \ncodigo=" + codigo + ", \ncontaCorrente=" + contaCorrente + ", \nnivelfuncionario="
				+ nivelfuncionario.getDescricao();
	}

}