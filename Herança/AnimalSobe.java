package Heran�a;

public class AnimalSobe extends Animal {
	
		// ATRIBUTOS
		boolean sobeArvore;

		void sobeEmArvores() {
			if (sobeArvore == true) {
				System.out.println("Este animal sobe em �rvores.");
			}

		}

		public boolean isSobeArvore() {
			return sobeArvore;
		}

		public void setSobeArvore(boolean sobeArvore) {
			this.sobeArvore = sobeArvore;
		}

}
