package br.com.roberto.tdd.sisexemplo.model;

public class Usuario {

	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String situacao;

	public Usuario() {
	}

	public Usuario(String nome, String cpf, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.situacao = "A";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Long getId() {
		return id;
	}

}
