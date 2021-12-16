package Decisão;

import java.util.Scanner;

public class exercicio1 {
	
	/* Faça um programa que receba três inteiros e diga qual deles é o maior. */


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor1, valor2, valor3, valorM = 0;
		
		System.out.println("Digite o número 1: ");
		valor1 = leia.nextInt();
		
		System.out.println("Digite o número 2: ");
		valor2 = leia.nextInt();
		
		System.out.println("Digite o número 3:");
		valor3 = leia.nextInt();
		
		if(valor1 > valorM) {
			valorM = valor1;
			
		}
		if(valor2 > valorM) {
			valorM = valor2;
			
		}if(valor3 > valorM) {
			valorM = valor3;
		}
		System.out.println("O valor maior é: " + valorM);
		
		leia.close();

	}

}
