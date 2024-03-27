package br.com.senaisp.bauru.rafael.licao06.lacofor;

public class Exemplo01 {
	public static void main(String[] args) {
		for (int i=0; i<=10; i++) {
			System.out.println("7 x " + i + " = " + (7*i));
		}
//	CONTAGEM REGRESSIVA
		for (int i=100; i>0; i--) {
			System.out.println(i);
		}
//		FOR SEM AS CHAVES
		for (int i=0; i<5; i++)
			System.out.println("linha do for!");
	
//		FOR INIFINITO/SEM PARAMETRO
		for (;;) {
			System.out.println("For infinito!");
		}
	}
}