package br.com.roberto.grasp.encapsulamento;

/**
 * O Processador Encapsulou bem a regra de fatura
 * Ficou bem escondido a maneira de usar a fatura no processador
 * 
 * O que o método faz ? fatura.adicionaPagamento
 * Como o método faz ? não sei ... melhor coisa pois a responsabilidade não está aqui e sim em fatura
 * */

public class ProcessadorDeBoletos {

	public void processa(List<Boleto>, Fatura fatura) {
		
		
		for (Boleto boleto:boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(),
					MeioDePagamento.BOLETO);
			
			fatura.adicionaPagamento(pagamento);
			
		}
	}
}
