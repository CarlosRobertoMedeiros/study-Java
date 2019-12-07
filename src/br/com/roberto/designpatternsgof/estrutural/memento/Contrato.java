package br.com.roberto.designpatternsgof.estrutural.memento;

import java.time.LocalDate;

public class Contrato {
	private LocalDate data;
	private String cliente;
	private TipoContrato tipo;

	public Contrato(LocalDate localDate, String cliente, TipoContrato tipo) {
		this.data = localDate;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public LocalDate getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getTipo() {
		return tipo;
	}

	public void avanca() {
		if (tipo == TipoContrato.NOVO)
			tipo = TipoContrato.EM_ANDAMENTO;
		else if (tipo == TipoContrato.EM_ANDAMENTO)
			tipo = TipoContrato.ACERTADO;
		else if (tipo == TipoContrato.ACERTADO)
			tipo = TipoContrato.CONCLUIDO;
	}
	
	public Estado salvaEstado() {
		return new Estado(new Contrato(this.data, this.cliente, this.tipo));
	}

}
