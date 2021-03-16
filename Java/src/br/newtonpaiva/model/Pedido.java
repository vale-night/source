package br.newtonpaiva.model;

import java.util.Date;

public class Pedido {
	
	private String idPedido;
	private Date data;
	private Float valorOriginal;
	private Float valorEspecial;
	private String codigoRetirada;
	private Pagamento pagamento;
	private StatusPedido status;
	private Endereco enderecoEntrega;
	
	public Pedido() {
		
	}

	public Pedido(String idPedido, Date data, Float valorOriginal, Float valorEspecial, String codigoRetirada,
			Pagamento pagamento, StatusPedido status) {
		this.idPedido = idPedido;
		this.data = data;
		this.valorOriginal = valorOriginal;
		this.valorEspecial = valorEspecial;
		this.codigoRetirada = codigoRetirada;
		this.pagamento = pagamento;
		this.status = status;
	}

	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Float getValorOriginal() {
		return valorOriginal;
	}

	public void setValorOriginal(Float valorOriginal) {
		this.valorOriginal = valorOriginal;
	}

	public Float getValorEspecial() {
		return valorEspecial;
	}

	public void setValorEspecial(Float valorEspecial) {
		this.valorEspecial = valorEspecial;
	}

	public String getCodigoRetirada() {
		return codigoRetirada;
	}

	public void setCodigoRetirada(String codigoRetirada) {
		this.codigoRetirada = codigoRetirada;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public void efetuarPagamento() {
		//TODO - Implementar
		this.pagamento.getServicoPagamento().gerarCheckout();//Só de exemplo kaka
	}
}
