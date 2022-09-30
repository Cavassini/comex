package br.com.comex.main;

import br.com.comex.modelo.*;

public class MainProduto {

	public static void main(String[] args) {
		
		Categoria categoria1 = new Categoria("INFORMATICA","ATIVA");
		Categoria categoria2 = new Categoria("MOVEIS","INATIVA");
		
		Produto produto1 = new Produto(1,"Notebook Samsung","1tb",3523.0,1,categoria1);
		Produto produto2 = new Produto(2,"Clean Architecture","200pg",102.90,1,categoria2);
		Produto produto3 = new Produto(3,"Monitor Dell 27","18polegas",102.90,3,categoria2);
		
		System.out.println(produto1);
		System.out.println(produto2);
		System.out.println(produto3);
		/**
		System.out.println("Produto: " + produto1.getNome());
		System.out.println("Id: " + produto1.getId());
		System.out.println("Custa: "+ produto1.getPrecoUnitario() + " por unidade");
		System.out.println("Em estoque: " + produto1.getQuantidadeEstoque() + " unidades");
		System.out.println("Categoria: " + produto1.getCat().getNome());
		System.out.println("O imposto eh: " + produto1.calculaImposto(produto1.getPrecoUnitario()));
		System.out.println("o valor de estoque do produto eh: " + produto1.calculaValorEstoque(produto1.getPrecoUnitario() , produto1.getQuantidadeEstoque()));
		
		//Produto produto4 = new Produto(0,"MOUSE","GAMER",102.90,3,categoria1);
		
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
		
		System.out.println("Produto: " + produto2.getNome());
		System.out.println("Id: " + produto2.getId());
		System.out.println("Custa: "+ produto2.getPrecoUnitario() + " por unidade");
		System.out.println("Em estoque: " + produto2.getQuantidadeEstoque() + " unidades");
		System.out.println("Categoria: " + produto2.getCat().getNome());
		System.out.println("O imposto eh: " + produto2.calculaImposto(produto2.getPrecoUnitario()));
		System.out.println("o valor de estoque do produto eh: " + produto2.calculaValorEstoque(produto2.getPrecoUnitario() , produto2.getQuantidadeEstoque()));
		
		//Produto produto4 = new Produto(5,"MOUs","GAMER",102.90,3,categoria1);
		
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
		
		System.out.println("Produto: " + produto3.getNome());
		System.out.println("Id: " + produto3.getId());
		System.out.println("Custa: "+ produto3.getPrecoUnitario() + " por unidade");
		System.out.println("Em estoque: " + produto3.getQuantidadeEstoque() + " unidades");
		System.out.println("Categoria: " + produto3.getCat().getNome());
		System.out.println("O imposto eh: " + produto3.calculaImposto(produto3.getPrecoUnitario()));
		System.out.println("o valor de estoque do produto eh: " + produto3.calculaValorEstoque(produto3.getPrecoUnitario() , produto3.getQuantidadeEstoque()));

		//Produto produto4 = new Produto(5,"MOUSE","GAMER",0,3,categoria1);
		//Produto produto4 = new Produto(5,"MOUSE","GAMER",102.90,0,categoria1);
		//Produto produto4 = new ProdutoIsento(0,"MOUSE","GAMER",102.90,3,categoria1);
		//Produto produto4 = new ProdutoIsento(5,"MOUS","GAMER",102.90,3,categoria1);
		//Produto produto4 = new Produto(5,"MOUSE","GAMER",0,3,categoria1);
		//Produto produto4 = new ProdutoIsento(5,"MOUSE","GAMER",102.90,0,categoria1);
		
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
		
		**/
	}

}
