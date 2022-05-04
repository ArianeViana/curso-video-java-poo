package br.com.cursovideo;

public class Aula11 {
	public static void main(String[] args) {
		//Aulla11Pessoa é uma classe abstrata, logo ela não pode ser instanciada
		//Aula11Pessoa p1 = new Aula11Pessoa();
		
		Aula11Visitante v01 = new Aula11Visitante();
		v01.setNome("Juvenal");
		v01.setIdade(23);
		v01.setSexo("M");
		System.out.println(v01.toString());
		
		
		Aula11Aluno a01 = new Aula11Aluno();
		a01.setNome("Carla Silva");
		a01.setIdade(12);
		a01.setSexo("F");
		a01.setMatricula(12341);
		a01.setCurso("Informática");
		a01.pagarMensalidade();
		System.out.println(a01.toString());
		
		Aula11Bolsista b01 = new Aula11Bolsista();
		b01.setNome("Bruno Oliveira");
		b01.setMatricula(12564);
		b01.setBolsa(344.99f);
		b01.pagarMensalidade();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
