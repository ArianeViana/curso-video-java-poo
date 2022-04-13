package br.com.cursovideo;

public class Aula03Caneta {
		//Definindo visibilidade dos atributos e dos m�todos
		// Essas visibilidades foram escolhidas ao acaso, ainda n�o tem motivo atrelado
		// a elas
		public String modelo;
		public String cor;
		private float ponta;
		protected int carga;
		private boolean tampada;

		public void status() {
			System.out.println("A cor da caneta �: " + this.cor);
			System.out.println("Ela � ponta: " + this.ponta);
			System.out.println("Ela est� tampada? " + this.tampada);
			System.out.println("Qual � o modelo? " + this.modelo);
			System.out.println("Quanto ela tem de carga? " + this.carga);
			System.out.println("Rabisque!");
		}

		public void rabiscar() {
			if (this.tampada == true) {
				System.out.println("Erro! n�o posso rabiscar.");
			}
			if (this.tampada == false) {
				System.out.println("Estou rabiscando.");
			}
		}

		protected void tampar() {
			this.tampada = true;
		}

		protected void destampar() {
			this.tampada = false;
		}
}
