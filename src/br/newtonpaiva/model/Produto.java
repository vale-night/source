package br.newtonpaiva.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Produto {
	public String idProduto;
	public String nomeProduto;
	public Double preco;
	public Double precoEspecial;
	public Date dataInicioPromocao;
	public Date dataFimPromocao;
	public List<CategoriaProduto> categorias = new ArrayList<>();//TODO - Implementar relacionamento N:N
	public TipoDeProduto tipo;
	
	public Produto() {
		
	}
	
	public Produto(String idProduto, String nomeProduto, Double preco, Double precoEspecial, Date dataInicioPromocao,
			Date dataFimPromocao, List<CategoriaProduto> categorias, TipoDeProduto tipo) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.precoEspecial = precoEspecial;
		this.dataInicioPromocao = dataInicioPromocao;
		this.dataFimPromocao = dataFimPromocao;
		this.categorias = categorias;
		this.tipo = tipo;
	}



	public String getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getPrecoEspecial() {
		return precoEspecial;
	}
	public void setPrecoEspecial(Double precoEspecial) {
		this.precoEspecial = precoEspecial;
	}
	public Date getDataInicioPromocao() {
		return dataInicioPromocao;
	}
	public void setDataInicioPromocao(Date dataInicioPromocao) {
		this.dataInicioPromocao = dataInicioPromocao;
	}
	public Date getDataFimPromocao() {
		return dataFimPromocao;
	}
	public void setDataFimPromocao(Date dataFimPromocao) {
		this.dataFimPromocao = dataFimPromocao;
	}
	public List<CategoriaProduto> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<CategoriaProduto> categorias) {
		this.categorias = categorias;
	}
	public TipoDeProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeProduto tipo) {
		this.tipo = tipo;
	}
	
	
}
