package br.com.comex.csv.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.xdevapi.JsonArray;

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
	
	public List<PedidoCsv> LerPedidosJSON() throws IOException, ParseException{
		
		List<PedidoCsv> lista = new ArrayList<>();
		JSONObject json;
		JSONParser parser = new JSONParser();
		
		json = (JSONObject) parser.parse(new FileReader("teste.json"));
		
		String categoria = (String)json.get("categoria");
		String produto = (String)json.get("produto");
		String preco = (String)json.get("preco");
		String nome = (String)json.get("categoria");
		String data = (String)json.get("data");
		String cliente = (String)json.get("cliente");
		
		PedidoCsv pedido = new PedidoCsv(categoria,produto , preco, nome, data, cliente);
		
		lista.add(pedido);
		return lista;
	}
	
	public void LeitorJSON() throws FileNotFoundException, IOException, ParseException {
		
		
		JSONObject json;
		JSONParser parser = new JSONParser();
		
		FileReader reader = new FileReader("teste.json");
		
		Object obj = parser.parse(reader);
		JSONArray lista = (JSONArray) obj;
		
		System.out.println(lista);
		

	}
}