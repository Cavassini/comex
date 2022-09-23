package comex;

public class MainCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(01, "Ana", "111222333", "121212", "rua A", 7, "ao lado do bar", "gabirobal",
				"Andradas", "mg");

		Cliente cliente2 = new Cliente(01, "Eli", "999888777", "234567", "rua B", 8, "na grafica", "alto da serra",
				"Andradas", "mg");

		Cliente cliente3 = new Cliente(01, "Gabi", "444555666", "9876543", "rua C", 9, "loja de ração", "portal do sol",
				"Andradas", "mg");

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
	}
}
