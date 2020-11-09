package br.newtonpaiva.model;

import java.util.Date;

public class Arquivo {
	
	private String idArquivo;
	private String nome;
	private Date dataUpload;
	private String caminhoArquivo;
	
	public Arquivo() {
		
	}
	
	public Arquivo(String idArquivo, String nome, Date dataUpload, String caminhoArquivo) {
		super();
		this.idArquivo = idArquivo;
		this.nome = nome;
		this.dataUpload = dataUpload;
		this.caminhoArquivo = caminhoArquivo;
	}



	public String getIdArquivo() {
		return idArquivo;
	}
	public void setIdArquivo(String idArquivo) {
		this.idArquivo = idArquivo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataUpload() {
		return dataUpload;
	}
	public void setDataUpload(Date dataUpload) {
		this.dataUpload = dataUpload;
	}
	public String getCaminhoArquivo() {
		return caminhoArquivo;
	}
	public void setCaminhoArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}
	
	
}
