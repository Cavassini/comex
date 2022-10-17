package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	public Connection criarConexao() throws SQLException{
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "system", "cavassini");
		System.out.println("Conectou!!!");
		
		return connection;
	
}
	}
