package Collections;

import java.util.*;

public class exemplo2 {

	public static void main(String[] args) {
		
		exemplo2_Aula a1 = new exemplo2_Aula("La�os",50);
		exemplo2_Aula a2 = new exemplo2_Aula("Heran�a",35);
		exemplo2_Aula a3 = new exemplo2_Aula("Polimorfismo",120);
		
		ArrayList<exemplo2_Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas);
	}

}