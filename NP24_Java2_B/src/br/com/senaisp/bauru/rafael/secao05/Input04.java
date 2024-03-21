package br.com.senaisp.bauru.rafael.secao05;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        System.out.println(sc.nextLine());
        sc.nextLine();//terceira linha
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper")); //estou na quarta linha
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        int xPosition, yPosition;
        xPosition = sc.nextInt();
        yPosition = sc.nextInt();
        
        System.out.println("X: " + xPosition +", Y: " + yPosition);
        sc.close();
    }    
}
