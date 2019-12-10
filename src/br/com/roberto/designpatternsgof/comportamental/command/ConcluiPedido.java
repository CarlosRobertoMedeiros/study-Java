package br.com.roberto.designpatternsgof.comportamental.command;

public class ConcluiPedido implements Comando {

	private Pedido p;

	public ConcluiPedido(Pedido p) {
		this.p = p;
	}

	@Override
	public void executa() {
		System.out.println("Concluindo Pedido do "+p.getCliente());
		p.finaliza();
	}

}
