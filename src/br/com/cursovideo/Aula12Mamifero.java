package br.com.cursovideo;

public class Aula12Mamifero extends Aula12Animal {
	private String corPelo;
	
	@Override
	public void locomover() {
		System.out.println("correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("som de mamífero");
	}

	public String getCorPelo() {
		return this.corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	
}
