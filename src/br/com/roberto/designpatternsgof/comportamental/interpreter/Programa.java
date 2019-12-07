package br.com.roberto.designpatternsgof.comportamental.interpreter;

public class Programa {
	
/*
 * Observar a �rvore para realizar o c�lculo das express�es
 * Usa-se polimorfismo para realizar o c�lculo das �rvores
					  +
	              /       \
	             -          +
	          10 -5       10 + 2
	            5           12
	                  17
*/
	
	public static void main(String[] args) {
		
		Expressao esquerda = new Subtracao(new Numero(10) , new Numero(5));
		Expressao direita = new Soma(new Numero(2) , new Numero(10));
		Expressao soma = new Soma(esquerda,direita);
		
		int resultado = soma.avalia();
		
		System.out.println(resultado);
		
		//Cuidado com a �rvore de express�es Exemplo mais complicado
		esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(10));
		direita = new Soma(new Numero(2) , new Numero(10));
		soma = new Soma(esquerda,direita);
		
		resultado = soma.avalia();
		
		System.out.println(resultado);
		
		
	}
}
