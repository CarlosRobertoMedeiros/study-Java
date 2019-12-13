package br.com.roberto.grasp.openclosedprincipleandDependencyInversalPrinciple;

public class TabelaDePrecoDiferenciada implements TabelaDePreco{

	@Override
	public double descontoPara(double valor) {
		return 0;
	}

}
