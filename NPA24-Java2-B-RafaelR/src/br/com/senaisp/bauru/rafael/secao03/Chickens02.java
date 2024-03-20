package br.com.senaisp.bauru.rafael.secao03;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
    	//Definindo as variáveis
    	int totalEggs = 0;
    	double dailyAverage = 0, monthlyAverage = 0, monthlyProfit = 0;
    	//Na segunda-feira ele obtem 100 ovos.
    	totalEggs  += 100;
    	//Na terça-feira ele obtem 121 ovos.
    	totalEggs += 121;
    	//Na quarta-feira ele obtem 117 ovos.
    	totalEggs += 117;
    	//Fazendo as contas
    	dailyAverage = totalEggs / 3.0;
    	monthlyAverage = dailyAverage * 30;
    	monthlyProfit = monthlyAverage * 0.18;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
