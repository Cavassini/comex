package comex;

public class Categoria {
	private int id;
	private String nome;
	private String status;
	private static int total = 0;

	public Categoria () {
		total ++;
		id = total;
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

	public String isStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
