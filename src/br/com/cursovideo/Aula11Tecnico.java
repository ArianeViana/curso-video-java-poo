package br.com.cursovideo;
//final em uma classe � usado quando n�o queremos que essa classe tenha filhos
//final em um m�todo � usado quando n�o queremos que o m�todo seja sobreposto

public final class Aula11Tecnico extends Aula11Aluno{
	private int registroProfissional;
	
	public void praticar() {
		
	}

	public int getRegistroProfissional() {
		return this.registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	
}
