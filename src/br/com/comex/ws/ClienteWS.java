package br.com.comex.ws;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ClienteDAO;

public class ClienteWS {
	@WebMethod(operationName = "AdicionarClientes")
	@WebResult(name = "Cliente")
	public Cliente adicionarCliente(@WebParam(name="cliente")Cliente cliente) throws SQLException {
		
		ClienteDAO dao = new ClienteDAO();
		dao.insereCliente(cliente);
		
		return cliente;
	}
}
