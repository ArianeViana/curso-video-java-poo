//relacionamento entre classes

package br.com.cursovideo;

public class Aula07Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int numeroVitorias;
	private int numeroDerrotas;
	private int numeroEmpates;
	
		
	public Aula07Lutador(String n, String nc, int i, float a, float p, int v,
			int d, int e) {
		super();
		this.nome = n;
		this.nacionalidade = nc;
		this.idade = i;
		this.altura = a;
		//this.peso = p;
		this.setPeso(p);
		this.numeroVitorias = v;
		this.numeroDerrotas = d;
		this.numeroEmpates = e;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nc) {
		this.nacionalidade = nc;
	}

	public Integer getIdade() {
		return this.idade;
	}

	public void setIdade(Integer i) {
		this.idade = i;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float a) {
		this.altura = a;
	}

	public float getPeso() {
		return this.peso;
	}

	public void setPeso(float p) {
		this.peso = p;
		this.setCategoria();
	}

	public String getCategoria() {
		return this.categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		}else if(this.peso <= 70) {
			this.categoria = "Leve";
		}else if(this.peso <= 83.9) {
			this.categoria = "Médio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}

	public int getNumeroVitorias() {
		return this.numeroVitorias;
	}

	public void setNumeroVitorias(int v) {
		this.numeroVitorias = v;
	}

	public int getNumeroDerrotas() {
		return this.numeroDerrotas;
	}

	public void setNumeroDerrotas(int d) {
		this.numeroDerrotas = d;
	}

	public int getNumeroEmpates() {
		return this.numeroEmpates;
	}

	public void setNumeroEmpates(int e) {
		this.numeroEmpates = e;
	}
	
	public void apresentar() {
		System.out.println("=====APRESENTAÇÃO=====");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos");
		System.out.println(this.getAltura() + " m de altura");
		System.out.println("Pesando " + this.getPeso() + " kg");
		System.out.println("Ganhou: " + this.getNumeroVitorias());
		System.out.println("Perdeu: " + this.getNumeroDerrotas());
		System.out.println("Empatou " + this.getNumeroEmpates());
		System.out.println(" ");
	}
	
	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria() + " e tem:");
		System.out.println(this.getNumeroVitorias() + " vitórias");
		System.out.println(this.getNumeroDerrotas() + " derrotas");
		System.out.println(this.getNumeroEmpates() + " empates");
		System.out.println(" ");
	}
	
	public void ganharLuta() {
		this.setNumeroVitorias(this.getNumeroVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setNumeroDerrotas(this.getNumeroDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setNumeroEmpates(this.getNumeroEmpates() + 1);
	}
}
