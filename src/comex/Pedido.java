package comex;

public class Pedido {
	int id;
	String data;
	Cliente cliente;
	
	public  Pedido(int i, String date, Cliente cli) {
		id = i;
		data = date;
		cliente = cli;
	}
	
	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	
}
