package br.com.roberto.grasp.coesaoeprincipioderesponsabilidadeunica;

//Sempre que criar um cargo novo tenho que ter uma regra de calculo especifica
public enum Cargo {
	
	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteeCincoPorCento()),
	TESTER(new QuinzeOuVinteeCincoPorCento());
	
	private RegraDeCalculo regra;

	private Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
}
