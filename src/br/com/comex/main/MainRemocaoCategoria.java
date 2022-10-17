package br.com.comex.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();
		
		String sql = "delete from comex.categoria where status = 'INATIVA'";
		
		PreparedStatement preparadoSql = con.prepareStatement(sql);
		
		preparadoSql.executeQuery(sql);
		
	}

}
