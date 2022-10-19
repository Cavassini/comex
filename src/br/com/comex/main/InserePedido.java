package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.PedidoDAO;

public class InserePedido {

	public static void main(String[] args) throws SQLException {
		PedidoDAO dao = new PedidoDAO();
		Cliente cliente = new Cliente("Thiago", "141.889.416-85", "35-99939-0522", "rua a", "195", "grafica", "Gabirobal", "Andradas", "MG");
		cliente.setId(29); //para pegar o cliente com o id 29 do banco de dados
		dao.inserePedido(cliente);

	}

}
