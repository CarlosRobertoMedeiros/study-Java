package br.com.roberto.tdd.sisexemplo.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.roberto.tdd.sisexemplo.dao.DBConnection;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
	
		Connection connection = new DBConnection().getConnection();
		System.out.println("Conexao Aberta !");
		connection.close();
	}
}
