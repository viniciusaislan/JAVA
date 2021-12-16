package Arrays;

import java.util.Scanner;

public class exercicio4 {
	
	/* Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	 * em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	 * diagonal, ou seja, diagonal principal.
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double[][] valor = new double[3][3];
		double somaV = 0, somaPrimeiraD = 0;
		int l, c;

		for (l = 0; l < valor.length; l++) {
			for (c = 0; c < valor[l].length; c++) {

				System.out.println("Digite o Valor das matrizes: ");
				valor[l][c] = entrada.nextDouble();

				somaV += valor[l][c];

			}

		}
		for (l = 0; l < valor.length; l++) {
			for (c = 0; c < valor[l].length; c++) {

				somaV += valor[l][c];

				somaPrimeiraD = valor[0][0] + valor[1][1] + valor[2][2];
			}
		}

		System.out.println("A soma dos valores da matriz é: " + somaV + "\n");
		System.out.println("A soma da primeira diagonal é: " + somaPrimeiraD + "\n");

		entrada.close();

	}

}
