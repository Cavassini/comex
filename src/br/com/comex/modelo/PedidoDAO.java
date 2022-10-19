package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
	
	public void inserePedido(Cliente cliente) throws SQLException {
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();
		
		PreparedStatement stm = con.prepareStatement("insert into comex.pedido (data, cliente_id) values (sysdate , ?)");
		
		stm.setInt(1, cliente.getId());
		
		stm.executeQuery();
		
		con.close();
		stm.close();
	}
	
	public List<Pedido> listarPedidos() throws SQLException{
		
		List<Pedido> lista = new ArrayList<Pedido>();
		
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();
		
		PreparedStatement preparado = con.prepareStatement("select * from comex.pedido");
		
		ResultSet rst = preparado.executeQuery();
		
		while (rst.next()) {
			
			String data = rst.getString("data");
			int idCliente = rst.getInt("cliente_id");
			
			Cliente cliente = new Cliente("CArlos", "141.889.416-85", "35-99939-0522", data, data, data, data, data, "MG");
			Pedido pedido = new Pedido(data,cliente);
			
			lista.add(pedido);
			
		}
		
		return lista;
	}
	public void excluiPedido(int id) throws SQLException {
		String sql = "delete from comex.pedido where id = ?";
		ConnectionFactory conFa = new ConnectionFactory();
		Connection conexao = conFa.criarConexao();
		
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		
		ps.close();
	}
}
