package br.com.cursovideo;

public class Aula03 {

	public static void main(String[] args) {
		Aula03Caneta c1 = new Aula03Caneta();
		c1.modelo = "BIC Cristal";
		c1.cor = "azul";
		//a linha abaixo não irá rodar pq na classe 'Caneta' o atributo 'ponta' está definido como privado
		//c1.ponta = (float) 0.5; 
		
		//o atributo 'carga' é protegido porém roda porque o método main está dentro de uma classe (Aula03) que está 
		//utilizando a classe 'caneta' 
		c1.carga = 80;
		
		//c1.tampada = false; 
		//como o atributo 'tampada' é privado podemos usar o método 'tampar/destampar', que são públicos, para definir 
		//se a caneta está tampada ou destampada
		c1.destampar();
		c1.status();	
		c1.rabiscar();

	}

}
