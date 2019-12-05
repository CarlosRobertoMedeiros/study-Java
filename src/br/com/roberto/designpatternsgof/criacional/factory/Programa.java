package br.com.roberto.designpatternsgof.criacional.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) throws SQLException{
		
		Connection cf = ConnectionFactory.getConnection();
		
		List<Pessoa> pessoas = new ArrayList<>();
				
		PreparedStatement ps = cf.prepareStatement("select codigo , nome From tb_pessoa");
		
		try (ResultSet rs = ps.executeQuery();){
			while(rs.next()) {
				pessoas.add(new Pessoa(rs.getInt("codigo"), rs.getString("nome")));
			}
			
			System.out.println(pessoas);
		}
		catch (SQLException e) {
			throw new SQLException(e);
		}
		
		System.out.println("Garantindo o Singleton de Maneira muito simples ");
		
		Connection cf2 = ConnectionFactory.getConnection();
		
		List<Pessoa> pessoas2 = new ArrayList<>();
		
		PreparedStatement ps1 = cf2.prepareStatement("select codigo , nome From tb_pessoa");
		
		try (ResultSet rs1 = ps1.executeQuery();){
			while(rs1.next()) {
				pessoas2.add(new Pessoa(rs1.getInt("codigo"), rs1.getString("nome")));
			}
			
			System.out.println(pessoas2);
		}
		catch (SQLException e) {
			throw new SQLException(e);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
