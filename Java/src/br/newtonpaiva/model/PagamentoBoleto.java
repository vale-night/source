package br.newtonpaiva.model;

public class PagamentoBoleto implements ServicoPagamento {
    private String numeroBoleto;
    private String cpfPagante;
    private Comprador comprador;

    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public String getCpfPaganete() {
        return cpfPagante;
    }

    public void setCpfPaganete(String cpfPaganete) {
        this.cpfPagante = cpfPaganete;
    }

    public String gerarHash(){
        // todo
        return "";
    }

	@Override
	public String gerarCheckout() {
		// TODO Criar
		return null;
	}

	@Override
	public String receberPostback(String identificador) {
		// TODO Criar
		return null;
	}

	@Override
	public StatusPagamento mapearStatus(String statusGatewayPagamento) {
		// TODO Criar
		return null;
	}

	@Override
	public String getIdentificador() {
		// TODO Melhorar
		return numeroBoleto;
	}
	
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	@Override
	public Comprador getComprador() {
		return comprador;
	}
}
