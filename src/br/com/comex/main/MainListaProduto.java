package br.com.comex.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoDAO;

public class MainListaProduto {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conFa = new ConnectionFactory();
		ProdutoDAO produtodao = new ProdutoDAO(conFa);
		List<Produto> lista = new ArrayList<Produto>();
		lista = produtodao.listarProdutos();
		
		for (Produto produto : lista) {
			System.out.println(produto);
		}

	}

}
