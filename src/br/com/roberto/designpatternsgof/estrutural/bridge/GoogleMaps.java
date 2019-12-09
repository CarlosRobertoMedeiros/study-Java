package br.com.roberto.designpatternsgof.estrutural.bridge;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String rua) {
		String googleMaps = "http://maps.google.com.br/maps?q=qsc19";
		URL url;
		
		try {
			url = new URL(googleMaps);
			InputStream openStream = url.openStream();
			//-----
			
			return "mapa";
			
		
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}
