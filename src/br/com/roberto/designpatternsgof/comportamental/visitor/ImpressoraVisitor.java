package br.com.roberto.designpatternsgof.comportamental.visitor;

public class ImpressoraVisitor implements Visitor {
	@Override
	public void visitaSoma(Soma soma) {
		System.out.print("(");

		// esquerda
		soma.getEsquerda().aceita(this);

		System.out.print(" + ");

		// direita
		soma.getDireita().aceita(this);

		System.out.print(")");
	}

	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print("(");

		subtracao.getEsquerda().aceita(this);

		// esquerda
		System.out.print(" - ");

		// direita
		subtracao.getEsquerda().aceita(this);

		System.out.print(")");
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());

	}

}
