package br.com.senaisp.bauru.rafael.secao05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PraticaPerguntasGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		/*
		 * Criar variaveis de entradas
		 * Variaveis Strings: nome, cor, animal, num010 e hobby
		 * Variaveis int: idade, resultadoI
		 * Variaveis double: altura, dinheiro, resultadoD
		 */
		boolean resp = JOptionPane.showConfirmDialog(null,
				"Olá gostaria de conhecer você melhor, vamos conversar?", "Se conhecendo",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE)
				== JOptionPane.YES_OPTION;
		String nome = JOptionPane.showInputDialog(null,
				"Qual é o seu nome?","Hum...", JOptionPane.QUESTION_MESSAGE);
		String hobby = JOptionPane.showInputDialog(null,
				"Prazer em conhecer você " + nome + "! Qual é o seu hobby?", "Curioso", 
				JOptionPane.QUESTION_MESSAGE);
		int idade = Integer.parseInt(JOptionPane.showInputDialog(
				"Que legal, eu também tenho um Hobby. Que é fazer perguntas aletórias! ^^\n Qual a sua idade?"));
		//int num010 = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um numero de 0 - 10."));
		String[] num010 = {"0","1","2","3","4","5","6","7","8","9","10"};
		String numero = (String)JOptionPane.showInputDialog(null,
				"Escolha um numero!", "...",
				JOptionPane.QUESTION_MESSAGE, null,
				num010, 
				num010[1]);
		int resultadoI = idade - Integer.parseInt(numero);
		String cor = JOptionPane.showInputDialog(null,
				"Qual é a sua cor preferida?","Compreendendo",
				JOptionPane.QUESTION_MESSAGE);
		String animal = JOptionPane.showInputDialog(null,
				"Que interessante. \nQuando digo um animal, qual você imagina?","Hum...",
				JOptionPane.QUESTION_MESSAGE);
		
		
		
		
	}

}
