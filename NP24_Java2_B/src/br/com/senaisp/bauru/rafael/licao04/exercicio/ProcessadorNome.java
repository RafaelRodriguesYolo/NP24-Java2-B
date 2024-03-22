package br.com.senaisp.bauru.rafael.licao04.exercicio;

public class ProcessadorNome {
	public String processarNome(String nome) {
//		Pegando o sobrenome
		String sbnome = nome.substring(nome.lastIndexOf(' ')+1);
		String iniNome = "" + nome.charAt(0)+".";
		return sbnome + ", " +iniNome; 
	}
}
