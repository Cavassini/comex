package br.com.comex.ws;

import br.com.comex.modelo.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.comex.modelo.Categoria;

@WebService
public class ComexWs {
	
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
	public void adicionarCategoria(@WebParam(name="nome")Categoria categoria) throws SQLException {
		
		ConnectionFactory conFa = new ConnectionFactory();
		
		Connection con = conFa.criarConexao();
		String nome = categoria.getNome();
		String status = categoria.isStatus().name();
		
		String sql = "insert into comex.categoria (NOME,STATUS) values (?,?) ";
		
		PreparedStatement preparado = con.prepareStatement(sql);
		
		preparado.setString(1, nome);
		preparado.setString(2, status);
		
		preparado.executeQuery();
	}
}
