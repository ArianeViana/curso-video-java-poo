//herança
package br.com.cursovideo;

public class Aula10 {

	public static void main(String[] args) {
		Aula10Pessoa p1 = new Aula10Pessoa();
		Aula10Aluno p2 = new Aula10Aluno();
		Aula10Professor p3 = new Aula10Professor();
		Aula10Funcionario p4 = new Aula10Funcionario();
		
		p1.setNome("Ariane");
		p2.setNome("Gustavo");
		p3.setNome("Simba");
		p4.setNome("Fúria da Noite");
		p1.setSexo("F");
			
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		p2.setCurso("Informática");
		p3.setSalario(2500.64f);
		p4.setSetor("Estoque");
		
		//essas linhas dão erro pq esses métodos não foram definidos dentro da classe mãe
		//são atributos específicos de outras classes
//		p1.ReceberAumento(550.23f);
//		p2.mudarTrabalho();
//		p3.cancelarMatricula();
		
		
	}

}
