package br.com.comex.csv.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.comex.csv.modelo.LeitorPedidoCsv;
import br.com.comex.csv.modelo.LeitorPedidoCsv;
import br.com.comex.csv.modelo.MontanteTotalVendas;
import br.com.comex.csv.modelo.PedidoCsv;
import br.com.comex.csv.modelo.PedidoMaisBaratoEMaisCaro;

public class MainPedidoMaisBaratoMaisCaro {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		List<PedidoCsv> pedidoCsv = new ArrayList<PedidoCsv>();
		
		pedidoCsv = leitor.lerPedidosCsv();
		
		
//		for (PedidoCsv pedidoCsv2 : pedidoCsv) {
//			System.out.println(pedidoCsv2);
//			double valor = Double.parseDouble(pedidoCsv2.getPreco());
//			int quantidade = Integer.parseInt(pedidoCsv2.getQuantidade());
//			double result = valor * quantidade;
//			System.out.println("Valor total: "+result);
//		}
		
		PedidoMaisBaratoEMaisCaro p1 = new PedidoMaisBaratoEMaisCaro();
		pedidoCsv.sort(p1);
		
//		System.out.println("-------------------");
		
//		for (PedidoCsv pedidoCsv2 : pedidoCsv) {
//			System.out.println(pedidoCsv2);
//			double valor = Double.parseDouble(pedidoCsv2.getPreco());
//			int quantidade = Integer.parseInt(pedidoCsv2.getQuantidade());
//			double result = valor * quantidade;
//			System.out.println("Valor total: "+result);
//		}
		
//		System.out.println("-------------------");
		double preco1 = Double.parseDouble(pedidoCsv.get(0).getPreco());
		int quantidade1 = Integer.parseInt(pedidoCsv.get(0).getQuantidade());
		
		int tamanho = pedidoCsv.size()-1;
		double preco2 = Double.parseDouble(pedidoCsv.get(tamanho).getPreco());
		int quantidade2 = Integer.parseInt(pedidoCsv.get(tamanho).getQuantidade());
		
		double totalBarato = preco1 * quantidade1;
		System.out.format(new Locale("pt","BR"), "%f", totalBarato);
		
		double totalCaro = preco2 * quantidade2;
		
		String totalBaratoConvertidoBr = String.format(new Locale("pt","BR"), "%.2f", totalBarato);
		String totalCaroConvertidoBr = String.format(new Locale("pt","BR"), "%.2f", totalCaro);
		
		
		System.out.println("O pedido mais barato eh: "+totalBaratoConvertidoBr + " ("+ pedidoCsv.get(0).getProduto()+")");
		System.out.println("O pedido mais caro eh: "+ totalCaroConvertidoBr  + " (" + pedidoCsv.get(pedidoCsv.size()-1).getProduto()+")");
	}
	
}
