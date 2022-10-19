package br.com.comex.ws;

import java.sql.SQLException;

import javax.xml.ws.Endpoint;

import br.com.comex.modelo.Categoria;

public class MainAdicionaCategoriaWS {

	public static void main(String[] args) throws SQLException {
		
		ComexWs comex = new ComexWs();
		Categoria cat = new Categoria("ELETRODOMESTICOS","INATIVA");
		
		comex.adicionarCategoria(cat);
		String url = "http://localhost:8080/comexws";
		
		Endpoint.publish(url, comex);

	}

}
