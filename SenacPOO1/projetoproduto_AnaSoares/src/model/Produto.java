package model;

public class Produto {
	private int codigo ;
	private String nome,descricao,saldo;
	
	
	
	public Produto() {
		
	}
	//insert
	public Produto( String nome, String descricao,String saldo) {
		super();
		this.saldo = saldo;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	//update	
	
	public Produto(int codigo, String nome, String descricao,String saldo) {
		super();
		this.codigo = codigo;
		this.saldo = saldo;
		this.nome = nome;
		this.descricao = descricao;
	}
	//delete
	public Produto(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return "Produto [codigo=" + codigo + ", saldo=" + saldo + ", nome=" + nome + ", descricao=" + descricao + "]";
	}
	
	
}
