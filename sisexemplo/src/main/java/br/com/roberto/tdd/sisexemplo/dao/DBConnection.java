package br.com.roberto.tdd.sisexemplo.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private String url = "jdbc:mysql://localhost:3306/crud?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "root";

	public java.sql.Connection getConnection() {
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			new RuntimeException(e);
		}
		return null;
	}
}
