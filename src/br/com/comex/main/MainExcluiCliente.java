package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.ClienteDAO;

public class MainExcluiCliente {

	public static void main(String[] args) throws SQLException {
		ClienteDAO dao = new ClienteDAO();
		dao.excluiCliente(28);

	}

}
