package comex;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private int numero;
	private String complemento; 
	private String bairro;
	private String cidade;
	private String estado;
	private static int total = 0;
	
	public Cliente(String n, String c, String tel, String r, int num, String comp, String b, String city, String es) {
		total ++;
		id = total;
		this.nome = n;
		this.cpf = c;
		this.telefone = tel;
		this.rua = r;
		this.numero = num;
		this.complemento = comp;
		this.bairro = b;
		this.cidade = city;
		this.estado = es;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getRua() {
		return rua;
	}
	public int getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	
}
