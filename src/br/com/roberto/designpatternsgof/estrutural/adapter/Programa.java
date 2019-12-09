package br.com.roberto.designpatternsgof.estrutural.adapter;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {

		/*
		 * A diferen�a principal entre bridges e adapters � a motiva��o
		 * O adapter adapta uma interface antinga
		 * a uma interface nova do seu sistema
		 */
		
		Relogio relogio = new RelogioDoSistema();
		Calendar dataAtual = relogio.hoje();

	}

}
