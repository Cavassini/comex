package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.PedidoDAO;

public class MainExcluiPedido {

	public static void main(String[] args) throws SQLException {
		PedidoDAO dao = new PedidoDAO();
		dao.excluiPedido(9);

	}

}
