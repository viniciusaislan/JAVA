package Arrays;

import java.util.Scanner;

public class exercicio1 {
	
	/* Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
	 * atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double[] valores = new double[5];
		double maiorP = 0.0;
		int l;

		for (l = 0; l < valores.length; l++) {

			System.out.println("Digite a pontua��o: ");
			valores[l] = entrada.nextDouble();

			if (maiorP < valores[l]) {
				maiorP = valores[l];
			}

		}
		System.out.println("A Maior pontua��o �: " + maiorP);
		entrada.close();

	}

}
