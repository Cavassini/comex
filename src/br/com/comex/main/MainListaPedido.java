package br.com.comex.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.*;

import br.com.comex.modelo.PedidoDAO;

public class MainListaPedido {

	public static void main(String[] args) throws SQLException {
		
		List <Pedido> lista = new ArrayList<Pedido>();
		PedidoDAO dao = new PedidoDAO();
		lista = dao.listarPedidos();
		
		for (Pedido pedido : lista) {
			System.out.println(pedido);
		}

	}

}
