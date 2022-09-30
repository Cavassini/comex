package br.com.comex.main;

import br.com.comex.modelo.*;

public class MainCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente( "Ana Luiza", "111.222.333-44", "35-99939-0522", "rua A", "01", "ao lado do bar", "gabirobal","Andradas", "SP");
		System.out.println(cliente1);
		Cliente cliente2 = new Cliente( "1Ana Luiza", "111.222.333-44", "35-99939-0522", "rua A", "01", "ao lado do bar", "gabirobal","Andradas", "SP");
		System.out.println(cliente2);
		Cliente cliente3 = new Cliente( "Ana Luiza", "11122233344", "35-99939-0522", "rua A", "01", "ao lado do bar", "gabirobal","Andradas", "SP");
		System.out.println(cliente3);
		Cliente cliente4 = new Cliente( "Ana Luiza", "111.222.333-44", "35-99939-0522", "rua A", "01", "ao lado do bar", "gabirobal","Andradas", "SP");
		System.out.println(cliente4);
		
		/**
		System.out.println("Nome:" + cliente1.getNome() + " cpf:" + cliente1.getCpf() + " telefone:"
				+ cliente1.getTelefone() + " Rua:" + cliente1.getRua() + " Numero:" + cliente1.getNumero()
				+ " Complemento:" + cliente1.getComplemento() + " Bairro:" + cliente1.getBairro() + " Cidade:"
				+ cliente1.getCidade() + " Estado:" + cliente1.getEstado());

		System.out.println("Nome:" + cliente2.getNome() + " cpf:" + cliente2.getCpf() + " telefone:"
				+ cliente2.getTelefone() + " Rua:" + cliente2.getRua() + " Numero:" + cliente2.getNumero()
				+ " Complemento:" + cliente2.getComplemento() + " Bairro:" + cliente2.getBairro() + " Cidade:"
				+ cliente2.getCidade() + " Estado:" + cliente2.getEstado());

		System.out.println("Nome:" + cliente3.getNome() + " cpf:" + cliente3.getCpf() + " telefone:"
				+ cliente3.getTelefone() + " Rua:" + cliente3.getRua() + " Numero:" + cliente3.getNumero()
				+ " Complemento:" + cliente3.getComplemento() + " Bairro:" + cliente3.getBairro() + " Cidade:"
				+ cliente3.getCidade() + " Estado:" + cliente3.getEstado());
				**/
		
		
	}
}
