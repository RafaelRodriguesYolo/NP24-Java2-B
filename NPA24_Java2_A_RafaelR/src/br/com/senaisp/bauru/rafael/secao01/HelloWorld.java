package br.com.senaisp.bauru.rafael.secao01;

public class HelloWorld {

	public static void main(String[] args) {
		//System.out.println("Hello World guys!");
		int [] arr = {5, 4, 2, 1, 0};
		for (int i = 1; i < arr.length; i++)
		{
		arr[i - 1] += arr[i];
		System.out.println(arr[i]);
		}

	}

}
