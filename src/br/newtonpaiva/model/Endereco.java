package br.newtonpaiva.model;

import javafx.scene.text.Text;

public class Endereco {
    private Text idEndreço;
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;
    private String complemento;
    private String latitude;
    private String longitude;

    public Endereco(Text idEndreço, String rua, String bairro, String cidade, String uf, String complemento, String latitude, String longitude) {
        this.idEndreço = idEndreço;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.complemento = complemento;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Text getIdEndreço() {
        return idEndreço;
    }

    public void setIdEndreço(Text idEndreço) {
        this.idEndreço = idEndreço;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    
    
}
