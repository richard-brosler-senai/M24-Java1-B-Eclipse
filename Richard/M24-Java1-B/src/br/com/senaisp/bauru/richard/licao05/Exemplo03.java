package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		//Utilizando o Scanner para separar os nomes
		//passando a entrada para nome
		Scanner scA = new Scanner(nome); 
		String primeiroNome="", ultimoNome="";
		//Utilizando o laço while
		while (scA.hasNext()) {
			ultimoNome = scA.next();
			if (primeiroNome.equals("")) {
				primeiroNome = ultimoNome;
			}
		}
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Último nome: " + ultimoNome);
		//Fechando os scanners
		scA.close();
		sc.close();
	}

}
