package br.com.cursovideo;
//final em uma classe é usado quando não queremos que essa classe tenha filhos
//final em um método é usado quando não queremos que o método seja sobreposto

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
