package br.com.roberto.designpatternsgof.criacional.factory;

public class Pessoa {

	private int codigo;
	private String nome;

	Pessoa(int codigp, String nome) {
		this.codigo = codigp;
		this.nome = nome;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getNome() {
		return this.nome;
	}

	@Override
	public String toString() {
		return "[Código = " + this.codigo + " Nome = " + this.nome + " ]\n";
	}

}
