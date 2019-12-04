package br.com.roberto.designpatternsgof.comportamental.observer;

public class EnviadorDeSMS implements AcaoAposGerarNota{
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por SMS");
	}
}
