package br.newtonpaiva.model;

public class PagamentoBoleto implements ServicoPagamento {
    private String numeroBoleto;
    private String cpfPaganete;

    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public String getCpfPaganete() {
        return cpfPaganete;
    }

    public void setCpfPaganete(String cpfPaganete) {
        this.cpfPaganete = cpfPaganete;
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
}
