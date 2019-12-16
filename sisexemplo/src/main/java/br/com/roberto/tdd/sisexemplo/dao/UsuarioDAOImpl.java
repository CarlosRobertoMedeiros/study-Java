package br.com.roberto.tdd.sisexemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.roberto.tdd.sisexemplo.dto.UsuarioDTO;
import br.com.roberto.tdd.sisexemplo.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO{

	private final String COMANDO_INSERIR_USUARIO = "INSERT INTO TB_USUARIO(NOME,CPF,EMAIL,TELEFONE) VALUES (?,?,?,?)"; 
	
	private final String COMANDO_ATUALIZAR_USUARIO = "UPDATE TB_USUARIO SET NOME = ?, CPF = ?, EMAIL = ?, TELEFONE = ?, SITUACAO = ? WHERE ID = ?";
	
	private final String COMANDO_EXCLUIR_USUARIO = "DELETE FROM TB_USUARIO WHERE ID = ?";
	
	private final String COMANDO_LISTAR_USUARIO = "SELECT ID, NOME, CPF, EMAIL, TELEFONE, SITUACAO FROM TB_USUARIO WHERE " 
												  +"NOME = ? and CPF = ? and  EMAIL = ? and TELEFONE = ? and SITUACAO= ?"; 
	
	private final String COMANDO_LISTAR_USUARIOS = "SELECT ID, NOME, CPF, EMAIL, TELEFONE, SITUACAO FROM TB_USUARIO";
	
	
	private Connection connection;
	
	private UsuarioDTO usuarioDTO;
	

	public UsuarioDAOImpl() {
		this.connection = new DBConnection().getConnection();
		this.usuarioDTO = new UsuarioDTO();
	}

	@Override
	public void adiciona(Usuario usuario) {
		String sql = COMANDO_INSERIR_USUARIO;
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			int i = 1;
			
			statement.setString(i++, usuario.getNome());
			statement.setString(i++, usuario.getCpf());
			statement.setString(i++, usuario.getEmail());
			statement.setString(i++, usuario.getTelefone());
			statement.execute();
			statement.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void atualiza(Usuario usuario) {

		UsuarioDTO usuarioDTO = this.getUsuario(usuario);

		String sql = COMANDO_ATUALIZAR_USUARIO;

		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			int i = 1;
			statement.setString(i++, usuarioDTO.getNome().trim());
			statement.setString(i++, usuarioDTO.getCpf().trim());
			statement.setString(i++, usuarioDTO.getEmail().trim());
			statement.setString(i++, usuarioDTO.getTelefone().trim());
			statement.setString(i++, usuarioDTO.getSituacao().trim());
			statement.setLong(i++, usuarioDTO.getId());

			statement.executeUpdate();
			statement.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void exclui(Usuario usuario) {

		UsuarioDTO usuarioDTO = this.getUsuario(usuario);

		String sql = COMANDO_EXCLUIR_USUARIO;

		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			int i = 1;
			statement.setLong(i++, usuarioDTO.getId());
			statement.execute();
			statement.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public UsuarioDTO getUsuario(Usuario usuario) {
		String sql = COMANDO_LISTAR_USUARIO;

		try {

			if (usuario.getId() == null) {

				PreparedStatement statement = connection.prepareStatement(sql);

				int i = 1;
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
					this.usuarioDTO.email = resultSet.getString("email");
					this.usuarioDTO.telefone = resultSet.getString("telefone");
					this.usuarioDTO.situacao = resultSet.getString("situacao");
				}

			}

			return usuarioDTO;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	
	@Override
	public List<UsuarioDTO> getUsuarios(){
		String sql = COMANDO_LISTAR_USUARIOS;
		List<UsuarioDTO> usuarios = new ArrayList<>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				
				usuarioDTO.id = resultSet.getLong("id");
				usuarioDTO.nome = resultSet.getString("nome");
				usuarioDTO.cpf = resultSet.getString("cpf");
				usuarioDTO.email = resultSet.getString("email");
				usuarioDTO.telefone = resultSet.getString("telefone");
				usuarioDTO.situacao = resultSet.getString("situacao");
				usuarios.add(usuarioDTO);
			}
			
			statement.close();
			return usuarios;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	
}