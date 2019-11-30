package br.com.roberto.designpatternsgof.estrutural.decorator2;

public class CoberturaExtraDupla extends Extras {

	public CoberturaExtraDupla(Pedido pedido, String tipo, double preco) {
		super(pedido, tipo, preco);
	}

	@Override
	public double getPreco() {
		return (this.preco * 2) + pedido.getPreco();
	}
}
