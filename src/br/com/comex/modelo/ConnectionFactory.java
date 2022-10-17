package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource combo = new ComboPooledDataSource();
		combo.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		combo.setUser("system");
		combo.setPassword("cavassini");
		
		combo.setMaxPoolSize(15);
		
		this.dataSource = combo;
	}
	
	public Connection criarConexao() throws SQLException{
		
//		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "system", "cavassini");
//		System.out.println("Conectou!!!");
		
		return this.dataSource.getConnection();
	
}
	}
