package br.com.comex.csv.modelo;

import java.util.Comparator;
import java.util.List;

public class PedidoMaisBaratoEMaisCaro implements Comparator<PedidoCsv>{

	@Override
	public int compare(PedidoCsv p1, PedidoCsv p2) {
		
		double precoP1 = Double.parseDouble(p1.getPreco());
		int quantidadeP1 = Integer.parseInt(p1.getQuantidade());
		
		double precoP2 = Double.parseDouble(p2.getPreco());
		int quantidadeP2 = Integer.parseInt(p2.getQuantidade());
		
		double totalp1 = precoP1 * quantidadeP1;
		double totalp2 = precoP2 * quantidadeP2;
		
		if (totalp1 > totalp2) {
			return 1;
		}
		if (totalp1 == totalp2) {
			return 0;
		}
		else return -1;
		
	}
}
