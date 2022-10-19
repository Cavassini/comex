package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoDAO;

public class MainAtualizaProduto {

	public static void main(String[] args) throws SQLException {
		ProdutoDAO dao = new ProdutoDAO();
		
		Categoria categoria = new Categoria("INFORMATICA", "ATIVA");
		Produto produto = new Produto(11,"Notebook Intel","i5",4.500,2,categoria);
		dao.atualizaProduto(produto);

	}

}
