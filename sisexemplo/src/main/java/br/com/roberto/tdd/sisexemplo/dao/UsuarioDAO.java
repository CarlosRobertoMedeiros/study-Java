package br.com.roberto.tdd.sisexemplo.dao;

import java.util.List;

import br.com.roberto.tdd.sisexemplo.dto.UsuarioDTO;
import br.com.roberto.tdd.sisexemplo.model.Usuario;

public interface UsuarioDAO {

	public void adiciona(Usuario usuario);
	
	public void atualiza(Usuario usuario);
	
	public void exclui(Usuario usuario);
	
	public UsuarioDTO getUsuario(Usuario usuario);
	
	public List<UsuarioDTO> getUsuarios();
	
}
