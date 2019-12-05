package br.com.roberto.designpatternsgof.criacional.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * O try-with-resource s� deve ser implementado nos chamadores para garantir O
 * fechamento da conex�o, por�m isso n�o � par�metro para essa implementa��o ;
 * 
 * @author Roberto
 */

public class ConnectionFactory {

	private static Connection con = null;

	private ConnectionFactory() {
	}

	public static Connection getConnection() {

		try {
			if (con == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/gerenciadorfinanceiro?useSSL=false&serverTimezone=America/Sao_Paulo",
						"root", "root");
			}

			return con;

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

}
