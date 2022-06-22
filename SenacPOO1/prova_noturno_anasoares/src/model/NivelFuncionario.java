package model;

public enum NivelFuncionario {
	PESSIMO("Péssimo"), RUIM("Ruim"), REGULAR("Regular"), BOM("Bom"), OTIMO("Ótimo");

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
