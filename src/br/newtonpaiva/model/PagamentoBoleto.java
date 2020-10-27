package br.newtonpaiva.model;

public class PagamentoBoleto {
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
}
