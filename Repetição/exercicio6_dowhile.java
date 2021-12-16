package Repetição;

import java.util.Scanner;

public class exercicio6_dowhile {
	
	/* Escrever um programa que receba vários números inteiros no teclado. E no final
	 * imprimir a média dos números múltiplos de 3. Para sair digitar
	 * 0(zero).(DO...WHILE)
	 */


	public static void main(String[] args) {
		int n,media=0,soma=0,cont=0;
		do {
			Scanner cal = new Scanner(System.in);
			System.out.print("Digite um número: ");
			n=cal.nextInt();
			if(n%3==0)
			{
				soma+=n;
				cont++;
			}
		}while(n!=0);
		media=soma/cont;
		System.out.println("A média dos valores multiplos de 3 é "+media);

	}

}
