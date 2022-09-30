package br.com.comex.main;

import br.com.comex.modelo.*;

public class MainCAtegoria {
	public static void main(String[] args) {
		Categoria categoria1 = new Categoria(1,"INFORMATICA","ATIVA");		
		//System.out.println("Categoria "+ categoria1.getNome() + "(" + categoria1.getId() + " - " + categoria1.isStatus() + ")");
		
		Categoria categoria2 = new Categoria(2,"MOVEIS","ATIVA");		
		//System.out.println("Categoria "+ categoria2.getNome() + "(" + categoria2.getId() + " - " + categoria2.isStatus() + ")");
		
		Categoria categoria3 = new Categoria(5,"LIA","ATIVA");
		//System.out.println("Categoria "+ categoria3.getNome() + "(" + categoria3.getId() + " - " + categoria3.isStatus() + ")");
		
		System.out.println(categoria1);
		System.out.println(categoria2);
		System.out.println(categoria3);
	}
}
