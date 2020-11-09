package br.newtonpaiva.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private String idCarrinho;
	private Double valorTotal;
	private List<Produto> produtos = new ArrayList<>();
	private List<PromocaoCarrinho> promocoes = new ArrayList<>();
	private Pedido pedido;
	
	public Carrinho() {
		
	}

	public Carrinho(String idCarrinho, Double valorTotal, List<Produto> produtos, List<PromocaoCarrinho> promocoes) {
		this.idCarrinho = idCarrinho;
		this.valorTotal = valorTotal;
		this.produtos = produtos;
		this.promocoes = promocoes;
	}

	public String getIdCarrinho() {
		return idCarrinho;
	}

	public void setIdCarrinho(String idCarrinho) {
		this.idCarrinho = idCarrinho;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<PromocaoCarrinho> getPromocoes() {
		return promocoes;
	}

	public void setPromocoes(List<PromocaoCarrinho> promocoes) {
		this.promocoes = promocoes;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
