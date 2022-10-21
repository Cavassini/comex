package br.com.comex.modelo;

public class Pedido {
	private int id;
	private String data;
	private Cliente cliente;
	private static int total =0;
	
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Pedido.total = total;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", cliente=" + cliente + "]";
	}
	
	public  Pedido( String date, Cliente cli) {
		total ++;
		id = total;
		data = date;
		cliente = cli;
		
		if (cliente == null) {
			throw new ComexException("cliente é obrigatorio");
		}
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
