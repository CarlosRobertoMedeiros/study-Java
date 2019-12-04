package br.com.roberto.designpatternsgof.comportamental.observer;

public class NotaFiscalDAO implements AcaoAposGerarNota{
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Salvei no Banco de Dados");
	}


}
