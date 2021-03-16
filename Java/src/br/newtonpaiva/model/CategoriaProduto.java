package br.newtonpaiva.model;

import java.util.ArrayList;
import java.util.List;

public class CategoriaProduto {

	private String idCategoriaProduto;
	private String nome;
	private CategoriaProduto categoriaPai;
	
	private List<Produto> produtos = new ArrayList<>();//TODO - Implementar relacionamento N:N
	
	public CategoriaProduto() {
		
	}

	public CategoriaProduto(String idCategoriaProduto, String nome, CategoriaProduto categoriaPai,
			List<Produto> produtos) {
		super();
		this.idCategoriaProduto = idCategoriaProduto;
		this.nome = nome;
		this.categoriaPai = categoriaPai;
		this.produtos = produtos;
	}

	public String getIdCategoriaProduto() {
		return idCategoriaProduto;
	}

	public void setIdCategoriaProduto(String idCategoriaProduto) {
		this.idCategoriaProduto = idCategoriaProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CategoriaProduto getCategoriaPai() {
		return categoriaPai;
	}

	public void setCategoriaPai(CategoriaProduto categoriaPai) {
		this.categoriaPai = categoriaPai;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
