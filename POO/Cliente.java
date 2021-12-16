package POO;

public class Cliente {
	
		// Atributos - variaveis
		private String nome;
		private int idade;
		private String sexo;

		// métodos -> verbo

		void comprando() {
			System.out.println("Cliente Comprou, Graças a Deus");
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		void olhando() {
			System.out.println("Cliente só dando uma olhadinha");
		}

}
