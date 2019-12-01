package br.com.roberto.designpatternsgof.comportamental.state;

public class Aprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("O Orçamento Já Está Aprovado");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos Aprovados não podem ser reprovados");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();

	}

}
