package br.com.roberto.designpatternsgof.estrutural.decorator2;

public class Pizza implements Pedido{

	private String tipo;
	private double preco;
	
	
	public Pizza(String tipo, double preco) {
		this.tipo = tipo;
		this.preco = preco;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

}
