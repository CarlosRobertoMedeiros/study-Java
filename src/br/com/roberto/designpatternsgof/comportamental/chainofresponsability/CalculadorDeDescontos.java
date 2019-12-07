package br.com.roberto.designpatternsgof.comportamental.chainofresponsability;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {

		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();

		//Ligando a cadeia de desconto
		d1.setProximo(d2);
		d2.setProximo(d3);

		return d1.desconta(orcamento);

	}
}