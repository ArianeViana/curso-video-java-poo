package br.com.cursovideo;

public class Aula09 {
	public static void main(String[] args) {
				
		Aula09Pessoa p[] = new Aula09Pessoa[2];
		Aula09Livro[] l = new Aula09Livro[3];
		
		p[0] = new Aula09Pessoa("Ariane", 31, "f");
		p[1] = new Aula09Pessoa("Gustavo", 29, "m");
		
//		System.out.println(p[0].getIdade());
//		p[0].fazerAniversario();
//		System.out.println(p[0].getIdade());
		
		
		
		l[0] = new Aula09Livro("Cidadã de Segunda Classe", "Buchi Emecheta", 256, p[0]);
		l[1] = new Aula09Livro("História de Quem Foge e de Quem Fica", "Elena Ferrante", 416, p[0]);
		l[2] = new Aula09Livro("1984", "George Orwell", 416, p[1]);
		
		//System.out.println(l[0].detalhe());
		l[0].abrir();
		l[0].folhear(123);
		System.out.println(l[0].detalhe());
		
		

}
	
}

