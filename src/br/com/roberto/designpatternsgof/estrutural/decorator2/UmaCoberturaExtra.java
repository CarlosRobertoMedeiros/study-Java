package br.com.roberto.designpatternsgof.estrutural.decorator2;

public class UmaCoberturaExtra extends Extras{

	public UmaCoberturaExtra(Pedido pedido , String tipo, double preco) {
		super(pedido, tipo, preco);
	}
	
	@Override
	public double getPreco() {
		return this.preco+pedido.getPreco();
	}

}
