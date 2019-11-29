package br.com.roberto.designpatternsgof.comportamental.chainofresponsability;

public interface Desconto {

	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);

}
