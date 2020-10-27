package br.newtonpaiva.model;

public enum StatusPagamento {
    PEDENTE(1),
    EM_ANDAMENTO(2),
    EM_ESPERA(3),
    CONCLUIDO(4),
    CANCELADO(5);

    private final int status;
    StatusPagamento(int statusOpcao){
        status = statusOpcao;
    }
    public int getStatus(){
        return status;
    }
}
