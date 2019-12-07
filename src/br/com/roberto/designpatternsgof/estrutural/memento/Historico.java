package br.com.roberto.designpatternsgof.estrutural.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

	private List<Estado> estadosSalvos = new ArrayList<>();

	public void adiciona(Estado estado) {
		estadosSalvos.add(estado);
	}

	public Estado get(int index) {
		return estadosSalvos.get(index);
	}

}
