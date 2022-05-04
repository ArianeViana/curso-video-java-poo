package br.com.cursovideo;

public class Aula12Peixe extends Aula12Animal {
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("peixe não faz som");		
	}
	
	public void soltarBolhha() {
		System.out.println("soltou uma bolha");
	}

	public String getCorEscama() {
		return this.corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
}
