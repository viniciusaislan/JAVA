package Decis�o;

import java.util.Scanner;

public class exercicio4 {
	
	/* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	 * �mpar exiba o n�mero elevado ao quadrado.
	 */


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int n, r, p;

		System.out.println("Digite o n�mero: ");
		n = leia.nextInt();

		if (n % 2 == 0) {
			r = (int) Math.sqrt(n);
			System.out.println("Este n�mero � par e sua raiz quadrada � : " + r);

		} else {
			p = (int) Math.pow(n, 2.0);
			System.out.println("Este n�mero � impar e sua pot�ncia �: " + p);

		}
		leia.close();

	}

}
