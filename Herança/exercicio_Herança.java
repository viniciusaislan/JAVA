package Heran�a;

public class exercicio_Heran�a {

	public static void main(String[] args) {

		// CACHORRO
		AnimalCorre cachorro = new AnimalCorre();
		cachorro.setNome("Lola");
		cachorro.setIdade(4);
		cachorro.setSom(true);
		cachorro.setCorre(true);
		System.out.println("CACHORRO");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade());
		cachorro.corre();
		cachorro.emitesom();

		System.out.println("\n");

		// CAVALO
		AnimalCorre cavalo = new AnimalCorre();
		cavalo.setNome("Juca");
		cavalo.setIdade(10);
		cavalo.setSom(true);
		cavalo.setCorre(true);
		System.out.println("CAVALO");
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		cavalo.corre();
		cavalo.emitesom();

		System.out.println("\n");

		// PREGUI�A
		AnimalSobe pregui�a = new AnimalSobe();
		pregui�a.setNome("Joana");
		pregui�a.setIdade(5);
		pregui�a.setSom(true);
		pregui�a.setSobeArvore(true);
		System.out.println("PREGUI�A");
		System.out.println("Nome: " + pregui�a.getNome());
		System.out.println("Idade: " + pregui�a.getIdade());
		pregui�a.sobeEmArvores();
		pregui�a.emitesom();

		System.out.println("\n");

	}

}
