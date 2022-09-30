package br.com.comex.modelo;

public class Produto implements CalculadoraValorTotal {
	private int id;
	protected String nome;
	protected String descricao;
	protected double precoUnitario;
	protected int quantidadeEstoque;
	protected Categoria cat;
	private static int total = 1;
	
	
	
	public Produto () {
		id = total;
		total ++;
	}
	public Produto (int id, String nome, String descricao, 
					double precoUnitario, int quantidadeEstoque, 
			        Categoria categoria) {
		this.setId(id); 
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.cat = categoria;
		
		if (this.nome.substring(0, 1).matches("[0-9]*")) {
			throw new IllegalArgumentException("Nome invalido");
		}
		
		if (this.getId() <= 0) {
			throw new IllegalArgumentException("ID deve ser maior que 0");
		}
		if (nome.length()<5) {
			throw new IllegalArgumentException("Nome invalido, mínimo 5 caracteres");
		}
		if (precoUnitario <=0) {
			throw new IllegalArgumentException("Preco deve ser maior que 0");
		}
		if (quantidadeEstoque <= 0) {
			throw new IllegalArgumentException("Quantidade em estoque deve ser mair que 0");
		}
		if (categoria == null) {
			throw new IllegalArgumentException("Categoria é obrigatorio");
		}
	}
	
	public double calculaValorEstoque (double p, int q ) {
		double total = p*q;
		return total;
		
	}
	public double calculaImposto (double p) {
		double total = p * 0.4;
		return total;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public Categoria getCat() {
		return cat;
	}
	public void setCat(Categoria cat) {
		this.cat = cat;
	}

	@Override
	public double calculadora(double preco, int qtd) {		
		return preco * qtd;
	}
	
	@Override
	public String toString() {
		return "id:" + this.getId()+ " Nome:" + this.getNome() + " Descricao:" + this.getDescricao()+
				" Preco:"+this.getPrecoUnitario()+" Quantidade:"+this.getQuantidadeEstoque()+
				" CAtegoria: "+this.getCat();
		}

}
