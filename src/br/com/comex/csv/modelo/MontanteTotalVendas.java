package br.com.comex.csv.modelo;

import java.util.List;
import java.util.Locale;

public class MontanteTotalVendas {
	
	public double calcularMontanteVendas(List<PedidoCsv> pedidoCsv){
		
		double total = 0;
		
		for (PedidoCsv pedidoCsv2 : pedidoCsv) {
			
			String quantidade = pedidoCsv2.getQuantidade();
			double quantidadeDouble = Double.parseDouble(quantidade);
			String preco = pedidoCsv2.getPreco();
			double precoDouble = Double.parseDouble(preco);
			
			total = total + (precoDouble * quantidadeDouble);
			
		}
		
		return total;
	}
}
