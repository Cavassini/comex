package br.com.comex.main;

import br.com.comex.modelo.*;

public class MainPedido {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente( "Ana Cristina", "111222333", "121212", "rua A", "7", "ao lado do bar", "gabirobal",
				"Andradas", "MG");
		Cliente cliente2 = new Cliente( "Eliana", "999888777", "234567", "rua B", "8", "na grafica", "alto da serra",
				"Andradas", "MG");
		
		Pedido pedido1 = new Pedido("23/09/2022",cliente1);
		Pedido pedido2 = new Pedido("19/11/2002",cliente2);
		Pedido pedido3 = new Pedido("18/06/1998",cliente1);
		
		System.out.println(pedido1);
		System.out.println(pedido2);
		System.out.println(pedido3);
		
		
		/**
		System.out.println("Id:"+ pedido1.getId() + " Data:" + pedido1.getData() + " Cliente:" + pedido1.getCliente().getNome());
		System.out.println("Id:"+ pedido2.getId() + " Data:" + pedido2.getData() + " Cliente:" + pedido2.getCliente().getNome());
		System.out.println("Id:"+ pedido3.getId() + " Data:" + pedido3.getData() + " Cliente:" + pedido3.getCliente().getNome());
		
		Cliente cliente3 = null;
		
		Pedido pedido4 = new Pedido("23/09/2022",cliente3);
		
		System.out.println("Id:"+ pedido4.getId() + " Data:" + pedido4.getData() + " Cliente:" + pedido4.getCliente().getNome());
		**/
	}

}
