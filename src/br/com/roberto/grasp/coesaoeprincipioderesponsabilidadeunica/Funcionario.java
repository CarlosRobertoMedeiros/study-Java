package br.com.roberto.grasp.coesaoeprincipioderesponsabilidadeunica;

import java.time.LocalDate;

/*Classe Coesa utiliza unicidade pois só se referencia a funcionaríos */
/*Utilizamos o SRP = Single Responsability Principle - > Princípio de Responsabilidade Única ou Coesão*/
public class Funcionario {

	private int id;
	private String nome;
	private Cargo cargo;
	private LocalDate dataDeAdmissao;
	private double salario;

	public Funcionario(int id, String nome, Cargo cargo, LocalDate dataDeAdmissao, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.dataDeAdmissao = dataDeAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public double calculaSalario() {
		return cargo.getRegra().calcula(this);
	}

}
