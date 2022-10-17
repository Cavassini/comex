package br.com.comex.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;

public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();
		
		String sql = "select nome from comex.categoria";
		
		PreparedStatement stm = con.prepareStatement(sql);
		
		
		ResultSet rst = stm.executeQuery(sql);
		
		while (rst.next()) {
			String nome = rst.getString("NOME");
			System.out.println(nome);
			
		}
		
		con.close();
		stm.close();
		rst.close();
	}

}
