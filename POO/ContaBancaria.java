package POO;

public class ContaBancaria {
	
		// Atributos - variaveis

		private String nome;
		private int senha;
		private String agencia;
		private int contaC;
		private int cpf;

		void liberar() {
			System.out.println("Você precisa liberar o acesso ao aplicativo pelo caixa eletronico!");
			System.out.println("Aguardamos seu retorno");

		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getSenha() {
			return senha;
		}

		public void setSenha(int senha) {
			this.senha = senha;
		}

		public String getAgencia() {
			return agencia;
		}

		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}

		public int getContaC() {
			return contaC;
		}

		public void setContaC(int contaC) {
			this.contaC = contaC;
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

}
