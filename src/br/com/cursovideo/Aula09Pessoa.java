package br.com.cursovideo;

public class Aula09Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	
	
	public Aula09Pessoa(String n, int i, String s) {
		//super();
		this.setNome(n);
		this.setIdade(i);
		this.setSexo(s);
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public void setSexo(String s) {
		this.sexo = s;
	}
	
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
}
