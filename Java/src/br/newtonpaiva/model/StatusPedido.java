package br.newtonpaiva.model;

public enum StatusPedido {

	PEDENTE(1, "Pendente", "Pendente"),
	EM_ANDAMENTO(2, "Em andamento", "Em andamento"),
	EM_ESPERA(3, "Em espera", "Em espera"),
	CONCLUIDO(4, "Concluído", "Concluído"),
	CANCELADO(5, "Cancelado", "Cancelado");

	private final int id;
	private final  String nome;
	private final String descricao;
	
	private StatusPedido(int id, String nome,String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}
}
