package br.com.cursovideo;

public class Aula09Livro implements Aula09Publicacao {
	
	private String titulo;
	private String autor;
	private int totPagina;
	private int pagAtual;
	private boolean aberto;
	private Aula09Pessoa leitor;
	
	
	
	public String detalhe() {
		return "Aula09Livro \n[titulo =" + titulo + "\nautor =" + autor + "\ntotPagina=" + totPagina + "\npagAtual="
				+ pagAtual + "\naberto=" + aberto + "\nleitor=" + leitor.getNome() + "]";
	}


	public Aula09Livro(String t, String a, int tp, Aula09Pessoa l) {
		this.setTitulo(t);
		this.setAutor(a);
		this.setTotPagina(tp);
		this.setLeitor(l);
		this.setAberto(false);
		this.setPagAtual(0);
	}


	public String getTitulo() {
		return this.titulo;
	}


	public void setTitulo(String t) {
		this.titulo = t;
	}


	public String getAutor() {
		return this.autor;
	}


	public void setAutor(String a) {
		this.autor = a;
	}


	public int getTotPagina() {
		return this.totPagina;
	}


	public void setTotPagina(int tp) {
		this.totPagina = tp;
	}


	public int getPagAtual() {
		return this.pagAtual;
	}


	public void setPagAtual(int pg) {
		this.pagAtual = pg;
	}


	public boolean getAberto() {
		return this.aberto;
	}


	public void setAberto(boolean ab) {
		this.aberto = ab;
	}


	public Aula09Pessoa getLeitor() {
		return this.leitor;
	}


	public void setLeitor(Aula09Pessoa l) {
		this.leitor = l;
	}

	
	@Override
	public void abrir() {
		if(this.getAberto() == false) {
			this.setAberto(true);
		}else {
			System.out.println("Ops... o livro já está aberto.");
		}
	}


	@Override
	public void fechar() {
		if(this.getAberto() == true) {
			this.setAberto(false);
		}else {
			System.out.println("Opa.. o livro já está fechado.");
		}
	}


	@Override
	public void folhear(int p) {
		if(this.getAberto() == true && this.getTotPagina() >= p) {
			this.setPagAtual(p);
			System.out.println("Estou folheando");
		}else {
			System.out.println("Impossível folhear");
		}
		
	}


	@Override
	public void avancarPag() {
		if(this.getAberto() == true) {
			System.out.println("Avancei uma página");
			this.setPagAtual(this.getPagAtual() + 1);
		}else {
			System.out.println("Impossível avançar");
		}
		
	}


	@Override
	public void voltarPag() {
		if(this.getAberto() == true) {
			System.out.println("Voltei uma página");
			this.setPagAtual(this.getPagAtual() - 1);
		}else {
			System.out.println("Impossível voltar");
		}
		
	}
}
