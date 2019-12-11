package br.com.roberto.grasp.acoplamentoeescalabilidade;

public class NotaFiscalDao implements AcaoAposGerarNota{
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Salva NF no Banco");
	}

}
