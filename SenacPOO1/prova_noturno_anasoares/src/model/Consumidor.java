package model;

public enum Consumidor {
	PESSIMO("Péssimo"), RUIM("Ruim"), REGULAR("Regular"), BOM("Bom"), OTIMO("Ótimo");

	private String descricao;

	Consumidor(String descricao) {
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

