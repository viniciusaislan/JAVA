package Arrays;

import java.util.Scanner;

public class exercicio2 {
	
	/* Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
	 * que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
	 * imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
	 * quantas foram as ocorr�ncias da maior pontua��o.
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double[] dado = new double[10];
		double maiorP = 0.0, ocorrenciaMaiorP = 0.0, media = 0.0, somalanc = 0.0;
		int l;

		for (l = 0; l < dado.length; l++) {
			System.out.println("Digita o " + (l + 1) + "� Lan�amento do dado: ");
			dado[l] = entrada.nextDouble();

			somalanc += dado[l];

			if (maiorP < dado[l]) {
				maiorP = dado[l];

			}
			media = somalanc / dado.length;

		}
		System.out.println("\nA m�dia aritm�tica dos lan�amentos �: " + media + "\n");
		for (l = 0; l < dado.length; l++) {
			if (dado[l] == maiorP) {

				ocorrenciaMaiorP++;
			}
			System.out.println("Lan�amento do " + (l + 1) + "� dado: " + dado[l]);

		}
		System.out.println("\nA maior pontua��o do dado apareceu: " + ocorrenciaMaiorP);

		entrada.close();

	}

}
