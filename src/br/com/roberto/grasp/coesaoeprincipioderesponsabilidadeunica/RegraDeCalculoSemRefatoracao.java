package br.com.roberto.grasp.coesaoeprincipioderesponsabilidadeunica;

/*Exemplo de Calculador de Sal�rio*/
/*Desconto em cima do percentual do sal�rio*/
/*coesa = �nica responsabilidade*/
/*Classe n�o coesa*/
/*Transformar a Classe em Single Responsability Principle*/


public class RegraDeCalculoSemRefatoracao {

	public double calcula(Funcionario funcionario) {

		if (DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return dezOuVintePorcento(funcionario);
		}

		if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
			return quinzeOuVinteeCincoPorcento(funcionario);
		}

		throw new RuntimeException("Funcion�rio Inv�lido");

	}

	private double dezOuVintePorcento(Funcionario empregado) {
		if (empregado.getSalario() > 3000) {
			return empregado.getSalario() * 0.8;
		} else {
			return empregado.getSalario() * 0.9;
		}

	}

	private double quinzeOuVinteeCincoPorcento(Funcionario empregado) {
		if (empregado.getSalario() > 2000) {
			return empregado.getSalario() * 0.75;
		} else {
			return empregado.getSalario() * 0.85;
		}

	}

}
