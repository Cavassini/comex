package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainTestaConexao {
	
	public static void main(String[] args) throws SQLException  {
		
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();
		
		con.close();
		
		
	}
	
}
