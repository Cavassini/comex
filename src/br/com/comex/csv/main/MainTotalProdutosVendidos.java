package br.com.comex.csv.main;

import java.io.FileNotFoundException;

import br.com.comex.csv.modelo.TotalProdutosVendidos;

public class MainTotalProdutosVendidos {
	public static void main(String[] args) throws FileNotFoundException {
		TotalProdutosVendidos t = new TotalProdutosVendidos();
		
		int resultado = t.somaTotalProdutos();
		
		System.out.println("Total de produtos Vendidos:"+resultado);
	}
}
