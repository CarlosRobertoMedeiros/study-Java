package br.com.roberto.java8.certificacaooca;

public class Aluno {

	private Integer codigo;
	private String nome;

	Aluno(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "[Aluno codigo = " + this.codigo + "  nome " + this.nome + " ]";
	}

}
