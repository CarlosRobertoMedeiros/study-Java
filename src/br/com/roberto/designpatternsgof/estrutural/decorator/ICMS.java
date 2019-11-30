package br.com.roberto.designpatternsgof.estrutural.decorator;

public class ICMS extends Imposto{

	public ICMS() {
	
	}

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + calculoDoOutroImposto(orcamento);
	}

}
