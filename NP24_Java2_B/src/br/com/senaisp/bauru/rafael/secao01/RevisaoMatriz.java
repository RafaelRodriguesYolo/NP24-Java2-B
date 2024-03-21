package br.com.senaisp.bauru.rafael.secao01;

import java.util.Scanner;

public class RevisaoMatriz {

	public static void main(String[] args) {
		char[][] acentos = new char[9][9];
		Scanner scn = new Scanner(System.in);
		//Inicializando os acentos com _
		for (int linha = 0; linha < 9; linha++) {
			for (int coluna = 0; coluna <9; coluna++) {
				acentos[linha][coluna] = '_';
			}
		}
		//Reserva de lugar
		for (int linha = 0; linha < 9; linha++) {
			for (int coluna = 0; coluna <9; coluna++) {
				System.out.print(acentos[linha][coluna] + " ");
				
			}
			System.out.println();
		}
		//solicitando posição
		System.out.println("Digite a posição desejada: ");
		System.out.println("Fileira: ");
		int fileira = scn.nextInt();
		System.out.println("Poltrona: ");
		int poltrona = scn.nextInt();
		//Marcando o acento
		acentos[fileira-1][poltrona-1] = 'X';
		//mostrando os acentos
		for (int linha = 0; linha < 9; linha++) {
			for (int coluna = 0; coluna <9; coluna++) {
				System.out.print(acentos[linha][coluna] + " ");
				
			}
			System.out.println();
		}
		scn.close();
	}

}
