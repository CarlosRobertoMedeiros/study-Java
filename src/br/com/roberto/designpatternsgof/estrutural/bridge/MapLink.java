package br.com.roberto.designpatternsgof.estrutural.bridge;

public class MapLink implements Mapa{

	@Override
	public String devolveMapa(String rua) {
		return "Mapa do MapLink";
	}

}
