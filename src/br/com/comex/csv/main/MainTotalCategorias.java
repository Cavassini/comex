package br.com.comex.csv.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.csv.modelo.LeitorPedidoCsv;
import br.com.comex.csv.modelo.PedidoCsv;
import br.com.comex.csv.modelo.TotalCategorias;

public class MainTotalCategorias {
	public static void main(String[] args) throws FileNotFoundException {
		
		List<PedidoCsv> pedidoCsv = new ArrayList<PedidoCsv>();
		
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		
		pedidoCsv =  leitor.lerPedidosCsv();
		
		TotalCategorias produtos1 = new TotalCategorias();
		int resultado = produtos1.verTotalCategoriasDistintas(pedidoCsv);
		
		
		System.out.println("Total de categorias diferentes: "+resultado);
	}
}
