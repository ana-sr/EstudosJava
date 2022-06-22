package model;

public enum NivelFuncionario {
	PESSIMO("P�ssimo"), RUIM("Ruim"), REGULAR("Regular"), BOM("Bom"), OTIMO("�timo");

	private String descricao;

	NivelFuncionario(String descricao) {
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
