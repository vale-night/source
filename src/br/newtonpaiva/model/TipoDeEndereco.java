package br.newtonpaiva.model;

public class TipoDeEndereco {
    private int IdTipoEndereco;
    private String nome;
    private String descricao;

    public TipoDeEndereco(int IdTipoEndereco, String nome, String descricao) {
        this.IdTipoEndereco = IdTipoEndereco;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getIdTipoEndereco() {
        return IdTipoEndereco;
    }

    public void setIdTipoEndereco(int IdTipoEndereco) {
        this.IdTipoEndereco = IdTipoEndereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
