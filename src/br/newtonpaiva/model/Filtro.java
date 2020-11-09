package br.newtonpaiva.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	private Integer idFiltro;
	private String nome;
	private String descricao;
	
	private List<Evento> eventos = new ArrayList<>();//TODO - Implementar relacionamento N:N
	
	public Integer getIdFiltro() {
		return idFiltro;
	}
	public void setIdFiltro(Integer idFiltro) {
		this.idFiltro = idFiltro;
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
	public List<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
}
