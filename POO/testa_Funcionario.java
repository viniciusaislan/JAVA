package POO;

import java.util.Scanner;

public class testa_Funcionario {
	
	/* Crie uma classe funcionário e apresente os atributos e métodos
	 * referentes esta classe, em seguida crie um objeto funcionário, defina as
	 * instancias deste objeto e apresente as informações deste objeto no
	 * console.
	 */

	public static void main(String[] args) {
		
		int senha;

		Scanner scan = new Scanner(System.in);

		// Scanner para ler as variaveis

		// instanciando(Criando) o objeto de cliente

		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();

		funcionario1.setNome("Bem vindo Juremildo Teixeira");
		funcionario1.setCodigo(777);

		funcionario2.setNome("Bem vinda Marilene Abravanel");
		funcionario2.setCodigo(666);

		for (int i = 0; i <= 3; i++) {

			System.out.println("=================================");
			System.out.println("=  Seja Bem Vindo A Generation  =");
			System.out.println("=      Para Bater O Ponto       =");
			System.out.println("=================================");
			System.out.println("=       Digite Sua Senha:       =");
			senha = scan.nextInt();
			System.out.println();

			if (senha == 1234) {

				System.out.println(funcionario1.getNome());
				System.out.println("Código: " + funcionario1.getCodigo());
				funcionario1.trabalhar1();
				System.out.println();
				break;

			} else if (senha == 5678) {

				System.out.println(funcionario2.getNome());
				System.out.println("Código: " + funcionario2.getCodigo());
				funcionario2.trabalho2();
				System.out.println();
				break;

			} else if (i == 3) {

				System.out.println("Programa Encerrado Devido exceder número de tentativas!");

			} else {
				funcionario1.errou();

			}

		}
		scan.close();

	}

}
