package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.ProdutoDAO;

public class MainAtualizaProduto {

	public static void main(String[] args) throws SQLException {
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.atualizaProduto("Notebook Intel","i5",4.500,2,11);

	}

}
