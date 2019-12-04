package br.com.roberto.designpatternsgof.comportamental.observer;

public class ChamadorNotaFiscal {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder(); 
		
		builder.paraEmpresa("Minha Empresa")
			.comCNPJ("12.123.123/000-00")
			.comItens(new ItemDaNota("Item 1", 200))
			.comItens(new ItemDaNota("Item 2", 300))
			.comItens(new ItemDaNota("Item 3", 400))
			.comObservacoes("Observações")
			.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
