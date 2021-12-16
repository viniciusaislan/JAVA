package Introdução;

import java.util.Scanner;

public class exercicio7 {
	
	/* Um sistema de equações lineares do tipo: 
	 * ax + by = c e dx + ey = f, pode ser resolvido segundo mostrado abaixo:
	 * x = (ce - bf) / (ae - bd) e y = (af - cd) / (ae - bd)
	 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
	 * valores de x e y.
	 */

	public static void main(String[] args) {
		float a,b,c,d,e,f,x,y;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite os valores de A, B, C, D, E e F: ");
		a=calc.nextFloat();
		b=calc.nextFloat();
		c=calc.nextFloat();
		d=calc.nextFloat();
		e=calc.nextFloat();
		f=calc.nextFloat();
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		System.out.println(x);
		System.out.println(y);

	}

}
