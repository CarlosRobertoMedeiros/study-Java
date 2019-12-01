package br.com.roberto.designpatternsgof.comportamental.state;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
}
