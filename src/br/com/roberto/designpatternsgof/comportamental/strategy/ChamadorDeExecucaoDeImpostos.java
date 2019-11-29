package br.com.roberto.designpatternsgof.comportamental.strategy;

public class ChamadorDeExecucaoDeImpostos {

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Orcamento orcamento = new Orcamento(500);

		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		calculadorDeImpostos.realizaCalculo(orcamento, iss);
		calculadorDeImpostos.realizaCalculo(orcamento, icms);
	}
}
