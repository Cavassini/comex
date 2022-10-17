package br.com.comex.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.modelo.ConnectionFactory;


public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();	
		
		String sqlMoveis = "insert into comex.categoria ( nome, status) values ('MOVEIS','INATIVA')";
		String sqlInformatica = "insert into comex.categoria ( nome, status) values ('INFORMATICA','ATIVA')";
		String sqlLivros = "insert into comex.categoria ( nome, status) values ('LIVROS','ATIVA')";
		
		
		PreparedStatement pst = con.prepareStatement(sqlMoveis,Statement.RETURN_GENERATED_KEYS);	
		pst.execute();
		
		con.close();
		pst.close();

		
	}

}
