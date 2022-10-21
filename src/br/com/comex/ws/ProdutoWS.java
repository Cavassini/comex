package br.com.comex.ws;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;

import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoDAO;

public class ProdutoWS {

	@WebMethod(operationName = "ListarProdutos")
	@WebResult(name = "Produto")
	public List<Produto> getProduto(Produto produto) throws SQLException{
		
		List<Produto> lista = new ArrayList<>();
		ProdutoDAO dao = new ProdutoDAO();
		lista = dao.listarProdutos();
		
		return lista;
	}
}
