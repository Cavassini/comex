package br.com.comex.main;

public class teste {

	public static void main(String[] args) {
		
		boolean email = "@".matches(".");
		System.out.println("Qualquer caractere: "+email);

		boolean  numero = "a".matches("\\d");
		System.out.println("Possui número: "+numero);

		numero = "2".matches("\\d");
		System.out.println("Possui número: "+numero);

		boolean letrasNumeros = "A2".matches("\\w\\d");
		System.out.println("Possui letras e números? "+letrasNumeros);

		boolean espaco = " ".matches("\\s");
		System.out.println("Possui espaço? "+espaco);
		
		String cep = "\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
		boolean validaCpf = "111.222.333-44".matches(cep);
		System.out.println(validaCpf);
		
		//boolean validatelefone = telefone.matches("\\(d\\d)\\ d\\ d\\d\\d-\\d\\d\\d\\d");
		
	}

}
