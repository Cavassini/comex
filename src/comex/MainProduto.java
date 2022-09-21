package comex;

public class MainProduto {

	public static void main(String[] args) {
		
		Categoria categoria1 = new Categoria();
		categoria1.setId(1);
		categoria1.setNome("INFORMATICA");
		categoria1.setStatus("Ativa");
		
		Categoria categoria2 = new Categoria();
		categoria2.setId(2);
		categoria2.setNome("LIVROS");
		categoria2.setStatus("Ativa");
		
		Produto produto1 = new Produto();
		produto1.setId(1);
		produto1.setNome("Notebook Samsung");
		produto1.setPrecoUnitario(3523.0);
		produto1.setQuantidadeEstoque(1);
		produto1.setCat(categoria1);
		
		Produto produto2 = new Produto();
		produto2.setId(2);
		produto2.setNome("Clean Architecture");
		produto2.setPrecoUnitario(102.90);
		produto2.setQuantidadeEstoque(3);
		produto2.setCat(categoria2);
		
		Produto produto3 = new Produto();
		produto3.setId(3);
		produto3.setNome("Monitor Dell 27");
		produto3.setPrecoUnitario(1889.00);
		produto3.setQuantidadeEstoque(3);
		produto3.setCat(categoria1);
		
		
		
		System.out.println("Produto: " + produto1.getNome());
		System.out.println("Id: " + produto1.getId());
		System.out.println("Custa: "+ produto1.getPrecoUnitario() + " por unidade");
		System.out.println("Em estoque: " + produto1.getQuantidadeEstoque() + " unidades");
		System.out.println("Categoria: " + produto1.getCat().getNome());
		System.out.println("O imposto eh: " + produto1.calculaImposto(produto1.getPrecoUnitario()));
		System.out.println("o valor de estoque do produto eh: " + produto1.calculaValorEstoque(produto1.getPrecoUnitario() , produto1.getQuantidadeEstoque()));
		
		System.out.println("----------------------------------------");
		System.out.println("");
		
		System.out.println("Produto: " + produto2.getNome());
		System.out.println("Id: " + produto2.getId());
		System.out.println("Custa: "+ produto2.getPrecoUnitario() + " por unidade");
		System.out.println("Em estoque: " + produto2.getQuantidadeEstoque() + " unidades");
		System.out.println("Categoria: " + produto2.getCat().getNome());
		System.out.println("O imposto eh: " + produto2.calculaImposto(produto2.getPrecoUnitario()));
		System.out.println("o valor de estoque do produto eh: " + produto2.calculaValorEstoque(produto2.getPrecoUnitario() , produto2.getQuantidadeEstoque()));
		
		System.out.println("----------------------------------------");
		System.out.println("");
		
		System.out.println("Produto: " + produto3.getNome());
		System.out.println("Id: " + produto3.getId());
		System.out.println("Custa: "+ produto3.getPrecoUnitario() + " por unidade");
		System.out.println("Em estoque: " + produto3.getQuantidadeEstoque() + " unidades");
		System.out.println("Categoria: " + produto3.getCat().getNome());
		System.out.println("O imposto eh: " + produto3.calculaImposto(produto3.getPrecoUnitario()));
		System.out.println("o valor de estoque do produto eh: " + produto3.calculaValorEstoque(produto3.getPrecoUnitario() , produto3.getQuantidadeEstoque()));

	}

}
