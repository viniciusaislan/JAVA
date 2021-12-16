package POO;

public class Avião {
	
		// Atributos - variaveis
		private String marca;
		private int quantidadeP;
		private String modelo;
		private int velocidade;
		private String cor;

		// métodos -> verbo

		void Checkoutok() {
			System.out.println("Avião apto a voo");

		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public int getQuantidadeP() {
			return quantidadeP;
		}

		public void setQuantidadeP(int quantidadeP) {
			this.quantidadeP = quantidadeP;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getVelocidade() {
			return velocidade;
		}

		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		void Checkoutnotok() {
			System.out.println("Avião não está apto  a voo");
		}

}
