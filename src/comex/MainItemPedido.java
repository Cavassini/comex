package comex;

public class MainItemPedido {

	public static void main(String[] args) {

		Categoria categoria1 = new Categoria();
		categoria1.setId(1);
		categoria1.setNome("INFORMATICA");
		categoria1.setStatus("Ativa");
		
		Categoria categoria2 = new Categoria();
		categoria2.setId(2);
		categoria2.setNome("MOVEIS");
		categoria2.setStatus("Inativa");		
		
		Categoria categoria3 = new Categoria();
		categoria3.setId(3);
		categoria3.setNome("LIVROS");
		categoria3.setStatus("Ativa");

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

		Cliente cliente1 = new Cliente(01, "Ana", "111222333", "121212", "rua A", 7, "ao lado do bar", "gabirobal",
				"Andradas", "mg");
		
		Cliente cliente2 = new Cliente(01, "Eli", "999888777", "234567", "rua B", 8, "na grafica", "alto da serra",
				"Andradas", "mg");

		Cliente cliente3 = new Cliente(01, "Gabi", "444555666", "9876543", "rua C", 9, "loja de ração", "portal do sol",
				"Andradas", "mg");

		Pedido pedido1 = new Pedido(1, "23/09/2022", cliente1);
		
		Pedido pedido2 = new Pedido(2, "22/05/1967", cliente2);
		
		Pedido pedido3 = new Pedido(2, "18/06/1998", cliente3);

		ItemPedido item1 = new ItemPedido(produto1, produto1, produto1, pedido1, "PROMOCAO");
		ItemPedido item2 = new ItemPedido(produto2, produto2, produto2, pedido2, "NENHUM");
		ItemPedido item3 = new ItemPedido(produto3, produto3, produto3, pedido3, "QUANTIDADE");

		System.out.println("Id do ItemPedido: " + item1.getId());
		System.out.println("Preco: " + item1.getPrecoUnitario().getPrecoUnitario());
		System.out.println("Quantidade: " + item1.getQuantidade().getQuantidadeEstoque());
		System.out.println("Nome do produto: "+ item1.getProduto().getNome());
		System.out.println("Id do Pedido: " + item1.getPedido().getId());
		System.out.println("Desconto: "+ item1.getDesconto());
		
		System.out.println();
		
		System.out.println("Id do ItemPedido: " + item2.getId());
		System.out.println("Preco: " + item2.getPrecoUnitario().getPrecoUnitario());
		System.out.println("Quantidade: " + item2.getQuantidade().getQuantidadeEstoque());
		System.out.println("Nome do produto: "+ item2.getProduto().getNome());
		System.out.println("Id do Pedido: " + item2.getPedido().getId());
		System.out.println("Desconto: "+ item2.getDesconto());
		
		System.out.println();
		
		System.out.println("Id do ItemPedido: " + item3.getId());
		System.out.println("Preco: " + item3.getPrecoUnitario().getPrecoUnitario());
		System.out.println("Quantidade: " + item3.getQuantidade().getQuantidadeEstoque());
		System.out.println("Nome do produto: "+ item3.getProduto().getNome());
		System.out.println("Id do Pedido: " + item3.getPedido().getId());
		System.out.println("Desconto: "+ item3.getDesconto());
		
	}

}
