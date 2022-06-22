package model;

import java.util.Date;

public abstract class Pessoa {
	private long id;
	private String nome, email, telefone, usuario, senha;
	private Date dataNascimento;
	private Endereco endereco; 

	public Pessoa(long id, String nome, String email, String telefone, String usuario, String senha,
			Date dataNascimento, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.usuario = usuario;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public Pessoa() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", usuario="
				+ usuario + ", senha=" + senha + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + "]";
	}

}
