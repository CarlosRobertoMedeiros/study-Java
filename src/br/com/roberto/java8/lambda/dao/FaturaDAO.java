package br.com.roberto.java8.lambda.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.roberto.java8.lambda.modelo.*;


public class FaturaDAO {
	
	public List<Fatura> buscarFaturasVencidas(){
		List<Fatura> faturas = new ArrayList<>();
		
		faturas.add(new Fatura("João",350.0));
		faturas.add(new Fatura("Maria",150.0));
		faturas.add(new Fatura("José",290.0));
		
		return faturas;
	}
}
