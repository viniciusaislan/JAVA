package Heran�a;

public class AnimalCorre extends Animal {
	
		// ATRIBUTOS
		boolean corre;

		void corre() {
			if (corre == true) {
				System.out.println("Este animal corre.");
			}

		}

		public boolean isCorre() {
			return corre;
		}

		public void setCorre(boolean corre) {
			this.corre = corre;
		}

}
