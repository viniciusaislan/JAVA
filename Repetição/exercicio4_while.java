package Repeti��o;

import java.util.Scanner;

public class exercicio4_while {
	
	/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
	 * psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
	 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
	 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	 * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	 * pessoas, calcule e mostre: (WHILE)
	 * o n�mero de pessoas calmas; 
	 * o n�mero de mulheres nervosas; 
	 * o n�mero de homens agressivos; 
	 * o n�mero de outros calmos;
	 * o n�mero de pessoas nervosas com mais de 40 anos; 
	 * o n�mero de pessoas calmas com menos de 18 anos.
	 */


	public static void main(String[] args) {
		int idade=0, sexo, sentir, fn=0, oc=0, pc=0, ha=0,cont=0,jc=0, vn=0;
		Scanner ler = new Scanner(System.in);
		while(cont<15)
		{
			System.out.println("Digite sua idade: ");
			idade=ler.nextInt();
			System.out.println("Qual seu sexo?\n1-feminino\n2-masculino\n3-outros: ");
			sexo=ler.nextInt();
			System.out.println("Escolha a op��o que melhor representa como voc� esta se sentindo");
			System.out.println("1-calmo\n2-nervoso\n3-agressivo");
			sentir=ler.nextInt();
			
			if(sentir==1)
				pc++;
			if(sexo==1 && sentir==2)
				fn++;
			if(sexo==2 && sentir==3)
				ha++;
			if(sexo==3 && sentir==1)
				oc++;
			if(idade>40 && sentir==2)
				vn++;
			if(idade<18 && sentir==1)
				jc++;
			
			cont++;
		}
		System.out.println("O n�mero de pessoas calmas � "+pc);
		System.out.println("O n�mero de mulheres nervosas � "+ fn);
		System.out.println("O n�mero de homens agressivos � "+ ha);
		System.out.println("O n�mero de outros calmos � "+ oc);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos � "+vn);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos � "+ jc);

	}

}
