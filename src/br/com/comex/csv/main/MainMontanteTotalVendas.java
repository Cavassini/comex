package br.com.comex.csv.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.csv.modelo.LeitorPedidoCsv;
import br.com.comex.csv.modelo.MontanteTotalVendas;
import br.com.comex.csv.modelo.PedidoCsv;



public class MainMontanteTotalVendas {
	public static void main(String[] args) throws FileNotFoundException {
		
		List<PedidoCsv> pedidoCsv = new ArrayList<PedidoCsv>();
		
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		
		pedidoCsv =  leitor.lerPedidosCsv();
		
		MontanteTotalVendas montante = new MontanteTotalVendas();
		
		double retorno = montante.calcularMontanteVendas(pedidoCsv);
		
		System.out.println("O Montante de vendas eh: "+ retorno);
		
	}
}
