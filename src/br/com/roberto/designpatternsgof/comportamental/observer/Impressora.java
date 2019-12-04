package br.com.roberto.designpatternsgof.comportamental.observer;

public class Impressora implements AcaoAposGerarNota{
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Imprimi a Nota Fiscal");
	}

}
