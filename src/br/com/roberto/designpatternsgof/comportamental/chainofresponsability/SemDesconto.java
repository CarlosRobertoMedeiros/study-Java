package br.com.roberto.designpatternsgof.comportamental.chainofresponsability;

public class SemDesconto implements Desconto  {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// N�o te Pr�ximo � o ultimo
		
	}
	

}
