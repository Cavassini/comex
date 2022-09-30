package br.com.comex.main;

import br.com.comex.modelo.*;

public class MainCalculadoraValorTotal {

	public static void main(String[] args)  {
		
		Categoria categoria1 = new Categoria("INFORMATICA", "Ativa");
		
		Categoria categoria2 = new Categoria("MOVEIS","Inativa");

		Categoria categoria3 = new Categoria("LIVROS","Ativa");

		Produto produto1 = new Produto();
		produto1.setId(1);
		produto1.setNome("Notebook Samsung");
		produto1.setPrecoUnitario(3523.0);
		produto1.setQuantidadeEstoque(1);
		produto1.setCat(categoria1);
		
		ProdutoIsento produto2 = new ProdutoIsento();
		produto2.setId(2);
		produto2.setNome("Clean Architecture");
		produto2.setPrecoUnitario(102.90);
		produto2.setQuantidadeEstoque(3);
		produto2.setCat(categoria2);
		
		Produto produto3 = new Produto();
		produto3.setId(3);
		produto3.setNome("Monitor Dell 27");
		produto3.setPrecoUnitario(1889.00);
		produto3.setQuantidadeEstoque(15);
		produto3.setCat(categoria1);

		Cliente cliente1 = new Cliente("Ana", "111222333", "121212", "rua A", "7", "ao lado do bar", "gabirobal",
				"Andradas", "mg");
		
		Cliente cliente2 = new Cliente( "Eli", "999888777", "234567", "rua B", "8", "na grafica", "alto da serra",
				"Andradas", "mg");

		Cliente cliente3 = new Cliente( "Gabi", "444555666", "9876543", "rua C", "9", "loja de ração", "portal do sol",
				"Andradas", "mg");

		Pedido pedido1 = new Pedido( "23/09/2022", cliente1);
		
		Pedido pedido2 = new Pedido( "22/05/1967", cliente2);
		
		Pedido pedido3 = new Pedido( "18/06/1998", cliente3);

		ItemPedido item1 = new ItemPedido(produto1, produto1, produto1, pedido1, "PROMOCAO");
		ItemPedido item2 = new ItemPedido(produto2, produto2, produto2, pedido2, "NENHUM");
		ItemPedido item3 = new ItemPedido(produto3, produto3, produto3, pedido3, "QUANTIDADE");
		
		System.out.println("Resultado: "+item1.calculadora(item1.getPrecoUnitario().getPrecoUnitario(), item1.getQuantidade().getQuantidadeEstoque()));
		System.out.println("Resultado: "+item2.calculadora(item2.getPrecoUnitario().getPrecoUnitario(), item2.getQuantidade().getQuantidadeEstoque()));
		System.out.println("Resultado: "+item3.calculadora(item3.getPrecoUnitario().getPrecoUnitario(), item3.getQuantidade().getQuantidadeEstoque()));
		
		System.out.println("Resultado: "+produto1.calculadora(produto1.getPrecoUnitario(), produto1.getQuantidadeEstoque()));
		System.out.println("Resultado: "+produto2.calculadora(produto2.getPrecoUnitario(), produto2.getQuantidadeEstoque()));
		System.out.println("Resultado: "+produto3.calculadora(produto3.getPrecoUnitario(), produto3.getQuantidadeEstoque()));
	}

}
