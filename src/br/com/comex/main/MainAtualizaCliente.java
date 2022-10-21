package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ClienteDAO;

public class MainAtualizaCliente {

	public static void main(String[] args) throws SQLException {
		ClienteDAO dao = new ClienteDAO();
		Cliente cliente = new Cliente("Ana Luiza", "111.222.333-44", "35-99939-0522", "rua A", "01", "ao lado do bar", "gabirobal","Andradas", "SP");
		cliente.setId(200);
		dao.atualizaCliente(cliente);
	}

}
