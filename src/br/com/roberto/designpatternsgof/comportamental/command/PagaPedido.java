package br.com.roberto.designpatternsgof.comportamental.command;

public class PagaPedido implements Comando {

	private Pedido p;

	public PagaPedido(Pedido p) {
		this.p = p;
	}

	@Override
	public void executa() {
		System.out.println("Pagando Pedido do "+p.getCliente());
		p.paga();
	}

}
