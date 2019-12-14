package br.com.roberto.grasp.encapsulamento;

import java.util.ArrayList;
import java.util.Collection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Fatura {

	private Cliente cliente;
	private double valor;
	private List<Pagamento> pagamentos;
	private boolean pago;

	public Fatura(Cliente cliente, double valor, List<Pagamento> pagamentos) {
		this.cliente = cliente;
		this.valor = valor;
		this.pagamentos = new ArrayList<Pagamento>();
		this.pago = false;
	}

	public boolean isPago() {
		return pago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public List<Pagamento> getPagamentos() {
		return java.util.Collections.unmodifiableList(pagamentos);
	}

	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);

		if (valoTotalDosPagamento() > this.valor) {
			this.pago = true;
		}

	}

	private double valoTotalDosPagamento() {
		double total = 0;

		for (Pagamento p : pagamentos) {
			total += p.getValor();
		}
		return total;
	}

}
