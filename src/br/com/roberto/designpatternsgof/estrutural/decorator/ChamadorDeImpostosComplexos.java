package br.com.roberto.designpatternsgof.estrutural.decorator;

public class ChamadorDeImpostosComplexos {

	public static void main(String[] args) {
		//Composição de Imposto
		//Juntar comportamentos quebrados em classes diferentes
		Imposto iss = new ISS(new ICMS(new ISS()));
		Orcamento orcamento = new Orcamento(500);

		double valor = iss.calcula(orcamento);

		System.out.println("Valor do Imposto " + valor);

	}

}
