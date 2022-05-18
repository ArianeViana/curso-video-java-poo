package br.com.cursovideo;

public class Aula15Visualizacao {
	private Aula14Gafanhoto espectador;
	private Aula14Video filme;	
	
	
	public Aula15Visualizacao(Aula14Gafanhoto espectador, Aula14Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}


	public Aula14Gafanhoto getEspectador() {
		return espectador;
	}


	public void setEspectador(Aula14Gafanhoto espectador) {
		this.espectador = espectador;
	}


	public Aula14Video getFilme() {
		return filme;
	}


	public void setFilme(Aula14Video filme) {
		this.filme = filme;
	}
	

	@Override
	public String toString() {
		return "Aula15Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}


	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {
		int tot = 0;
		if(porc <= 20.0) {
			tot = 3;
		}else if(porc <=50.0) {
			tot = 5;
		}else if(porc <= 90.0) {
			tot = 8;
		}else{
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
	}
}
