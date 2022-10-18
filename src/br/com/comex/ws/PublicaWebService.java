package br.com.comex.ws;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Endpoint;

import br.com.comex.modelo.Categoria;

public class PublicaWebService {

	public static void main(String[] args) throws SQLException {

		ComexWs comex = new ComexWs();
		List<Categoria>lista = new ArrayList<>();
		lista = comex.getCategorias();
		
		for (Categoria categoria : lista) {
			System.out.println(categoria);
			
		}
		String url = "http://localhost:8080/comexws";
		
		Endpoint.publish(url, comex);
		
	}

}
