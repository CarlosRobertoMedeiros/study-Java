package br.com.roberto.grasp.openclosedprincipleandDependencyInversalPrinciple;

public class TesteCalculadoraDePrecos {
	
	public static void main(String[] args) {
		
		//A idéia aqui é 
		// Classe Aberta para Extensão (Extensão feita através da utilização das interfaces)
		// Classe Fechada para Modificação(Não preciso ir na classe mudar o comportamento da tabela de preços nem do frete)
		// Dependendo da tabela que eu quiser usar  TabelaDePrecoPadrao ou TabelaDePrecoDiferenciado
		// Preciso apenas informar aqui
		
		// O mesmo serve para o serviço de entrega
		
		// Dependency Inversal Principle (DIP)
		// O princípio de Inversão de Dependência(Não confundir com injeção de dependência ... nada a ver)
		// Dependa da Interface e não da implementação 
	
		// PENSAR 100% NA ABSTRAÇÃO
		
		TabelaDePreco tabela = new TabelaDePrecoPadrao();
		ServicoDeEntrega entrega = new Frete();
		
		CalculadoraDePrecos calculadora = new CalculadoraDePrecos(tabela, entrega);
		
		
		
		
	}

}
