package br.com.roberto.tdd.sisexemplo.teste;

import java.util.List;

import br.com.roberto.tdd.sisexemplo.dao.UsuarioDAOImpl;
import br.com.roberto.tdd.sisexemplo.dto.UsuarioDTO;
import br.com.roberto.tdd.sisexemplo.model.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {
		
//		Usuario usuario = new Usuario("Carlos Roberto Medeiros de Lima", "11111111111", "roberto@esqueci.com", "55-XX-1111-1111");
//		UsuarioDAO usuarioDAO = new UsuarioDAO();
//		usuarioDAO.adiciona(usuario);
//		
//		Usuario usuario2 = new Usuario("Luciene Alves Medeiros de Lima", "22222222222", "luciene@esqueci.com", "55-XX-2222-2222");
//		UsuarioDAO usuarioDAO2 = new UsuarioDAO();
//		usuarioDAO.adiciona(usuario2);
//		
		
		UsuarioDAOImpl usuarioDAO3 = new UsuarioDAOImpl();
		
		List<UsuarioDTO> usuarios = usuarioDAO3.getUsuarios();
		
		for (UsuarioDTO usuarioDTO : usuarios) {
			System.out.println(usuarioDTO);
		}
		
		
		
		
		
		
		//usuarioDAO.adiciona(usuario);
		//usuarioDAO.exclui(usuario);
		//usuarioDAO.atualiza(usuario);
		
		
		
		
		
		
		
	}
}
