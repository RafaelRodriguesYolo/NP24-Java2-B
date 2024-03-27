package br.com.senaisp.bauru.rafael.licao04.exercicio;

public class Exercicio01 {

	public static void main(String[] args) {
		MetodosCalculo mc = new MetodosCalculo();
		double tempC = mc.converterF2C(60.5);
		System.out.println("Temperatura °C " + tempC);
//		Calculando a hipotenusa
		double hip = mc.calcularHipoteusa(15, 10);
		System.out.println("A hipotenusa é " + hip);
//		Sorteando os valores
		System.out.println("Valor dos dados foi " + mc.jogarDados());
		
		char ch ='c';
		   switch(ch) {
		     case 'a':
		     case 'e':
		     case 'i':
		     case 'o':
		     case 'u':
		       System.out.println("Vogais");
		       break;
		     default:
		       System.out.println("Consoantes");
		   }
	}

}
