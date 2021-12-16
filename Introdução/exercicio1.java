package Introdução;

import java.util.Scanner;

public class exercicio1 {
	
	/* Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e 
	 * dias e mostre-a expressa apenas em dias.
	 */

	public static void main(String[] args) {
		byte anos, meses, dias;
		int total;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite quantos anos você tem: ");
		anos=calc.nextByte();
		System.out.print("Digite quantos meses você tem: ");
		meses=calc.nextByte();
		System.out.print("Digite quantos dias você tem: ");
		dias=calc.nextByte();
		total=anos*365+meses*30+dias;
		System.out.println("Você tem "+total+" dias de nascido");
		calc.close();

	}

}
