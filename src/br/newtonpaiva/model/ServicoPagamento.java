package br.newtonpaiva.model;

public interface ServicoPagamento {

    Pagamento pagamento = new Pagamento();

    public String gerarCheckout();
    public String receberPostback(String identificador);
    public StatusPagamento mapearStatus(String statusGatewayPagamento);
}
