package br.com.roberto.java8.lambda;


import java.util.List;

import br.com.roberto.java8.lambda.dao.FaturaDAO;
import br.com.roberto.java8.lambda.email.EnviadorDeEmail;
import br.com.roberto.java8.lambda.modelo.Fatura;

public class ExemploLambda {
	
	public static void main(String[]args) {
		
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();
		
		//Sem Lambda
		/*
		 * for(Fatura fatura:faturasVencidas) {
		 * enviadorDeEmail.enviar(fatura.getEmailDevedor(), fatura.resumo()); }
		 */
		
		//Com Lambda
		//Funciona em tempo de compilação
		// Em execução o compilador faz certinho
		faturasVencidas.forEach(fatura -> { 
			enviadorDeEmail.enviar(fatura.getEmailDevedor(), fatura.resumo());
			fatura.setEmailEnviado(true);
		});
		
		
		
	}
	

}
