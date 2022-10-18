package br.com.comex.modelo;

import javax.xml.bind.annotation.XmlAccessorOrder;

@XmlAccessorOrder
public class Categoria {
	private int id;
	private String nome;
	private EnumStatus status = EnumStatus.ATIVA;
	private static int total = 0;
	
	public Categoria () {
		
	}
	
	public Categoria (int identificador, String nome, String status) {
		//total ++;
		//id = total;
		id = identificador;
		this.nome = nome;
		this.status = EnumStatus.valueOf(status);
		if (this.nome.substring(0, 1).matches("[0-9]*")) {
			throw new IllegalArgumentException("Nome invalido");
		}
		if (id <= 0) {
			throw new IllegalArgumentException("ID invalido");
		}
		if (nome.length()<3) {
			throw new IllegalArgumentException("Nome invalido, mínimo 3 caracteres");
		}
		if (this.status != EnumStatus.ATIVA && this.status != EnumStatus.INATIVA) {
			throw new IllegalArgumentException("Status só aceita ATIVA/INATIVA");
		}
	}
	public Categoria (String nome, String status) {
		total ++;
		id = total;
		this.nome = nome;
		this.status = EnumStatus.valueOf(status);
		
		if (id <= 0) {
			throw new IllegalArgumentException();
		}
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

	public EnumStatus isStatus() {
		return status;
	}

	public void setStatus(EnumStatus status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "id:" + this.getId()+ " Nome:" + this.getNome() + " Status:" + this.status;
		}

}
