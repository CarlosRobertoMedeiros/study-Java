package br.com.roberto.tdd.sisexemplo.teste;

import br.com.roberto.tdd.sisexemplo.dao.UsuarioDAO;
import br.com.roberto.tdd.sisexemplo.model.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Carlos Roberto Medeiros de Lima", "11111111111", "numsei@esqueci.com", "55-XX-87458-9685");
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		//usuarioDAO.adiciona(usuario);
		usuarioDAO.exclui(usuario);
		
		
		
		
		
		
		
	}
}
