package br.com.comex.csv.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;

import br.com.comex.csv.modelo.LeitorPedidoCsv;
import br.com.comex.csv.modelo.PedidoCsv;

public class MainLerJSON {

	public static void main(String[] args) throws IOException, ParseException {

		LeitorPedidoCsv leitor = new LeitorPedidoCsv();

		leitor.LeitorJSON();
		
		
	}

}
