package POO;

import java.util.Scanner;

public class testa_Paciente {
	
	/* Crie uma classe paciente e apresente os atributos e métodos referentes
	 * esta classe, em seguida crie um objeto paciente, defina as instancias deste
	 * objeto e apresente as informações deste objeto no console.
	 */

	public static void main(String[] args) {
		
		int codigo;

		// Scanner para ler as variaveis

		Scanner scan = new Scanner(System.in);

		// instanciando(Criando) o objeto de cliente

		Paciente paciente1 = new Paciente();
		Paciente paciente2 = new Paciente();

		paciente1.setNome("Jorge Aragao");
		paciente1.setSexo("Masculino");
		paciente1.setIdade(23);

		paciente2.setNome("Mariana Dicamargo");
		paciente2.setSexo("Feminino");
		paciente2.setIdade(21);

		for (int i = 0; i <= 2; i++) {

			System.out.println("=================================");
			System.out.println("=      Central de pacientes     =");
			System.out.println("=================================");
			System.out.println("=  Digite o código do paciente  =");
			codigo = scan.nextInt();
			System.out.println();

			if (codigo == 2323) {

				System.out.println("Nome do paciente: " + paciente1.getNome());
				System.out.println("Sexo: " + paciente1.getSexo());
				System.out.println("Idade: " + paciente1.getIdade());
				paciente1.doenca1();
				System.out.println("Paciente se encontra na ala 3, sala 4!");
				break;

			} else if (codigo == 4242) {

				System.out.println("Nome do paciente: " + paciente2.getNome());
				System.out.println("Sexo: " + paciente2.getSexo());
				System.out.println("Idade: " + paciente2.getIdade());
				paciente2.doenca2();
				System.out.println("Paciente se encontra na ala 2, sala 2! ");
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
