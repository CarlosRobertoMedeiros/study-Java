package br.com.roberto.designpatternsgof.comportamental.interpreter;

public class Numero implements Expressao {
	
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

}
