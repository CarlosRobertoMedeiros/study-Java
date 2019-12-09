package br.com.roberto.designpatternsgof.estrutural.bridge;

public class Programa {
	

	public static void main(String[] args) throws Exception {
		
		// ;......Bridge Uma ponte que segrega a complexidade de um outro sistema nesse exemplo
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("QSC 19");
		
		// ;......Fimd da Bridge
	}
}
