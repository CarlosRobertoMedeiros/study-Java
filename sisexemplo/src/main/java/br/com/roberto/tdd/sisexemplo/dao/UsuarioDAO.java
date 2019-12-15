package br.com.roberto.tdd.sisexemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.roberto.tdd.sisexemplo.dto.UsuarioDTO;
import br.com.roberto.tdd.sisexemplo.model.Usuario;

public class UsuarioDAO {

	private Connection connection;
	private UsuarioDTO usuarioDTO;



	public UsuarioDAO() {
		this.connection = new DBConnection().getConnection();
		this.usuarioDTO = new UsuarioDTO();
	}

	public void adiciona(Usuario usuario) {
		String sql = "INSERT INTO TB_USUARIO(NOME,CPF,EMAIL,TELEFONE) VALUES (?,?,?,?)";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getCpf());
			statement.setString(3, usuario.getEmail());
			statement.setString(4, usuario.getTelefone());
			statement.execute();
			statement.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void atualiza(Usuario usuario) {
		
		UsuarioDAO usuarioDAO = this.getUsuario(usuario);
		
		String sql =" UPDATE TB_USUARIO SET "  
				+ "		NOME="+usuario.getNome().trim()
				+ "		,CPF="+usuario.getCpf().trim()
				+ "		,EMAIL= "+usuario.getEmail().trim()
				+ "		,TELEFONE="+usuario.getTelefone().trim()
				+ "		,SITUACAO= "+usuario.getSituacao()
				+ " WHERE ID= "+usuarioDAO.data.id;
		
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
	
	public void exclui(UsuarioDTO usuario) {
		
		UsuarioDAO usuarioDAO = this.getUsuario(usuario);
		
		String sql =" DELETE FROM TB_USUARIO WHERE ID = ?"; 
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setLong(1, usuario.getId());
			statement.execute(sql);
			statement.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	
	}
	
	
	
	
	public UsuarioDTO getUsuario(Usuario usuario) {
		String sql = 	"select * from tb_usuario "
						+ "WHERE "
						+ "nome = ? and cpf = ? and  email = ? and telefone = ? and situacao= ?"; 

		try {
			
			if (usuario.getId()==null){
				
				PreparedStatement statement = connection.prepareStatement(sql);
								
				int i=1;
				statement.setString(i++, usuario.getNome().trim());
				statement.setString(i++, usuario.getCpf().trim());
				statement.setString(i++, usuario.getEmail().trim());
				statement.setString(i++, usuario.getTelefone().trim());
				statement.setString(i++, usuario.getSituacao().trim());
								
				ResultSet resultSet = statement.executeQuery();
				
				while (resultSet.next()) {
					this.usuarioDTO.id = resultSet.getLong("id");
					this.usuarioDTO.nome = resultSet.getString("nome");
					this.usuarioDTO.cpf = resultSet.getString("cpf");
					this.usuarioDTO.email = resultSet.getString("email");;
					this.usuarioDTO.telefone = resultSet.getString("telefone");;
					this.usuarioDTO.situacao = resultSet.getString("situacao");;
				}
		
			}
			
			return usuarioDTO;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
				
		
	}
	
	
	
	
	

}
