package br.newtonpaiva.model;

public abstract class ServicoPagamento {

    Pagamento pagamento = new Pagamento();

    public abstract String gerarCheckout();
    public abstract String receberPostback(String identificador);
    public abstract StatusPagamento mapearStatus(String statusGatewayPagamento);
}
