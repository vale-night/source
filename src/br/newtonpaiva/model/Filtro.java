package br.newtonpaiva.model;

public abstract class Filtro {
	public Integer idFiltro;
	public String nome;
	public String descricao;
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
	
	
	
}
