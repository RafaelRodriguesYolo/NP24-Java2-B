package br.com.senaisp.bauru.rafael.licao07.exercicio;

public class Cartao {
	private static int contador=0;
	
	private int numero, creditos, tickets;
	//Constructor
	public Cartao() {
		numero = ++contador;
		creditos = 0;
		tickets = 0;
	}
	
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return  "=".repeat(20)+"\n"+
				"Nr. Cartão: " + getNumero() + "\n" + "Saldo Créditos: " + getCreditos() + "\n" + 
				"Saldo TIckets: " + getTickets();
	}
}
