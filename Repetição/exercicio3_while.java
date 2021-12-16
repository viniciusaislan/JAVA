package Repetição;

import java.util.Scanner;

public class exercicio3_while {
	
	/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	 * idade for =-99. (WHILE)
	 */


	public static void main(String[] args) {
		int idade, n=0, v=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade ou digite -99 para encerrar: ");
		idade=ler.nextInt();
		while(idade!=-99)
		{
			if(idade<21)
				n++;
			if(idade>50)
				v++;
			System.out.println("Digite sua idade ou digite -99 para encerrar: ");
			idade=ler.nextInt();
		}
		System.out.println("Foram digitadas "+n+" idades menores de 21 e "+v+" idades maiores de 50");

	}

}
