package br.newtonpaiva.model;

import java.util.Date;

public class Pagamento {
    private String idPagamento;


    private Date date;
    private float valor;
    private StatusPagamento statusPagamento;
    private ServicoPagamento servicoPagamento;

    public String getIdPagamento() {
    	return idPagamento;
    }
    
    public void setIdPagamento(String idPagamento) {
    	this.idPagamento = idPagamento;
    }
    
    public StatusPagamento getStatusPagamento() {
    	return statusPagamento;
    }
    
    public void setStatusPagamento(StatusPagamento statusPagamento) {
    	this.statusPagamento = statusPagamento;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

	public ServicoPagamento getServicoPagamento() {
		return servicoPagamento;
	}

	public void setServicoPagamento(ServicoPagamento servicoPagamento) {
		this.servicoPagamento = servicoPagamento;
	}
    
    
}
