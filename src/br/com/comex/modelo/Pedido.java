package br.com.comex.modelo;

public class Pedido {
	private int id;
	private String data;
	private Cliente cliente;
	private static int total =0;
	
	@Override
	public String toString() {
		return "id:" + this.getId()+ " Data:" + this.getData() + " Cliente:" + this.getCliente();
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
