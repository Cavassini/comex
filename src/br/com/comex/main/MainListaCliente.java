package br.com.comex.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ClienteDAO;

public class MainListaCliente {

	public static void main(String[] args) throws SQLException {
		
		ClienteDAO dao = new ClienteDAO();
		List<Cliente> lista = new ArrayList<>();
		
		lista = dao.listarClientes();
		
		for (Cliente cliente : lista) {
			System.out.println(cliente);
		}
	}

}
