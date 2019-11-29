package br.com.roberto.designpatternsgof.comportamental.strategy;

public class ICMS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	

}
