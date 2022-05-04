package br.com.cursovideo;

//polimorfismo de sobrecarga
//para ocorrer a sobrecarga o método deve ter assinaturas diferentes e estão na mesma classe

public class Aula13 {

	public static void main(String[] args) {
		Aula13Cachorro c = new Aula13Cachorro();
		
		c.reagir("olá");
		c.reagir(false);
		c.reagir(4, 5);
		c.reagir(18, 8);
		
	}

}
