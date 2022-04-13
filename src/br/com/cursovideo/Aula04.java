package br.com.cursovideo;

public class Aula04 {

	public static void main(String[] args) {
		//Se for usar parâmetros
		//CanetaAula04 c1 = new CanetaAula04("Bic" , 0.7f); 
		
		Aula04Caneta c1 = new Aula04Caneta(); 
		//aqui modificamos diretamente o atributo
		//c1.modelo = "BIC";
		
		//aqui modificamos inderetamente o atributo
		c1.setModelo("BIC");
		c1.setPonta((float) 0.7);
		c1.status();
		
		System.out.println("\nTenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
	}

}
