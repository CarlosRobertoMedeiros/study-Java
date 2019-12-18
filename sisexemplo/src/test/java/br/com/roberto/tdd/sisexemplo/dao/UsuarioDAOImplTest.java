package br.com.roberto.tdd.sisexemplo.dao;

import org.junit.Test;

import br.com.roberto.tdd.sisexemplo.model.Usuario;
import junit.framework.Assert;

public class UsuarioDAOImplTest {

	@Test
	public void incluirUsuario() {
		Usuario usuario = new Usuario("Matheus Alves Medeiros de Lima", "33333333333", "matheus@esqueci.com",
				"55-XX-3333-3333");
		UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.adiciona(usuario);
		
		Assert.assertEquals("Usuario Adicionado com Sucesso!",true,usuarioDAO.adiciona(usuario));
	}

}
