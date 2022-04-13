package br.com.cursovideo;

public class Aula03Caneta {
		//Definindo visibilidade dos atributos e dos métodos
		// Essas visibilidades foram escolhidas ao acaso, ainda não tem motivo atrelado
		// a elas
		public String modelo;
		public String cor;
		private float ponta;
		protected int carga;
		private boolean tampada;

		public void status() {
			System.out.println("A cor da caneta é: " + this.cor);
			System.out.println("Ela é ponta: " + this.ponta);
			System.out.println("Ela está tampada? " + this.tampada);
			System.out.println("Qual é o modelo? " + this.modelo);
			System.out.println("Quanto ela tem de carga? " + this.carga);
			System.out.println("Rabisque!");
		}

		public void rabiscar() {
			if (this.tampada == true) {
				System.out.println("Erro! não posso rabiscar.");
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
