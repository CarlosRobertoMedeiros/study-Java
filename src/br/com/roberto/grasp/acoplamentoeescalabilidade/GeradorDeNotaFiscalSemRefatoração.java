package br.com.roberto.grasp.acoplamentoeescalabilidade;

/*
 * O GeradorDeNotaFiscalSemRefatoração tem como dependência
 * o EnviadorDeEmail e o NotaFiscalDao
 * Isso quer dizer que qualquer problema nessas dependências 
 * vão ser propagadas ao GeradorDeNotaFiscalSemRefatoração
 * O GeradorDeNF... é uma classe frágil, pois pode parar de funcionar
 * Sempre que uma de suas dependências apresentar problemas
 * 
 * Nem todo acoplamento é problemático ... evitar acoplamentos problemáticos
 * 
 *     - Acoplamento Eferente
 *     - Acoplametno Aferente (Lado Contrário Exemplo List)
*
 * */
public class GeradorDeNotaFiscalSemRefatoração {

	private final EnviadorDeEmail email;
	private final NotaFiscalDao dao;

	public GeradorDeNotaFiscalSemRefatoração(EnviadorDeEmail email, NotaFiscalDao dao) {
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
