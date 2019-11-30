package br.com.roberto.designpatternsgof.estrutural.decorator2;

public class CoberturaSemCusto extends Extras {

	public CoberturaSemCusto(Pedido pedido, String tipo, double preco) {
		super(pedido, tipo, preco);
	}

	@Override
	public double getPreco() {
		return pedido.getPreco();
	}

}
