package br.com.comex.ws;

import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.PedidoDAO;
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
	@WebMethod(operationName = "DeletarCategoria")
	@WebResult(name = "Categoria")
	public Categoria deletarCategoria(@WebParam(name="categoria") Categoria categoria) throws SQLException {
		
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();
		
		String sql = "delete from comex.categoria where id = ?";
		
		PreparedStatement preparadoSql = con.prepareStatement(sql);
		
		preparadoSql.setInt(1, categoria.getId());
		preparadoSql.executeQuery(sql);
		
		return categoria;
	}
	
	@WebMethod(operationName = "AtualizarCategoria")
	@WebResult(name = "Categoria")
	public Categoria atualizaCategoria(@WebParam(name="categoria") Categoria categoria) throws SQLException {
		
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();
		
		String sql = "update comex.categoria set nome = 'LIVROS_TECNICOS' where id = ?";
		
		PreparedStatement stm = con.prepareStatement(sql);
		
		stm.setInt(1, categoria.getId());
		
		stm.executeQuery(sql);
		
		stm.close();
		con.close();
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
	
	@WebMethod(operationName = "DeletarClientes")
	@WebResult(name = "Cliente")
	public Cliente deletarCliente(@WebParam(name="cliente")Cliente cliente) throws SQLException {
		
		ClienteDAO dao = new ClienteDAO();
		dao.excluiCliente(cliente.getId());
		
		return cliente;
	}
	
	@WebMethod(operationName = "AtualizarClientes")
	@WebResult(name = "Cliente")
	public Cliente AtualizarCliente(@WebParam(name="cliente")Cliente cliente) throws SQLException {
		
		ClienteDAO dao = new ClienteDAO();
		dao.atualizaCliente(cliente);
		
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
	@WebMethod(operationName = "AdicionarProdutos")
	@WebResult(name = "Produto")
	public Produto adicionarProduto(Produto produto) throws SQLException{
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.insereProduto(produto);
		
		return produto;
	}
	
	@WebMethod(operationName = "ExcluirProdutos")
	@WebResult(name = "Produto")
	public Produto excluirProduto(Produto produto) throws SQLException{
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.exclui(produto.getId());
		
		return produto;
	}
	
	@WebMethod(operationName = "AtualizarProdutos")
	@WebResult(name = "Produto")
	public Produto atualizarProduto(Produto produto) throws SQLException{
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.atualizaProduto(produto);
		
		return produto;
	}
	
	@WebMethod(operationName = "InserirPedido")
	@WebResult(name = "Pedido")
	public void  inserirPedido(Cliente cliente) throws SQLException{
		
		PedidoDAO dao = new PedidoDAO();
		dao.inserePedido(cliente.getId());
		
	}
	
	@WebMethod(operationName = "ListarPedido")
	@WebResult(name = "Pedido")
	public List<Pedido> listarPedidos() throws SQLException{
		
		List<Pedido> lista = new ArrayList<>();
		PedidoDAO dao = new PedidoDAO();
		lista = dao.listarPedidos();
		
		return lista;
	}
	
	@WebMethod(operationName = "ExcluirPedido")
	@WebResult(name = "Pedido")
	public void  excluirPedido(Cliente cliente) throws SQLException{
		
		PedidoDAO dao = new PedidoDAO();
		dao.excluiPedido(cliente.getId());
		
	}
	
}
