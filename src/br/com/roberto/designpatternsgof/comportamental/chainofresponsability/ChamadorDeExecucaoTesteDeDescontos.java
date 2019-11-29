package br.com.roberto.designpatternsgof.comportamental.chainofresponsability;

public class ChamadorDeExecucaoTesteDeDescontos {
	public static void main(String[] args) {

		CalculadorDeDescontos descontos = new CalculadorDeDescontos();

		Orcamento orcamento = new Orcamento(600);
		orcamento.adicionaItem(new Item("Caneta", 250.00));
		orcamento.adicionaItem(new Item("Lapis", 250.00));

		double descontoFinal = descontos.calcula(orcamento);

		System.out.println("Desconto Final =>" + descontoFinal);

	}
}
