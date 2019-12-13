package br.com.roberto.grasp.openclosedprincipleandDependencyInversalPrinciple;

public class CalculadoraDePrecos {

	private TabelaDePreco tabela;
	private ServicoDeEntrega entrega;

	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {
		//Interfaciei pelo construtor
		this.tabela = tabela;
		this.entrega = entrega;
	}

	public double calcula(Compra produto) {

		double desconto = tabela.descontoPara(produto.getValor());
		double frete = entrega.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}
