package Introdu��o;

import java.util.Scanner;

public class exercicio1 {
	
	/* Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e 
	 * dias e mostre-a expressa apenas em dias.
	 */

	public static void main(String[] args) {
		byte anos, meses, dias;
		int total;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite quantos anos voc� tem: ");
		anos=calc.nextByte();
		System.out.print("Digite quantos meses voc� tem: ");
		meses=calc.nextByte();
		System.out.print("Digite quantos dias voc� tem: ");
		dias=calc.nextByte();
		total=anos*365+meses*30+dias;
		System.out.println("Voc� tem "+total+" dias de nascido");
		calc.close();

	}

}
