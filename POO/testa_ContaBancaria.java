package POO;

import java.util.Scanner;

public class testa_ContaBancaria {
	
	/* Crie uma classe conta bancaria e apresente os atributos e m�todos
	 * referentes esta classe, em seguida crie um objeto conta bancaria, defina as
	 * instancias deste objeto e apresente as informa��es deste objeto no
	 * console.
	 */

	public static void main(String[] args) {
		
		int senha; // definindo variaveis dentro do la�o a serem preenchidas.
		int cpf;

		// Scanner para ler as variaveis

		Scanner scan = new Scanner(System.in);

		// instanciando(Criando) o objeto de cliente

		ContaBancaria cliente = new ContaBancaria();

		cliente.setNome("Lucas Falabella");
		cliente.setAgencia("0654");
		cliente.setContaC(012403337);

		for (int i = 0; i <= 2; i++) {

			System.out.println("=================================");
			System.out.println("=  Seja Bem Vindo ao seu Banco  =");
			System.out.println("=     Para Acessar Sua Conta    =");
			System.out.println("=================================");
			System.out.println("=        Digite Seu Cpf:        =");
			cpf = scan.nextInt();
			System.out.println("=       Digite sua Senha:       =");
			senha = scan.nextInt();

			if (cpf == 323323323 && senha == 1234) {
				
				System.out.println();
				System.out.println("Ol� " + cliente.getNome());
				System.out.println("Ag�ncia: " + cliente.getAgencia() + "  Conta Banc�ria: " + cliente.getContaC());
				System.out.println();

				cliente.liberar();
				break;

			} else if (i == 2) {

				System.out.println("Tentativas Excedidas");

			}

			else {
				System.out.println("Depois de 3 tentativas o programa encerra.");
				System.out.println("Tentativa: " + (i + 1));
				System.out.println();

			}

		}
		scan.close();

	}

}
