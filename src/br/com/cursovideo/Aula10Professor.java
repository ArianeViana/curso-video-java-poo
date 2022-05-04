package br.com.cursovideo;

public class Aula10Professor extends Aula10Pessoa {
	private String especialidade;
	private float salario;
	
	private void receberAumento(float aum) {
		this.setSalario(this.getSalario() + aum);
	}

	public String getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(String e) {
		this.especialidade = e;
	}

	public float getSalario() {
		return this.salario;
	}

	public void setSalario(float s) {
		this.salario = s;
	}
	
	
}
