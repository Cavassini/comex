package br.com.comex.modelo;

public class ProdutoIsento extends Produto {

	public double calculaImposto (double p) {
		return 0;
	}
	public ProdutoIsento(){
		
	}
	public ProdutoIsento (int id, String nome, String descricao, 
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
				throw new IllegalArgumentException("Nome invalido, mínimo 3 caracteres");
}
			if (precoUnitario <=0) {
				throw new IllegalArgumentException("Preco deve ser maior que 0");
}
			if (quantidadeEstoque <= 0) {
				throw new IllegalArgumentException("Preco deve ser maior que 0");
}
			if (categoria == null) {
				throw new IllegalArgumentException("Categoria é obrigatorio");
}
}
	public String toString() {
		return "id:" + this.getId()+ " Nome:" + this.getNome() + " Descricao:" + this.getDescricao()+
				" Preco:"+this.getPrecoUnitario()+" Quantidade:"+this.getQuantidadeEstoque()+
				" CAtegoria: "+this.getCat();
		}
}
