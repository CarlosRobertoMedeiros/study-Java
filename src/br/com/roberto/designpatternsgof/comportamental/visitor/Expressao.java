package br.com.roberto.designpatternsgof.comportamental.visitor;

public interface Expressao {
	int avalia();

	void aceita(Visitor impressora);
}
