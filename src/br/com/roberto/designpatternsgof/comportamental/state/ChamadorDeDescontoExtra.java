package br.com.roberto.designpatternsgof.comportamental.state;

/**
 * 
 * @author Roberto
 * 
 *         Sendo implementado a troca de estados
 * 
 *         Em Aprovação para Aprovado, Reprovado ou Finalizado Além dos ajustes
 *         financeiros que podem ter de gerar desconto em cada estado 2% para
 *         orçamentos aprovados 5% para orçamentos em aprovação
 */

public class ChamadorDeDescontoExtra {

	public static void main(String[] args) {

		Orcamento reforma = new Orcamento(500);

		reforma.aplicaDescontoExtra();

		System.out.println(reforma.getValor());

		reforma.aprova();

		reforma.aplicaDescontoExtra();

		System.out.println(reforma.getValor());

		reforma.finaliza();

		reforma.aplicaDescontoExtra();

	}
}
