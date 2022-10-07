package br.com.comex.csv.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeitorPedidoCsv {

	private static int total;
		
	public static int getTotal() {
		return total;
	}

	public List<PedidoCsv> lerPedidosCsv() throws FileNotFoundException{
	
	List<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();
	
	Scanner scan = new Scanner(new File("pedidos.csv"));
	scan.nextLine();
	
	while (scan.hasNextLine()) {
		String linha = scan.nextLine();
		String[] valor = linha.split(",");
		
		String categoria = valor[0];
		String produto = valor[1];
		String preco = valor[2];
		String quantidade = valor[3];
		String data = valor[4];
		String cliente = valor[5];
		
		PedidoCsv pedido1  = new PedidoCsv(categoria, produto, cliente, preco, quantidade, data);
		pedidos.add(pedido1);
		
		total++;
		
		
	}
	return pedidos;
	
}
}