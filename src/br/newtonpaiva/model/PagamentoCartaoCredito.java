package br.newtonpaiva.model;

public class PagamentoCartaoCredito implements ServicoPagamento {
    private String numeroCartao;
    private String validadeCartao;
    private String nomeCartao;
    private int cvv;
    private String hash;
    private Comprador comprador;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getValidadeCartao() {
        return validadeCartao;
    }

    public void setValidadeCartao(String validadeCartao) {
        this.validadeCartao = validadeCartao;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String  criptografar(){
        // todo
        return "";
    }

	@Override
	public String gerarCheckout() {
		// TODO criar
		return null;
	}

	@Override
	public String receberPostback(String identificador) {
		// TODO criar
		return null;
	}

	@Override
	public StatusPagamento mapearStatus(String statusGatewayPagamento) {
		// TODO criar
		return null;
	}

	@Override
	public String getIdentificador() {
		// TODO Melhorar
		return hash;
	}
	
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	@Override
	public Comprador getComprador() {
		return comprador;
	}
}
