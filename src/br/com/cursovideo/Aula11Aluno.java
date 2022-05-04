package br.com.cursovideo;

public class Aula11Aluno extends Aula11Pessoa{
	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade de aluno: " + this.getNome());
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aula11Aluno [matricula=" + matricula + ", curso=" + curso + ", getNome()=" + getNome() + ", getIdade()="
				+ getIdade() + ", getSexo()=" + getSexo() + "]";
	}
	
	
	
}
