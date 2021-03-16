package br.newtonpaiva.model;

public class Comprador {
	private String nome;
	private String cpf;
	private String ruaEndereco;
	private String numeroEndereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String complemento;
	
	public Comprador() {
		
	}
	
	public Comprador(Pedido pedido) {
		this.nome = "";//TODO - Adicionar usuário ao pedido
		this.cpf = ""; //TODO - Adicionar usuário
		this.ruaEndereco = pedido.getEnderecoEntrega().getRua();
		this.numeroEndereco = pedido.getEnderecoEntrega().getNumero();
		this.bairro = pedido.getEnderecoEntrega().getBairro();
		this.cidade = pedido.getEnderecoEntrega().getCidade();
		this.uf = pedido.getEnderecoEntrega().getUf();
		this.complemento = pedido.getEnderecoEntrega().getComplemento();
	} 

	public Comprador(String nome, String cpf, String ruaEndereco, String numeroEndereco, String bairro, String cidade,
			String uf, String complemento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ruaEndereco = ruaEndereco;
		this.numeroEndereco = numeroEndereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.complemento = complemento;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRuaEndereco() {
		return ruaEndereco;
	}

	public void setRuaEndereco(String ruaEndereco) {
		this.ruaEndereco = ruaEndereco;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
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
	
	
}
