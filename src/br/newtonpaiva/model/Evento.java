package br.newtonpaiva.model;

import java.util.List;

public class Evento {
	
	private String idEvento;
	private String nome;
	private String descricao;
	private boolean destaque = false;
	private String faixaEtaria;
	
	private List<Filtro> filtros;
	
	public Evento() {
		
	}
	
	public Evento(String idEvento, String nome, String descricao, String faixaEtaria) {
		this.idEvento = idEvento;
		this.nome = nome;
		this.descricao = descricao;
		this.faixaEtaria = faixaEtaria;
	}

	public String getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
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

	public boolean isDestaque() {
		return destaque;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	public List<Filtro> getFiltros() {
		return filtros;
	}

	public void setFiltros(List<Filtro> filtros) {
		this.filtros = filtros;
	}

	public void destacarEvento() {
		//TODO - Lógica e regras de negócio para destacar o evento
		this.destaque = true;
	}
	
	public static List<Evento> filtrar(Evento parametros) {
		//TODO - Implementar
		return null;
	}
	
}
