package POO;

import java.util.Scanner;

public class testa_Cliente {
	
	/* Crie uma classe cliente e apresente os atributos e métodos referentes
	 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
	 * objeto e apresente as informações deste objeto no console.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// instanciando(Criando) o objeto de cliente

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		cliente1.setNome("jorema");
		cliente1.setSexo("feminino");
		cliente1.setIdade(22);

		cliente2.setNome("Josival");
		cliente2.setSexo("masculino");
		cliente2.setIdade(33);

		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getSexo());
		System.out.println(cliente1.getIdade());
		cliente1.comprando();

		System.out.println();

		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getSexo());
		System.out.println(cliente2.getIdade());
		cliente2.olhando();

		scan.close();

	}

}
