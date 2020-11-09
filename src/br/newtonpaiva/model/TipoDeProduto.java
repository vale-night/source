package br.newtonpaiva.model;

public enum TipoDeProduto {
	
	INGRESSO(0, "Ingresso"), 
	CONSUMIVEL(1, "Consumível");
	
	private int id;
	private String descricao;
	
	private TipoDeProduto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	
}
