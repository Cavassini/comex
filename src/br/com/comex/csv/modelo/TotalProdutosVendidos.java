package br.com.comex.csv.modelo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TotalProdutosVendidos {
	
	static int total;
	
	public int somaTotalProdutos() throws FileNotFoundException {
		
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		List<PedidoCsv> lista = new ArrayList<PedidoCsv>();
		lista = leitor.lerPedidosCsv();
		
		for (int i = 0; i<lista.size(); i++) {
			String quantidade = lista.get(i).getQuantidade();
			int soma = Integer.parseInt(quantidade);
			total = total + soma;
			
		}
		
		return total;
	}
}
