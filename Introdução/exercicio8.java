package Introdu��o;

import java.util.Scanner;

public class exercicio8 {
	
	/* O custo ao consumidor de um carro novo � a soma do custo de f�brica com a 
	 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
	 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao 
	 * consumidor.
	 */

	public static void main(String[] args) {
		double cc,cf,dist,imp;
		Scanner calc = new Scanner(System.in);
		System.out.println("digite o custo de fabrica: ");
		cf=calc.nextDouble();
		dist=cf*0.28;
		imp=cf*0.45;
		cc=cf+dist+imp;
		System.out.println(cc);

	}

}
