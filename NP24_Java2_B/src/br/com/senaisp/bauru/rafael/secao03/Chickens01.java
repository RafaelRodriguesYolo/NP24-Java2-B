package br.com.senaisp.bauru.rafael.secao03;

public class Chickens01 {
    public static void main(String[] args) {
    	//Put yout code here - Cenário 1
        //int ovoPorGalinha = 5, galinhas = 3, totalOvo = 0;
        //Put yout code here - Cenário 2
        int ovoPorGalinha = 4, galinhas = 8, totalOvo = 0;
        //Na segunda-feira Mr. Brown recolheos ovos;
        totalOvo += ovoPorGalinha * galinhas++;
        //Na terça-feira, Mr. Brown ganha uma galinha pela manhã;
        //galinhas++;
        totalOvo += ovoPorGalinha * galinhas;
        //Na quarta-feira pela manhã, um animal come metade das galinhas;
        galinhas /= 2;
        totalOvo += ovoPorGalinha * galinhas;
        System.out.println(totalOvo);
    }   
}
