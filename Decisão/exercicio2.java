package Decis�o;

import java.util.Scanner;

public class exercicio2 {
	
	/* Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente. */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();

		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();

		System.out.println("Digite o terceiro n�mero");
		n3 = leia.nextInt();

		System.out.println();

		if (n1 > n2 && n2 > n3) {
			System.out.println("A ordem crescente �: " + n3 + " , " + n2 + " , " + n1);

		}
		if (n2 > n1 && n1 > n3) {
			System.out.println("A ordem crescente �: " + n3 + " , " + n1 + " , " + n2);

		}
		if (n3 > n1 && n1 > n2) {
			System.out.println("A ordem crescente �: " + n2 + " , " + n1 + " , " + n3);
		}
		if (n1 > n3 && n3 > n2) {
			System.out.println("A ordem crescente �: " + n2 + " , " + n3 + " , " + n1);

		}
		if (n2 > n3 && n3 > n1) {
			System.out.println("A ordem crescente �: " + n1 + " , " + n3 + " , " + n2);

		}
		if (n3 > n2 && n2 > n1) {
			System.out.println("A ordem crescente �: " + n1 + " , " + n2 + " , " + n3);

		}
		leia.close();

	}

}
