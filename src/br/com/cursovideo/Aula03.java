package br.com.cursovideo;

public class Aula03 {

	public static void main(String[] args) {
		Aula03Caneta c1 = new Aula03Caneta();
		c1.modelo = "BIC Cristal";
		c1.cor = "azul";
		//a linha abaixo n�o ir� rodar pq na classe 'Caneta' o atributo 'ponta' est� definido como privado
		//c1.ponta = (float) 0.5; 
		
		//o atributo 'carga' � protegido por�m roda porque o m�todo main est� dentro de uma classe (Aula03) que est� 
		//utilizando a classe 'caneta' 
		c1.carga = 80;
		
		//c1.tampada = false; 
		//como o atributo 'tampada' � privado podemos usar o m�todo 'tampar/destampar', que s�o p�blicos, para definir 
		//se a caneta est� tampada ou destampada
		c1.destampar();
		c1.status();	
		c1.rabiscar();

	}

}
