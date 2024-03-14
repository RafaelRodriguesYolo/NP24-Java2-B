package br.com.senaisp.bauru.rafael.secao01;

import java.util.Scanner;

public class RevisaoVetor {

	public static void main(String[] args) {
		String nomes[] = new String[10];
		Scanner scn = new Scanner(System.in);
		//Colocando os daos na memória
		for (int i=0; i<10; i++) {
			System.out.println("Digite o nome " + (i+1) + ":");
			nomes[i] = scn.nextLine();
		}
		//listando os nomes
		for (String nome : nomes) { // for each
			System.out.println(nome);
		}
		//Fechado o scanner
		scn.close();
	}

}
