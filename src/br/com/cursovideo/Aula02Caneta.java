package br.com.cursovideo;

public class Aula02Caneta {
	//Criando classes
	
		String modelo;
		String cor;
		float ponta;
		int carga;
		boolean tampada;
		
		void status() {
			System.out.println("A cor da caneta �: " + this.cor);
			System.out.println("Ela � ponta: " + this.ponta);
			System.out.println("Ela est� tampada? " + this.tampada);
			//System.out.println("Qual � o modelo? " + this.modelo);
			//System.out.println("Quanto ela tem de carga? " + this.carga);
			System.out.println("Rabisque!");
		}
		void rabiscar() {
			if(this.tampada == true) {
				System.out.println("Erro! n�o posso rabiscar.");
			}
			if(this.tampada == false) {
				System.out.println("Estou rabiscando.");
			}
		}
		
		void tampar() {
			this.tampada = true;
		}
		
		void destampar() {
			this.tampada = false;
		}
}
