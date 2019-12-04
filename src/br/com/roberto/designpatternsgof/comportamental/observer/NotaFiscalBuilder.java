package br.com.roberto.designpatternsgof.comportamental.observer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private LocalDate data;
	
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;
	
	public NotaFiscalBuilder() {
		this.todasAcoesASeremExecutadas = new ArrayList<>();
	}
	
	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.todasAcoesASeremExecutadas.add(acao);
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItens(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.data = LocalDate.now();
		return this;

	}

	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);

		for (AcaoAposGerarNota acao:todasAcoesASeremExecutadas) {
			acao.executa(nf);
		}
		return nf;
	}

}
