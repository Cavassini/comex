package br.com.comex.ws;

import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ClienteDAO;

@WebService
public class ComexWs {
	
	@WebMethod(operationName = "ListarCategorias")
	@WebResult(name = "Categoria")
	public List<Categoria> getCategorias() throws SQLException{
		
		List<Categoria> lista = new ArrayList<>();
		ConnectionFactory conFa = new ConnectionFactory();
		
		Connection con = conFa.criarConexao();
		
		String sql = "select * from comex.categoria";
		
		PreparedStatement preparado = con.prepareStatement(sql);
		
		ResultSet rst = preparado.executeQuery();
		
		while (rst.next()) {
			
			Categoria categoria = new Categoria(rst.getString("NOME"),rst.getString("STATUS"));
			categoria.setId(rst.getInt("ID"));
			lista.add(categoria);
			
		}
		
		return lista;
	}
	
	@WebMethod(operationName = "CadastrarCategoria")
	@WebResult(name = "Categoria")
	public Categoria adicionarCategoria(@WebParam(name="categoria") Categoria categoria) throws SQLException {
		
		ConnectionFactory conFa = new ConnectionFactory();
		
		Connection con = conFa.criarConexao();
		String nome = categoria.getNome();
		String status = categoria.isStatus().name();
		
		String sql = "insert into comex.categoria (NOME,STATUS) values (?,?) ";
		
		PreparedStatement preparado = con.prepareStatement(sql);
		
		preparado.setString(1, nome);
		preparado.setString(2, status);
		
		preparado.executeQuery();
		
		return categoria;
	}
	@WebMethod(operationName = "ListarClientes")
	@WebResult(name = "Cliente")
	public List<Cliente> getCliente() throws SQLException{
		
		ClienteDAO dao = new ClienteDAO();
		List<Cliente> lista = new ArrayList<>();
		
		lista = dao.listarClientes();
		
		return lista;
	}
	@WebMethod(operationName = "AdicionarClientes")
	@WebResult(name = "Cliente")
	public Cliente adicionarCliente(@WebParam(name="cliente")Cliente cliente) throws SQLException {
		
		ClienteDAO dao = new ClienteDAO();
		dao.insereCliente(cliente);
		
		return cliente;
	}
	@WebMethod(operationName = "ListarProdutos")
	@WebResult(name = "Produto")
	public List<Produto> getProduto(Produto produto) throws SQLException{
		
		List<Produto> lista = new ArrayList<>();
		ProdutoDAO dao = new ProdutoDAO();
		lista = dao.listarProdutos();
		
		return lista;
	}
}
