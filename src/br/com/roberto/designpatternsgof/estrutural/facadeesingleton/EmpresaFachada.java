package br.com.roberto.designpatternsgof.estrutural.facadeesingleton;

public class EmpresaFachada {

	/*Fachada única para consumir os recursos do seu sistema*/
	public Cliente buscaCliente(String cpf) {
		Cliente cliente = new ClienteDao().buscaPorCPF(cpf);
	}
	
	public Fatura criaFatura(Cliente cliente, double valor) {
		Fatura fatura = new Fatura(cliente, valor);
		return fatura;
	}
	
	
	public Cobranca geraCobranca(Fatura fatura) {
		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		cobranca.emite();
		
		return cobranca;
	}
	
	public CadastroCliente fazContato(Cliente cliente,Cobranca cobranca) {
		ContatoCliente contato = new ContatoCliente(cliente,cobranca);
		contato.dispara();
		
		return contato;
	}
	
}
