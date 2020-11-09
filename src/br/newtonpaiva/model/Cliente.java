/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.model;

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
    
    
    public Cliente(String email, String senha, String cpf, String nome, String idCliente){
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.nome = nome;
        this.idCliente = idCliente;
        
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
    
}
