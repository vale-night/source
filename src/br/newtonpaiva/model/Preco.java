package br.newtonpaiva.model;

public class Preco extends Filtro {
	public Float precoMedio;

	public Float getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(Float precoMedio) {
		this.precoMedio = precoMedio;
	}
	
	public void calcularPrecoMedio(Evento evento) {}
}
