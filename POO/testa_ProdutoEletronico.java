package POO;

import java.util.Scanner;

public class testa_ProdutoEletronico {
	
	/* Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	 * referentes esta classe, em seguida crie um objeto produto eletr�nico,
	 * defina as instancias deste objeto e apresente as informa��es deste objeto
	 * no console.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Scanner para ler as variaveis

		// instanciando(Criando) o objeto de cliente

		ProdutoEletronico notebook1 = new ProdutoEletronico();

		notebook1.setMarca("Lenovo");
		notebook1.setSerie("Legion 5i");
		notebook1.setProcessador("Corei7-10750H");
		notebook1.setTamanhodatela(15.6);
		notebook1.setCor("Phantom Black");
		notebook1.setPreco(8.499);

		System.out.println("A marca do notebook �: " + notebook1.getMarca());
		System.out.println("O notebook � de s�rie: " + notebook1.getSerie());
		System.out.println("O processador �: " + notebook1.getProcessador());
		System.out.println("O tamanho da tela �: " + notebook1.getTamanhodatela() + " Polegadas ");
		System.out.println("Cor do notebook: " + notebook1.getCor());
		System.out.println("Pre�o do notebook � de: R$" + notebook1.getPreco());

		System.out.println();

		notebook1.compra();

		scan.close();

	}

}
