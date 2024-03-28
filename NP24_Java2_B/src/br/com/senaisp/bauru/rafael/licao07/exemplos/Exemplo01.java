package br.com.senaisp.bauru.rafael.licao07.exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		System.out.println("Nr. Conta: " + conta1.getNumeroConta());
		ContaBancaria conta4 = new ContaBancaria();
		System.out.println("Nr. Conta: " + conta4.getNumeroConta());
		
//		System.out.println(ContaBancaria.ultNumero);
//		conta1.setAgencia(1900);
//		conta1.setBanco(341);
		conta1.setNumeroConta(12345);
//		conta1.setSaldo(00.43);
		ContaBancaria conta2 = conta1;
		System.out.println(conta1.getSaldo());
		conta2.setSaldo(50);
		System.out.println(conta1.getSaldo());
		adicionarValor(conta1,100.00);
		System.out.println(conta1.getSaldo());
//		Conta passando valores no constructor
		ContaBancaria conta3 = new ContaBancaria(123, 2, 1478, 65);
		System.out.println(conta3.getSaldo());
	}

	private static void adicionarValor(ContaBancaria conta1, double d) {
		conta1.setSaldo(conta1.getSaldo() + d);
	}

}
