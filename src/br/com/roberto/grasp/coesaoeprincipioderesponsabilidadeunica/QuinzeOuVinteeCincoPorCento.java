package br.com.roberto.grasp.coesaoeprincipioderesponsabilidadeunica;

public class QuinzeOuVinteeCincoPorCento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalario() > 2000) {
			return funcionario.getSalario() * 0.75;
		} else {
			return funcionario.getSalario() * 0.85;
		}
	}
}
