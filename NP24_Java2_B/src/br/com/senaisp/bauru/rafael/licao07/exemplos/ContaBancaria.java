package br.com.senaisp.bauru.rafael.licao07.exemplos;

public class ContaBancaria {
	//FIelds estaticos
	private static int ultNumero = 0;
	//Fields
	private int agencia, banco, numeroConta;
	private double saldo;
	//Construtor
	public ContaBancaria() {
		banco = 123;
		agencia = 1;
		numeroConta = ++ultNumero;
		saldo = 50;
	}
	public ContaBancaria(int ba, int ag, int nc, double sal) {
		setBanco(ba);
		setAgencia(ag);
		setNumeroConta(nc);
		setSaldo(sal);
	}
	//Metodos
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getBanco() {
		return banco;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
