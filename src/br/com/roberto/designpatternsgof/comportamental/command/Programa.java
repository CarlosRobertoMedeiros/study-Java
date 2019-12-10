package br.com.roberto.designpatternsgof.comportamental.command;

public class Programa {

	public static void main(String[] args) {

		/*
		 * Encapsula um command para ser executado no futuro através do processa **/
		
		Pedido pedido1 = new Pedido("Carlos Roberto", 150.0);
		Pedido pedido2 = new Pedido("Luciene Alves", 50.0);

		FilaDeTrabalho filaDeTrabalho = new FilaDeTrabalho();
		filaDeTrabalho.adiciona(new PagaPedido(pedido1));
		filaDeTrabalho.adiciona(new PagaPedido(pedido2));
		filaDeTrabalho.adiciona(new ConcluiPedido(pedido1));

		filaDeTrabalho.processa();

	}

}
