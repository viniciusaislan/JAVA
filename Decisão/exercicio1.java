package Decis�o;

import java.util.Scanner;

public class exercicio1 {
	
	/* Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. */


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor1, valor2, valor3, valorM = 0;
		
		System.out.println("Digite o n�mero 1: ");
		valor1 = leia.nextInt();
		
		System.out.println("Digite o n�mero 2: ");
		valor2 = leia.nextInt();
		
		System.out.println("Digite o n�mero 3:");
		valor3 = leia.nextInt();
		
		if(valor1 > valorM) {
			valorM = valor1;
			
		}
		if(valor2 > valorM) {
			valorM = valor2;
			
		}if(valor3 > valorM) {
			valorM = valor3;
		}
		System.out.println("O valor maior �: " + valorM);
		
		leia.close();

	}

}
