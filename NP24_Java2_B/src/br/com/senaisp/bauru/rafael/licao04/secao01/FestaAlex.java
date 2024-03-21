package br.com.senaisp.bauru.rafael.licao04.secao01;

public class FestaAlex {
	//constante
	final static double IMPOSTO = 0.05, GORJETA = 0.15;
	
	public static double calcularConta(double valor) {
		return valor *(1 + IMPOSTO) * (1 + GORJETA);
	}
	public static void main(String[] args) {
		double p1 = 10, p2 = 12, p3 = 9, p4 = 8, p5 = 7, p6 = 15, p7 = 11, p8 = 30;
		/*
		For (int i=1; i<8; i++){
			double total[i] = calcularConta(p)
		}
		*/
		double total1 = calcularConta(p1);
		double total2 = calcularConta(p2);
		double total3 = calcularConta(p3);
		double total4 = calcularConta(p4);
		double total5 = calcularConta(p5);
		double total6 = calcularConta(p6);
		double total7 = calcularConta(p7);
		double total8 = calcularConta(p8);
		
		System.out.println("Pessoa 1 Pagou: R$" + total1
				+ "\nPessoa 2 Pagou: R$" + total2
				+ "\nPessoa 3 Pagou R$" + total3
				+ "\nPessoa 4 Pagou R$" + total4
				+ "\nPessoa 5 Pagou R$" + total5
				+ "\nPessoa 6 Pagou R$" + total6
				+ "\nPessoa 7 Pagou R$" + total7
				+ "\nPessoa 8 Pagou R$" + total8);
		
	}

}
