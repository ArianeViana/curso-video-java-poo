package br.com.cursovideo;

public class Aula14Video implements Aula14AcoesVideo {
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
		
	public Aula14Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (this.avaliacao + avaliacao)/this.views;
		this.avaliacao = nova;
	}

	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		this.reproduzindo = true;
		
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
		
	}

	@Override
	public void like() {
		this.curtidas ++;
		
	}

	@Override
	public String toString() {
		return "Aula14Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas="
				+ curtidas + ", reproduzindo=" + reproduzindo + "]";
	}
	
	
	
	
	
}
