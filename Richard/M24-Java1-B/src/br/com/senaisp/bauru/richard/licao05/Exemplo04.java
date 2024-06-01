package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Exemplo04.
				class.getResourceAsStream("dados.cvs"));
		String linha = sc.nextLine(); //linha cabeçalho
		Scanner scA = new Scanner(linha);
		scA.useDelimiter(";"); //colocando como delimitador o ;
		//usando o laço - Impressão do cabeçalho
		while (scA.hasNext()) {
			System.out.print(scA.next() + "\t\t");
		}
		System.out.println();
		//fechando o scanner da linha
		scA.close();
		//Percorrendo os itens do arquivo
		while (sc.hasNext()) {
			linha = sc.nextLine();
			scA = new Scanner(linha);
			scA.useDelimiter(";");
			while (scA.hasNext()) {
				System.out.print(scA.next()+"\t");
			}
			System.out.println();//pulando a linha
			scA.close(); //fechando a linha
		}
		sc.close(); //fechando arquivo
		
	}

}
