package br.com.roberto.designpatternsgof.comportamental.observer;

public class ChamadorTesteDeAcoes {
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new EnviadorDeSMS());
		builder.adicionaAcao(new Impressora());
		
		NotaFiscal nf = builder.paraEmpresa("MRD Solucoes em TI")
							   .comCNPJ("123")
							   .comItens(new ItemDaNota("Caneta", 10))
							   .comObservacoes("obs")
							   .naDataAtual()
							   .constroi();
		System.out.println(nf.getValorBruto());
	}

}
