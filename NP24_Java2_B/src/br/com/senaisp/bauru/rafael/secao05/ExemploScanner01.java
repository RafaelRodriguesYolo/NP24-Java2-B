package br.com.senaisp.bauru.rafael.secao05;

import java.util.Scanner;

public class ExemploScanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nome = scn.nextLine();
		System.out.println("Digite um sobrenome: ");
		String sobrenome = scn.next();
		System.out.println("Olá " + nome + " " + sobrenome);
		
		scn.close();
	}

}
