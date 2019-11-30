package br.com.roberto.designpatternsgof.estrutural.decorator2;

public class ChamadorDePizza {

	public static void main(String[] args) {
	
		Pedido pizzaDaCasa = new Pizza("Pizza da Casa", 10);
		pizzaDaCasa = new UmaCoberturaExtra(pizzaDaCasa, "Pepperoni", 10);
		pizzaDaCasa = new CoberturaExtraDupla(pizzaDaCasa, "Quatro Queijos", 12);
		pizzaDaCasa = new CoberturaSemCusto(pizzaDaCasa, "Calabresa", 8);
		System.out.println(pizzaDaCasa.getPreco());
		System.out.println(pizzaDaCasa.getTipo());
	}
	
}
