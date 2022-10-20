package br.com.comex.ws;

import java.sql.SQLException;
import javax.xml.ws.Endpoint;

public class PublicaWebService {

	public static void main(String[] args) throws SQLException {

		ComexWs comex = new ComexWs();

		String url = "http://localhost:8080/comexws";
		
		Endpoint.publish(url, comex);
		
	}

}
