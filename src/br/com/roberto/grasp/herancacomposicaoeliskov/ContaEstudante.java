package br.com.roberto.grasp.herancacomposicaoeliskov;

public class ContaEstudante {

	private ManipuladorDeSaldo manipuladorDeSaldo;
	private int milhas;

	public ContaEstudante() {
		this.manipuladorDeSaldo = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		manipuladorDeSaldo.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}

}
