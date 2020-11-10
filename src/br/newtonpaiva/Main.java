package br.newtonpaiva;
import br.newtonpaiva.model.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Teste Arquivo: " + testaArquivo());
		System.out.println("Teste PagamentoBoleto: " + testaPagamentoBoleto());
		System.out.println("Teste Carrinho: " + testaCarrinho());
	}
	
	public static boolean testaArquivo() {
		Arquivo a1 = new Arquivo();
		return a1 != null;
	}
	
	public static boolean testaPagamentoBoleto() {
		PagamentoBoleto pagamento = new PagamentoBoleto();
		pagamento.setNumeroBoleto("123421");
		return pagamento.getNumeroBoleto().equals(pagamento.getIdentificador());
	}
	
	public static boolean testaCarrinho() {
		Carrinho carrinho = new Carrinho();
		return carrinho != null && carrinho.getProdutos() != null;
	}
	

}
