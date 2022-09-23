package comex;

public class Pedido {
	private int id;
	private String data;
	private Cliente cliente;
	private static int total =0;
	
	public  Pedido( String date, Cliente cli) {
		total ++;
		id = total;
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
