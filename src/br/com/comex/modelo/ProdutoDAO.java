package br.com.comex.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
	
	public ProdutoDAO() {
		
	}
	
	public void insereProduto(Produto produto) throws SQLException {
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();	
		
		PreparedStatement stm = con.prepareStatement("insert into comex.produto (nome,descricao,preco_unitario,quantidade_estoque,categoria_id,tipo) values (?,?,?,?,?,?)");
		
		stm.setString(1, produto.getNome());
		stm.setString(2, produto.getDescricao());
		stm.setDouble(3,produto.getPrecoUnitario());
		stm.setInt(4, produto.getQuantidadeEstoque());
		stm.setInt(5, 13);
		stm.setString(6, "ISENTO");
		
		stm.executeQuery();
		
		con.close();
		stm.close();
	}
	
	public List<Produto> listarProdutos() throws SQLException {
		
		List<Produto> lista = new ArrayList<>();
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();	
		
		PreparedStatement preparado = con.prepareStatement("select * from comex.produto");
		
		//preparado.setString(1, nome);
		
		ResultSet rst = preparado.executeQuery();
		
		while (rst.next()) {
			
			System.out.println(rst.getInt("id"));
			System.out.println(rst.getString("nome"));
			System.out.println(rst.getString("descricao"));
			System.out.println(rst.getDouble("preco_unitario"));
			System.out.println(rst.getInt("quantidade_estoque"));
			
			System.out.println("-------");
			
			
			int id = rst.getInt("id");  
			String nomeProduto = rst.getString("nome");
			String descricaoProduto = rst.getString("descricao");
			double precoUnitario = rst.getDouble("preco_unitario");
			int quantidadeEstoque = rst.getInt("quantidade_estoque");
			
			Categoria categoria = new Categoria("teste", "ATIVA");
			
			Produto produto = new Produto(id, nomeProduto, descricaoProduto, precoUnitario, quantidadeEstoque, categoria);
			
			lista.add(produto);
			
	}
		return lista;
}
	public void atualizaProduto(String novoNome, String descricao , double preco , int quantidade , int id) throws SQLException {
		
		ConnectionFactory conFa = new ConnectionFactory();
		Connection con = conFa.criarConexao();
		
		String sql = "update comex.produto set nome = ?, descricao = ?, preco_unitario= ?, quantidade_estoque = ?"
					+"where id= ?";
		
		PreparedStatement stm = con.prepareStatement(sql);
		
		stm.setString(1, novoNome);
		stm.setString(2, descricao);
		stm.setDouble(3, preco);
		stm.setInt(4, quantidade);
		stm.setInt(5, id);
		
		stm.execute();
		
		stm.close();
		con.close();
		
	}
	
	public void exclui(int id) throws SQLException {
		String sql = "delete from comex.produto where id = ?";
		ConnectionFactory conFa = new ConnectionFactory();
		Connection conexao = conFa.criarConexao();
		
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		
		ps.close();
	}
}