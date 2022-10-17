package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
	
	public void insereCliente (Cliente cliente) throws SQLException {
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();	
		
		PreparedStatement stm = con.prepareStatement("insert into comex.cliente (nome,cpf ,telefone ,rua ,numero ,complemento, bairro, cidade, uf) "
				+ "values ( ?,?,?,?,?,?, ? , ?, ?)");
		
		stm.setString(1, cliente.getNome());
		stm.setString(2, cliente.getCpf());
		stm.setString(3,cliente.getTelefone());
		stm.setString(4, cliente.getRua());
		stm.setString(5, cliente.getNumero());
		stm.setString(6, cliente.getComplemento());
		stm.setString(7, cliente.getBairro());
		stm.setString(8, cliente.getCidade());
		stm.setString(9, "MG");
		
		
		stm.executeQuery();
		
		con.close();
		stm.close();
		
	}
	
	public List<Cliente> listarClientes() throws SQLException {
		
		List<Cliente> lista = new ArrayList<>();
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();	
		
		PreparedStatement preparado = con.prepareStatement("select * from comex.cliente");
		
		ResultSet rst = preparado.executeQuery();
		
		while (rst.next()) {
			
			System.out.println(rst.getString("nome"));
			System.out.println("-------");
			
			
			int id = rst.getInt("id");  
			String nome = rst.getString("nome");
			String cpf = rst.getString("cpf");
			String telefone = rst.getString("telefone");
			String rua = rst.getString("rua");	
			String numero = rst.getString("numero");
			String complemento = rst.getString("complemento");
			String bairro = rst.getString("bairro");
			String cidade = rst.getString("cidade");
			String uf = rst.getString("uf");
			
			Cliente cliente = new Cliente( nome, cpf, telefone, rua, numero, complemento, bairro, cidade, uf);
			
			
			lista.add(cliente);
			
	}
		return lista;
}
}
