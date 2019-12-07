package br.com.roberto.designpatternsgof.estrutural.memento;

import java.time.LocalDate;

public class Programa {
	
	public static void main(String[] args) {
		Historico historico = new Historico();

		Contrato contrato1 = new Contrato(LocalDate.now(), "Roberto", TipoContrato.NOVO);
		historico.adiciona(contrato1.salvaEstado());
		System.out.println(contrato1.getTipo());
		
		contrato1.avanca();
		historico.adiciona(contrato1.salvaEstado());
		System.out.println(contrato1.getTipo());
		
		contrato1.avanca();
		historico.adiciona(contrato1.salvaEstado());
		System.out.println(contrato1.getTipo());
		
		Estado estadoAnterior = historico.get(0);
		System.out.println(estadoAnterior.getEstado().getTipo());
		
	}
}
