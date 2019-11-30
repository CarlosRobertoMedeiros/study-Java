package br.com.roberto.designpatternsgof.estrutural.decorator2;

public abstract class Extras implements Pedido{

	protected Pedido pedido;
	protected String tipo;
	protected double preco;
	
		
	public Extras(Pedido pedido, String tipo, double preco) {
		this.pedido = pedido;
		this.tipo = tipo;
		this.preco = preco;
	}

	@Override
	//O Pre�o vai ser implementado nas implementa��es concretas 
	public abstract double getPreco();

	@Override
	public String getTipo() {
		return pedido.getTipo()+","+this.tipo;
	}

}
