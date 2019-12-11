package br.com.roberto.grasp.acoplamentoeescalabilidade;

import java.util.List;

public class GeradorDeNotaFiscal {
	
	private List<AcaoAposGerarNota> acoes;

	public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		//Mudança Realizada Aqui
		//Acabei de Implementar um Observer
		//O chamador vai chamar a classe concreta 
		//Sempre Interfaceie código com algo concreto
		for  (AcaoAposGerarNota acao:acoes) {
			acao.executa(nf);
		}
		
		return nf;
	}
	
	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
	

}
