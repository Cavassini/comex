package br.com.comex.main;

import java.sql.SQLException;

import br.com.comex.modelo.ClienteDAO;

public class MainAtualizaCliente {

	public static void main(String[] args) throws SQLException {
		ClienteDAO dao = new ClienteDAO();
		dao.atualizaCliente("Ana Luiza", "111.222.333-44", "35-99939-0522", "rua A", "01", "ao lado do bar", "gabirobal","Andradas", "SP",8);

	}

}
