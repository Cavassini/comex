package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ClienteDAO;

public class InsereCliente {

	public static void main(String[] args) throws SQLException {
		
		ClienteDAO dao = new ClienteDAO();
		dao.insereCliente(new Cliente("Thiago", "141.889.416-85", "35-99939-0522", "rua a", "195", "grafica", "Gabirobal", "Andradas", "MG"));
		
	}

}
