package br.newtonpaiva.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PromocaoCarrinho {

	private Date dataInicio;
	private Date dataFim;
	private String cupom;
	private Float parametroPreco;
	private List<Carrinho> carrinhos = new ArrayList<>();//TODO - Implementar relacionamento N:N
	
	public PromocaoCarrinho() {
		
	}
	
	public PromocaoCarrinho(Date dataInicio, Date dataFim, String cupom, Float parametroPreco,
			List<Carrinho> carrinhos) {
		super();
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cupom = cupom;
		this.parametroPreco = parametroPreco;
		this.carrinhos = carrinhos;
	}



	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getCupom() {
		return cupom;
	}

	public void setCupom(String cupom) {
		this.cupom = cupom;
	}

	public Float getParametroPreco() {
		return parametroPreco;
	}

	public void setParametroPreco(Float parametroPreco) {
		this.parametroPreco = parametroPreco;
	}

	public List<Carrinho> getCarrinhos() {
		return carrinhos;
	}

	public void setCarrinhos(List<Carrinho> carrinhos) {
		this.carrinhos = carrinhos;
	}
	
	
}
