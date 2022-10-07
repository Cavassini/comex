package br.com.comex.csv.modelo;

import java.util.ArrayList;
import java.util.List;

public class TotalCategorias {
	
	public int  verTotalCategoriasDistintas (List<PedidoCsv> pedidoCsv) {
		
		List<String> lista = new ArrayList <String>();

		for (PedidoCsv pedidoCsv2 : pedidoCsv) {
			
			String categoria = pedidoCsv2.getCategoria();
			System.out.println("Categoria a ser analisada:"+categoria);
			
			if(!lista.contains(categoria)) {
				lista.add(categoria);
				System.out.println("Adicionou: "+categoria);
			}
			else {
				System.out.println("Essa categoria ja existe na lista: "+categoria);
			}
		}
		return lista.size();
	}
	
}
