package br.com.roberto.tdd.sisexemplo.teste;

import java.util.List;

import br.com.roberto.tdd.sisexemplo.dao.UsuarioDAO;
import br.com.roberto.tdd.sisexemplo.dao.UsuarioDAOImpl;
import br.com.roberto.tdd.sisexemplo.model.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {
		
//      Incluir
		Usuario usuario = new Usuario("Matheus Alves Medeiros de Lima", "33333333333", "matheus@esqueci.com", "55-XX-3333-3333");
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.adiciona(usuario);
		
//      excluir
//		Usuario usuario = new Usuario("Matheus Alves Medeiros de Lima", "33333333333", "matheus@esqueci.com", "55-XX-3333-3333");
//		usuario.setId((long) 4);
//		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
//		usuarioDAO.exclui(usuario);
		
//      alterei
		/*
		 * Usuario usuario = new Usuario("Matheus Alves de Lima", "33333333334",
		 * "matheus2@esqueci.com", "55-XX-3333-3334"); usuario.setId((long) 5);
		 * UsuarioDAO usuarioDAO = new UsuarioDAOImpl(); usuarioDAO.atualiza(usuario);
		 */


		
		
		//UsuarioDAOImpl usuarioDAO3 = new UsuarioDAOImpl();
		
		List<Usuario> usuarios = usuarioDAO.getUsuarios();
		
		for (Usuario user : usuarios) {
			System.out.println(user);
		}
		
		
		
		
		
		
		//usuarioDAO.adiciona(usuario);
		//usuarioDAO.exclui(usuario);
		//usuarioDAO.atualiza(usuario);
		
		
		
		
		
		
		
	}
}
