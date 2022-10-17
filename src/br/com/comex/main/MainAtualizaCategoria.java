package br.com.comex.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizaCategoria {
	public static void main(String[] args) throws SQLException {
	
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();
		
		String sql = "update comex.categoria set nome = 'LIVROS_TECNICOS' where id = 11";
		
		PreparedStatement stm = con.prepareStatement(sql);
		
		stm.executeQuery(sql);
		
		stm.close();
		con.close();
	}
}
