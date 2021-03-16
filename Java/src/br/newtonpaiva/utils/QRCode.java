package br.newtonpaiva.utils;

import br.newtonpaiva.model.Pedido;

public class QRCode {
	
	public String gerarQRCodePedido(Pedido pedido) {
		pedido.setCodigoRetirada("QRCode loucão");
		return pedido.getCodigoRetirada();//TODO - Implementar
	}
	
	public void confirmarQRCodePedido(String codigoRetirada) {
		//TODO - Liberar o resto das coisas
	}
	
}
