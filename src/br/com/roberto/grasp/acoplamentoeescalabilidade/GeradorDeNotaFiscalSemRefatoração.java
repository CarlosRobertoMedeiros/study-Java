package br.com.roberto.grasp.acoplamentoeescalabilidade;

/*
 * O GeradorDeNotaFiscalSemRefatora��o tem como depend�ncia
 * o EnviadorDeEmail e o NotaFiscalDao
 * Isso quer dizer que qualquer problema nessas depend�ncias 
 * v�o ser propagadas ao GeradorDeNotaFiscalSemRefatora��o
 * O GeradorDeNF... � uma classe fr�gil, pois pode parar de funcionar
 * Sempre que uma de suas depend�ncias apresentar problemas
 * 
 * Nem todo acoplamento � problem�tico ... evitar acoplamentos problem�ticos
 * 
 *     - Acoplamento Eferente
 *     - Acoplametno Aferente (Lado Contr�rio Exemplo List)
*
 * */
public class GeradorDeNotaFiscalSemRefatora��o {

	private final EnviadorDeEmail email;
	private final NotaFiscalDao dao;

	public GeradorDeNotaFiscalSemRefatora��o(EnviadorDeEmail email, NotaFiscalDao dao) {
		this.email = email;
		this.dao = dao;
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		email.enviarEmail(nf);
		dao.persiste(nf);

		return nf;
	}
	
	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}

}
