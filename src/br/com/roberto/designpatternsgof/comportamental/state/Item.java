package br.com.roberto.designpatternsgof.comportamental.state;

public class Item {

	private String nome;
	private Double valor;

	public Item(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
	}

}
