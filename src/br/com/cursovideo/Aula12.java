package br.com.cursovideo;

//polimorfismo de sobreposição
//para ocorrer a sobreposição o método tem que ter mesma assinatura em classes diferentes

public class Aula12 {

	public static void main(String[] args) {
		Aula12Mamifero m = new Aula12Mamifero();
		Aula12Reptil r = new Aula12Reptil();
		Aula12Peixe p = new Aula12Peixe();
		Aula12Ave a = new Aula12Ave();
		
		m.setPeso(35.2f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		a.alimentar();
		
		p.locomover();
		
		r.alimentar();
		
		
		Aula12Canguru c = new Aula12Canguru();
		Aula12Cachorro ca = new Aula12Cachorro();
		
		c.locomover();
		c.emitirSom();
		
		ca.locomover();
		ca.emitirSom();
		
		
	}

}
