package br.newtonpaiva;
import br.newtonpaiva.model.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Teste Arquivo: " + testaArquivo());
		System.out.println("Teste PagamentoBoleto: " + testaPagamentoBoleto());
		System.out.println("Teste PagamentoCartaoCredito: " + testaPagamentoCartaoCredito());
		System.out.println("Teste Carrinho: " + testaCarrinho());
        System.out.println("Teste Cliente: " + testacliente());
        System.out.println("Teste Organizador: " + testaorganizador());
                
	}
	
	public static boolean testaArquivo() {
		Arquivo a1 = new Arquivo();
		return a1 != null;
	}
	
	public static boolean testaPagamentoBoleto() {
		PagamentoBoleto pagamento = new PagamentoBoleto();
		pagamento.setNumeroBoleto("123421");
		return pagamento != null && pagamento.getNumeroBoleto().equals(pagamento.getIdentificador());
	}
	
	public static boolean testaPagamentoCartaoCredito() {
		PagamentoCartaoCredito pagamento = new PagamentoCartaoCredito();
		pagamento.setHash("hashdecartaodecreditoaleatoria");
		return pagamento != null && pagamento.getHash().equals(pagamento.getIdentificador());
	}
	
	public static boolean testaCarrinho() {
		Carrinho carrinho = new Carrinho();
		return carrinho != null && carrinho.getProdutos() != null;
	}
        
    public static boolean testacliente(){
        Cliente cliente = new Cliente();
        return cliente != null;
        
    }
    
    public static boolean testaorganizador(){
        Organizador organizador = new Organizador();
        return organizador != null;
    }
	

}
