package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.ProdutoDAO;

public class MainExcluiProduto {

	public static void main(String[] args) throws SQLException {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.exclui(12);
		
}
}
