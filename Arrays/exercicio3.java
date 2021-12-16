package Arrays;

import java.util.Scanner;

public class exercicio3 {
	
	/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das
	 * matrizes N1 e N2;
	 * b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	 * posição das matrizes N1 e N2.
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double[][] n1 = new double[2][3];
		double[][] n2 = new double[2][3];
		double[][] m1 = new double[2][3];
		double[][] m2 = new double[2][3];
		int l, c;

		for (l = 0; l < n1.length; l++) {
			for (c = 0; c < n2.length; c++) {
				System.out.println("Digite os valores de n1: ");
				n1[l][c] = entrada.nextDouble();

				System.out.println("Digite os valores de n2: ");
				n2[l][c] = entrada.nextDouble();

				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];

			}

		}
		for (l = 0; l < m1.length; l++) {
			for (c = 0; c < m2.length; c++) {

				System.out.println("Matriz M1: " + m1[l][c]);
				System.out.println("Matriz M2: " + m2[l][c]);

			}

		}

	}

}
