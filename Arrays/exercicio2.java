package Arrays;

import java.util.Scanner;

public class exercicio2 {
	
	/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	 * que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	 * imprima a média aritmética dos lançamentos, contabilize e apresente também
	 * quantas foram as ocorrências da maior pontuação.
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double[] dado = new double[10];
		double maiorP = 0.0, ocorrenciaMaiorP = 0.0, media = 0.0, somalanc = 0.0;
		int l;

		for (l = 0; l < dado.length; l++) {
			System.out.println("Digita o " + (l + 1) + "º Lançamento do dado: ");
			dado[l] = entrada.nextDouble();

			somalanc += dado[l];

			if (maiorP < dado[l]) {
				maiorP = dado[l];

			}
			media = somalanc / dado.length;

		}
		System.out.println("\nA média aritmética dos lançamentos é: " + media + "\n");
		for (l = 0; l < dado.length; l++) {
			if (dado[l] == maiorP) {

				ocorrenciaMaiorP++;
			}
			System.out.println("Lançamento do " + (l + 1) + "º dado: " + dado[l]);

		}
		System.out.println("\nA maior pontuação do dado apareceu: " + ocorrenciaMaiorP);

		entrada.close();

	}

}
