package br.com.senaisp.bauru.richard.licao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome;
		//Mostrando a mensagem para o usuário
		System.out.println("Digite seu nome completo:");
		nome = scn.nextLine();
		//vamos separa nome de sobrenome
		String primNome = nome.substring(0,(nome+" ").indexOf(" "));
		//Pegar o último sobrenome
		String lastName = nome.substring(nome.lastIndexOf(" ")+1);
		//Mostrando o nome
		System.out.println(primNome);
		System.out.println(lastName);
		//fechando scanner
		scn.close();
	}

}
