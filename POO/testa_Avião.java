package POO;

import java.util.Scanner;

public class testa_Avião {
	
	/* Crie uma classe avião e apresente os atributos e métodos referentes
	 * esta classe, em seguida crie um objeto avião, defina as instancias deste
	 * objeto e apresente as informações deste objeto no console.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// instanciando(Criando) o objeto de cliente

		Avião aviao1 = new Avião();
		Avião aviao2 = new Avião();

		aviao1.setMarca("GOL");
		aviao1.setQuantidadeP(50);
		aviao1.setModelo("Boeing 737-300");
		aviao1.setVelocidade(320);
		aviao1.setCor("Branco");

		aviao2.setMarca("GOL");
		aviao2.setQuantidadeP(60);
		aviao2.setModelo("737-700");
		aviao2.setVelocidade(350);
		aviao2.setCor("Branco e laranja");

		System.out.println("A marca do avião: " + aviao1.getMarca());
		System.out.println("Quantidade de pessoas: " + aviao1.getQuantidadeP());
		System.out.println("Modelo do avião: " + aviao1.getModelo());
		System.out.println("Velocidade Máxima: " + aviao1.getVelocidade());
		System.out.println("Cor do avião: " + aviao1.getCor());
		aviao1.Checkoutnotok();

		System.out.println();

		System.out.println("A marca do avião: " + aviao2.getMarca());
		System.out.println("Quantidade de pessoas: " + aviao2.getQuantidadeP());
		System.out.println("Modelo do avião: " + aviao2.getModelo());
		System.out.println("Velocidade Máxima: " + aviao2.getVelocidade());
		System.out.println("Cor do avião: " + aviao2.getCor());
		aviao1.Checkoutok();

		scan.close();


	}

}
