package br.com.cursovideo;

//polimorfismo de sobrecarga
//para ocorrer a sobrecarga o m�todo deve ter assinaturas diferentes e est�o na mesma classe

public class Aula13 {

	public static void main(String[] args) {
		Aula13Cachorro c = new Aula13Cachorro();
		
		c.reagir("ol�");
		c.reagir(false);
		c.reagir(4, 5);
		c.reagir(18, 8);
		
	}

}
