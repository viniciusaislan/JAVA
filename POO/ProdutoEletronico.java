package POO;

public class ProdutoEletronico {
	
		// Produto eletronico escolhido "Notebook"

		// Atributos - variaveis

		private String marca;
		private String serie;
		private String processador;
		private double tamanhodatela;
		private String cor;
		private double preco;

		// métodos -> verbo

		void compra() {
			System.out.println("Sem dinheiro no cartão, vá trabalhar! ");

		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getSerie() {
			return serie;
		}

		public void setSerie(String serie) {
			this.serie = serie;
		}

		public String getProcessador() {
			return processador;
		}

		public void setProcessador(String processador) {
			this.processador = processador;
		}

		public double getTamanhodatela() {
			return tamanhodatela;
		}

		public void setTamanhodatela(double tamanhodatela) {
			this.tamanhodatela = tamanhodatela;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

}
