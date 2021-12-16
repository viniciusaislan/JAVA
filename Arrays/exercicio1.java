package Arrays;

import java.util.Scanner;

public class exercicio1 {
	
	/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	 * atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double[] valores = new double[5];
		double maiorP = 0.0;
		int l;

		for (l = 0; l < valores.length; l++) {

			System.out.println("Digite a pontuação: ");
			valores[l] = entrada.nextDouble();

			if (maiorP < valores[l]) {
				maiorP = valores[l];
			}

		}
		System.out.println("A Maior pontuação é: " + maiorP);
		entrada.close();

	}

}
