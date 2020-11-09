package br.newtonpaiva.model;

public enum TipoDeProduto {
	
	INGRESSO(0, "Ingresso"), 
	CONSUMIVEL(1, "Consumível");
	
	private final int id;
	private final String descricao;
	
	private TipoDeProduto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
