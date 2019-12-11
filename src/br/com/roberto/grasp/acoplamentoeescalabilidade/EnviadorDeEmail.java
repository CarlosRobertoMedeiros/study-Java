package br.com.roberto.grasp.acoplamentoeescalabilidade;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Envia email da NF "+ nf.getId());
	}

}
