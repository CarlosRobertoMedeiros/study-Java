package br.com.roberto.tdd.sisexemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.roberto.tdd.sisexemplo.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	private final String COMANDO_INSERIR_USUARIO = "INSERT INTO TB_USUARIO(NOME,CPF,EMAIL,TELEFONE) VALUES (?,?,?,?)";

	private final String COMANDO_ATUALIZAR_USUARIO = "UPDATE TB_USUARIO SET NOME = ?, CPF = ?, EMAIL = ?, TELEFONE = ?, SITUACAO = ? WHERE ID = ?";

	private final String COMANDO_EXCLUIR_USUARIO = "DELETE FROM TB_USUARIO WHERE ID = ?";

	private final String COMANDO_LISTAR_USUARIO = "SELECT ID, NOME, CPF, EMAIL, TELEFONE, SITUACAO FROM TB_USUARIO WHERE ID = ?";

	private final String COMANDO_LISTAR_USUARIOS = "SELECT ID, NOME, CPF, EMAIL, TELEFONE, SITUACAO FROM TB_USUARIO";

	public UsuarioDAOImpl() {
	}

	public boolean adiciona(Usuario usuario) {
		String sql = COMANDO_INSERIR_USUARIO;
		Connection connection = null;
		PreparedStatement statement = null;
		boolean result = false;
		try {
			int i = 1;
			connection = new DBConnection().getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(i++, usuario.getNome());
			statement.setString(i++, usuario.getCpf());
			statement.setString(i++, usuario.getEmail());
			statement.setString(i++, usuario.getTelefone());
			statement.execute();
			statement.close();
			return result = true;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				// Fechando as Conexões
				if (statement != null) {
					statement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	public void atualiza(Usuario usuario) {

		String sql = COMANDO_ATUALIZAR_USUARIO;
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			int i = 1;
			connection = new DBConnection().getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(i++, usuario.getNome().trim());
			statement.setString(i++, usuario.getCpf().trim());
			statement.setString(i++, usuario.getEmail().trim());
			statement.setString(i++, usuario.getTelefone().trim());
			statement.setString(i++, usuario.getSituacao().trim());
			statement.setLong(i++, usuario.getId());

			statement.executeUpdate();
			statement.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				// Fechando as Conexões
				if (statement != null) {
					statement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

	}


	public void exclui(Usuario usuario) {

		Connection connection = null;
		PreparedStatement statement = null;
		String sql = COMANDO_EXCLUIR_USUARIO;

		try {
			int i = 1;
			connection = new DBConnection().getConnection();
			statement = connection.prepareStatement(sql);

			statement.setLong(i++, usuario.getId());
			statement.execute();
			statement.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				// Fechando as Conexões
				if (statement != null) {
					statement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

	}


	public Usuario getUsuarioById(int id) {
		String sql = COMANDO_LISTAR_USUARIO;
		Usuario usuario = null;
		Connection connection = null;
		PreparedStatement statement = null;

		try {

			int i = 1;
			connection = new DBConnection().getConnection();
			statement = connection.prepareStatement(sql);
			usuario = new Usuario();
			statement.setLong(i++, usuario.getId());
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				usuario.setId(resultSet.getLong("id"));
				usuario.setNome(resultSet.getString("nome"));
				usuario.setCpf(resultSet.getString("cpf"));
				usuario.setEmail(resultSet.getString("email"));
				usuario.setTelefone(resultSet.getString("telefone"));
				usuario.setSituacao(resultSet.getString("situacao"));
			}

			return usuario;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				// Fechando as Conexões
				if (statement != null) {
					statement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

	}


	public List<Usuario> getUsuarios() {
		String sql = COMANDO_LISTAR_USUARIOS;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		Usuario usuario = null;
		List<Usuario> usuarios = null;

		try {
			connection = new DBConnection().getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			usuarios = new ArrayList<Usuario>();

			while (resultSet.next()) {
				usuario = new Usuario();
				usuario.setId(resultSet.getLong("id"));
				usuario.setNome(resultSet.getString("nome"));
				usuario.setCpf(resultSet.getString("cpf"));
				usuario.setEmail(resultSet.getString("email"));
				usuario.setTelefone(resultSet.getString("telefone"));
				usuario.setSituacao(resultSet.getString("situacao"));
				usuarios.add(usuario);
			}

			statement.close();
			return usuarios;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				// Fechando as Conexões
				if (statement != null) {
					statement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

	}

}