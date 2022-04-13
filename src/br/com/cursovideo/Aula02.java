package br.com.cursovideo;

public class Aula02 {
	public static void main(String[] args) {
		//Criando objetos
		
		Aula02Caneta c1 = new Aula02Caneta();
		c1.cor = "azul";
		c1.ponta = (float)0.5;
		//c1.tampada = true;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		System.out.println("\n");
		
		Aula02Caneta c2 = new Aula02Caneta();
		c2.cor = "vermelha";
		c2.ponta = (float)0.7;
		//c2.tampada = false;
		c2.destampar();
		c2.status();
		c2.rabiscar();
	
	}
}
