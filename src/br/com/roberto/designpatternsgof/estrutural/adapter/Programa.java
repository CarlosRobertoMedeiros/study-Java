package br.com.roberto.designpatternsgof.estrutural.adapter;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {

		/*
		 * A diferença principal entre bridges e adapters é a motivação
		 * O adapter adapta uma interface antinga
		 * a uma interface nova do seu sistema
		 */
		
		Relogio relogio = new RelogioDoSistema();
		Calendar dataAtual = relogio.hoje();

	}

}
