package br.com.roberto.tdd.sisexemplo.dao;

import java.util.List;

import br.com.roberto.tdd.sisexemplo.model.Usuario;

public interface UsuarioDAO {

	boolean adiciona(Usuario usuario);
	
	void atualiza(Usuario usuario);
	
	void exclui(Usuario usuario);
	
	Usuario getUsuarioById(int id);
	
	List<Usuario> getUsuarios();
	
}
