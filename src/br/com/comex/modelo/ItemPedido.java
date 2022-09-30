package br.com.comex.modelo;

public class ItemPedido implements CalculadoraValorTotal{
	private  int id =0;
	private Produto precoUnitario;
	private Produto quantidade;
	private Produto produto;
	private Pedido pedido;
	private double desconto;
	private String tipoDesconto;
	private static int total = 1;
	
	@Override
	public String toString() {
		return "id:" + this.getId()+ " Preco:" + 
				this.getPrecoUnitario() + " Quantidade:" + this.getQuantidade()
				+" Produto:" + this.getProduto() 
				+ " Pedido:" + this.getPedido()
				+ " Desconto"+ this.getDesconto();
		}
	
	public ItemPedido( Produto preco, Produto qtd, Produto p, Pedido ped, String tipo) {
		
		id = total;
		precoUnitario = preco;
		quantidade = qtd;
		produto = p;
		pedido = ped;
		tipoDesconto = tipo;
		desconto = CalculaDesconto();
		total ++;
	}
	
	public int getId() {
		return id;
	}
	public Produto getPrecoUnitario() {
		return precoUnitario;
	}
	public Produto getQuantidade() {
		return quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public double getDesconto() {
		return desconto;
	}
	
	public double precoTotalSemDesconto() {
		
		double total = this.getQuantidade().getQuantidadeEstoque() * this.getPrecoUnitario().getPrecoUnitario();
		return total;
		
	}
	
	public double CalculaDesconto() {
		
		if (this.tipoDesconto == "NENHUM") {
			return 0;
		}
		if (this.tipoDesconto == "PROMOCAO") {
			return 0.2;
		}
		if (this.tipoDesconto == "QUANTIDADE" && this.getQuantidade().getQuantidadeEstoque() > 10) {
			return 0.1;
		}
		else {
			return 0;
		}
	}
	
	public double PrecoTotalComDesconto() {
		double total = this.getPrecoUnitario().getPrecoUnitario() - this.getDesconto();
		return total;
		
	}

	@Override
	public double calculadora(double preco, int qtd) {
		return preco * qtd;
	}
	}
	

