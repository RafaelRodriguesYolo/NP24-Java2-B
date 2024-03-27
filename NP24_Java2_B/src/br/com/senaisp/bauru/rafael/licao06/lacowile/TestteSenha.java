package br.com.senaisp.bauru.rafael.licao06.lacowile;

import java.util.Scanner;

public class TestteSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha, tentativas = 0;
		final int PASSWORD = 1597;
		do {
			System.out.println("Digite a sua senha: ");
			senha = sc.nextInt();
			if (senha != PASSWORD) {
				System.out.println("Senha inválida! Redigite.");
				tentativas++;
			}
		}while(senha != PASSWORD && tentativas < 3);
		if (tentativas < 3) {
			System.out.println("Acesso Permitido!");
		}else {
			System.out.println("Acesso Bloqueado!");
		}
		sc.close();
	}

}
