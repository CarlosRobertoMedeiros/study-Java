package br.com.roberto.designpatternsgof.estrutural.flyweight;

import java.util.Arrays;
import java.util.List;

public class Programa {
	
	public static void main(String[] args) {
		
		NotasMusicais notas = new NotasMusicais();
		
		List<Nota> musica = Arrays.asList(
					notas.get("do"),
					notas.get("re"),
					notas.get("mi"),
					notas.get("fa"),
					notas.get("fa"),
					notas.get("fa")
		);
		
		//Os endereços de memória das chamadas dos fas sempre vão ser repetidas
		//Ex.
		/*
		[br.com.roberto.designpatternsgof.estrutural.flyweight.Do@15db9742, 
		 br.com.roberto.designpatternsgof.estrutural.flyweight.Re@6d06d69c, 
		 br.com.roberto.designpatternsgof.estrutural.flyweight.Mi@7852e922, 
		 br.com.roberto.designpatternsgof.estrutural.flyweight.Fa@4e25154f, 
		 br.com.roberto.designpatternsgof.estrutural.flyweight.Fa@4e25154f, 
		 br.com.roberto.designpatternsgof.estrutural.flyweight.Fa@4e25154f]
		 */
		System.out.println(musica);
	
	}

}
