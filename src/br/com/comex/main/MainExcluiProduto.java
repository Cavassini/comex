package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.ProdutoDAO;

public class MainExcluiProduto {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conFa = new ConnectionFactory();
		ProdutoDAO dao = new ProdutoDAO(conFa);
		
		dao.exclui(12);
		
}
}
