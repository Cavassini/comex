package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoDAO;

public class MainInsereProduto {

	public static void main(String[] args) throws SQLException {
		
		Categoria categoria = new Categoria("INFORMATICA", "ATIVA");
		
		Produto produto = new Produto(15, "Computador Positivo", "basico - para uso pessoal", 2.500, 1, categoria);
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.insereProduto(produto);

	}

	
}
