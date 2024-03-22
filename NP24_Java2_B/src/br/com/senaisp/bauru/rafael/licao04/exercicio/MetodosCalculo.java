package br.com.senaisp.bauru.rafael.licao04.exercicio;

import java.util.Random;

public class MetodosCalculo {
	/**
	 * Metodo que calcula a temperatura de Celius para Fahrenheit
	 * @param temp informa a temperatura em °F
	 * @return Retorna a temperatura em °C
	 */
	public double converterF2C(double temp) {
		return (temp - 32) * 5 / 9;
	}
	/**
	 * Metodo que calcula a hipotenusa
	 * @param co Informar o cateto oposto
	 * @param ca Informar o cateto adjacente
	 * @return Retorna o valor da hipotenusa
	 */
	public double calcularHipoteusa(double co, double ca) {
		return Math.sqrt((co * co) + (ca * ca));
	}
	/**
	 * Metodo que joga dois dados de 6 faces
	 * @return Retorna o valor somado dos dois dados jogados
	 */
	public int jogarDados() {
		Random rnd = new Random();
		return rnd.nextInt(6)+1 + rnd.nextInt(6)+1;
	}
}