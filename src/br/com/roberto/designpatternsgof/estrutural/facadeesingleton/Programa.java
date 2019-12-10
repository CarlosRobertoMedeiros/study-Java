package br.com.roberto.designpatternsgof.estrutural.facadeesingleton;

public class Programa {
	
	public static void main(String[] args) {
		EmpresaFachada empresaFachada = new EmpresaFachadaSingleton().getInstance();
		empresaFachada.buscaCliente(cpf);
		empresaFachada.criaFatura(cliente, valor);
	}

}
