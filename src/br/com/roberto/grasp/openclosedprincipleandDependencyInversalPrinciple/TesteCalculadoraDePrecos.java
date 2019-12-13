package br.com.roberto.grasp.openclosedprincipleandDependencyInversalPrinciple;

public class TesteCalculadoraDePrecos {
	
	public static void main(String[] args) {
		
		//A id�ia aqui � 
		// Classe Aberta para Extens�o (Extens�o feita atrav�s da utiliza��o das interfaces)
		// Classe Fechada para Modifica��o(N�o preciso ir na classe mudar o comportamento da tabela de pre�os nem do frete)
		// Dependendo da tabela que eu quiser usar  TabelaDePrecoPadrao ou TabelaDePrecoDiferenciado
		// Preciso apenas informar aqui
		
		// O mesmo serve para o servi�o de entrega
		
		// Dependency Inversal Principle (DIP)
		// O princ�pio de Invers�o de Depend�ncia(N�o confundir com inje��o de depend�ncia ... nada a ver)
		// Dependa da Interface e n�o da implementa��o 
	
		// PENSAR 100% NA ABSTRA��O
		
		TabelaDePreco tabela = new TabelaDePrecoPadrao();
		ServicoDeEntrega entrega = new Frete();
		
		CalculadoraDePrecos calculadora = new CalculadoraDePrecos(tabela, entrega);
		
		
		
		
	}

}
