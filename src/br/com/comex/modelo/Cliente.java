package br.com.comex.modelo;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private String numero;
	private String complemento; 
	private String bairro;
	private String cidade;
	private EnumEstado estado;
	private static int total = 0;
	
	public Cliente() {
		
	}
	
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Cliente.total = total;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(EnumEstado estado) {
		this.estado = estado;
	}

	public Cliente(String n, String c, String tel, String r, String num, String comp, String b, String city, String es) {
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
		this.estado = EnumEstado.valueOf(es);
		
		boolean validaCpf = cpf.matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d");
		boolean validatelefone = telefone.matches("\\d\\d-\\d\\d\\d\\d\\d-\\d\\d\\d\\d");
		
		
		if (this.nome.substring(0, 1).matches("[0-9]*")) {
			throw new IllegalArgumentException("Nome invalido");
		}
		if (validaCpf == false) {
			throw new IllegalArgumentException("Cpf invalido, formato incoerente");
		}
		if (validatelefone == false) {
			throw new IllegalArgumentException("Telefone invalido, formato incoerente");
		}
		if (this.id <0) {
			throw new IllegalArgumentException("Id invalido");
		}
		if (this.nome.length()<6) {
			throw new IllegalArgumentException("nome invalido");
		}
		if (this.cpf.length()<11 && this.cpf.length()>16) {
			throw new IllegalArgumentException("cpf invalido");
		}
		if (this.telefone == null || this.telefone.length() < 11 && this.telefone.length() > 16) {
			throw new IllegalArgumentException("cpf invalido");
		}
		if(numero.length()< 1 && !numero.equals("S/N")) {
			throw new IllegalArgumentException("numero invalido");
		}
		if (this.bairro.length()<2) {
			throw new IllegalArgumentException("bairro invalido");
		}
		if (this.cidade.length()<2) {
			throw new IllegalArgumentException("cidade invalido");
		}
		
		if (estado.values().length == 2) {
			throw new IllegalArgumentException("estado invalido");
		}		
		
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
	public String getNumero() {
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
	public EnumEstado getEstado() {
		return estado;
	}
	
	@Override
	public String toString() {
		return "id:" + this.getId()+ " Nome:" + this.getNome() + " cpf:" + this.getCpf()+
				" Telefone:"+this.getTelefone()+" Rua:"+this.getRua()+
				" Numero: "+this.getNumero()+ " Complemento:"+ this.getComplemento()
				+" Bairro:" + this.getBairro()+ " Cidade:" +this.getCidade() + " Estado:" +this.getEstado();
		}
	
}
