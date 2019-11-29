package br.com.roberto.designpatternsgof.comportamental.strategy;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		System.out.println("Valor do Imposto: " + valorImposto);
	}
}
