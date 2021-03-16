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
public class Cliente {
    private String email;
    private String senha;
    private String cpf;
    private String nome;
    private String idCliente;
    private List<Endereco> enderecos = new ArrayList<>();
	private List<Arquivo> arquivos = new ArrayList<>();

    public Cliente(String email, String senha, String cpf, String nome, String idCliente){
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.nome = nome;
        this.idCliente = idCliente;
        
    }
    
    public Cliente() {
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
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getIdCliente(){
        return this.idCliente;
    }
    
    public void setIdCliente(String idCliente){
        this.idCliente = idCliente;
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
