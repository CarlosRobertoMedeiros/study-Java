package br.com.roberto.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LoopsAntesDoJava8 {

	public static void main(String[] args) {

		/**
		 * Resumo do Processo
		 * 
		 *  1 - Cria��o dos Usu�rios na Lista
		 *  2 - M�todo convencional de lista usando o enhancedFor
		 *  3 - Criando uma Classe Consumidor Assinando o contrato da Interface Consumer
		 *  4 - Criando um M�todo an�nimo de Consumer a partir da interface
		 *  5 - Usando Lambda 
		 *  6 - Refinando o Lambda
		 * 
		 */
		
		Usuario usuario1 = new Usuario("Carlos Roberto", 150);
		Usuario usuario2 = new Usuario("Antonio Nunes", 120);
		Usuario usuario3 = new Usuario("Luciene Alves", 190);

		
		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

		//Modelo usado desde o Java 5
		/*

		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
		*/
		
		//Novo m�todo dentro de cada cole��o
		//Usando um Consumer 
		//Aqui Foi Criado um Consumer
		/*
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);
		
		*/
		
		//Criando um consumer como classe an�nima
		//O Byte Code Gerado da Classe An�nima � Assim: LoopsAntesDoJava8$1.class n�o referencia a classe
		/*
		Consumer<Usuario> mostrador = new Consumer<Usuario>(){

			@Override
			public void accept(Usuario t) {
				System.out.println(t);
			}
		};
		
		usuarios.forEach(mostrador);
		*/
		
		//Usando Lambda Java 8 - Fase 1 
		/*
		Consumer<Usuario> mostrador = (Usuario u) -> {System.out.println(u);};
		usuarios.forEach(mostrador);
		*/
		
		//Usando Lambda Java 8 - Fase 2
		/*
		Consumer<Usuario> mostrador = u -> {System.out.println(u);};
		usuarios.forEach(mostrador);
		*/
		
		//Usando Lambda Java 8 - Fase 3 - Caso Precise Mostrar apenas uma linha
		/*
		Consumer<Usuario> mostrador = u -> System.out.println(u);
		usuarios.forEach(mostrador);
		*/
		
		//Usando Lambda Java 8 - Fase 4 - Caso Precise Mostrar apenas uma linha
		usuarios.forEach(u -> System.out.println(u));
		
		
	}
}


class Mostrador implements Consumer<Usuario>{

	@Override
	public void accept(Usuario t) {
		System.out.println(t);
	}
}


class Usuario {

	private String nome;
	private int pontos;
	private boolean moderador;

	public Usuario(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public boolean isModerador() {
		return moderador;
	}

	public void tornaModerador() {
		this.moderador = true;
	}

	@Override
	public String toString() {
		return "[Nome = " + this.nome + " " +" Pontos = " + this.pontos + "]";
	}

}
