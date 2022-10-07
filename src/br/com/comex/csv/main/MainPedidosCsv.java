package br.com.comex.csv.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.comex.csv.modelo.LeitorPedidoCsv;

public class MainPedidosCsv {

	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorPedidoCsv leitor = new LeitorPedidoCsv();
		
		leitor.lerPedidosCsv();
		
		System.out.println("Total de pedidos: "+leitor.getTotal());
		
	}}
