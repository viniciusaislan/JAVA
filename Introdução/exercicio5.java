package Introdu��o;

import java.util.Scanner;

public class exercicio5 {
	
	/* Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste 
	 * aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, 
	 * respectivamente.
	 */

	public static void main(String[] args) {
		float n1, n2, n3, media;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		n1=calc.nextFloat();
		System.out.print("Digite a segunda nota: ");
		n2=calc.nextFloat();
		System.out.print("Digite a terceira nota: ");
		n3=calc.nextFloat();
		n1*=2;
		n2*=3;
		n3*=5;
		media=(n1+n2+n3)/10;
		System.out.printf("A m�dia �: %f",media);

	}

}
