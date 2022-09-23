package comex;

public class MainPedido {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(01, "Ana", "111222333", "121212", "rua A", 7, "ao lado do bar", "gabirobal",
				"Andradas", "mg");
		Cliente cliente2 = new Cliente(01, "Eli", "999888777", "234567", "rua B", 8, "na grafica", "alto da serra",
				"Andradas", "mg");
		
		Pedido pedido1 = new Pedido(1,"23/09/2022",cliente1);
		Pedido pedido2 = new Pedido(2,"19/11/2002",cliente2);
		Pedido pedido3 = new Pedido(3,"18/06/1998",cliente1);
		
		System.out.println("Id:"+ pedido1.getId() + " Data:" + pedido1.getData() + " Cliente:" + pedido1.getCliente().getNome());
		System.out.println("Id:"+ pedido2.getId() + " Data:" + pedido2.getData() + " Cliente:" + pedido2.getCliente().getNome());
		System.out.println("Id:"+ pedido3.getId() + " Data:" + pedido3.getData() + " Cliente:" + pedido3.getCliente().getNome());
		

	}

}
