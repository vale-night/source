/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karin
 */
public class Organizador {
    private String idOrganizador;
    private String email;
    private String senha;
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private List<Endereco> enderecos = new ArrayList<>();
	private List<Arquivo> arquivos = new ArrayList<>();

    
    public Organizador(String idOrganizador, String email, String senha, String cnpj, String razaoSocial, String nomeFantasia){
        this.idOrganizador = idOrganizador;
        this.email = email;
        this.senha = senha;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
                
    }
    
    public Organizador() {
	}

	public String getIdOrganizador(){
        return this.idOrganizador;
    }
    
    public void setIdOrganizador(String idOrganizador){
        this.idOrganizador = idOrganizador;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getSenha(){
        return this.senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    
    public String getNomeFantasia(){
        return this.nomeFantasia;
    }
    
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Arquivo> getArquivos() {
		return arquivos;
	}

	public void setArquivos(List<Arquivo> arquivos) {
		this.arquivos = arquivos;
	}
    
	public void enviarArquivo() {
		//TODO - Implementar
	}
}
