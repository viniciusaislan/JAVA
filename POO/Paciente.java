package POO;

public class Paciente {
	
		// Atributos - variaveis

		private String nome;
		private String sexo;
		private int idade;
		
		void doenca1 () {
			System.out.println("Causa do paciente: Acidente de Moto!");
		}
		void doenca2() {
			System.out.println("Causa do paciente: Covid 19");
			
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}

}
