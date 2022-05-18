package br.com.cursovideo;

//Projeto final - Youtube

public class Aula14 {

	public static void main(String[] args) {
		
		Aula14Video v[] = new Aula14Video[3];		
		v[0] = new Aula14Video("Aula 01");
		v[1] = new Aula14Video("Aula 02");
		v[2] = new Aula14Video("Aula 03");
				
		Aula14Gafanhoto g[] = new Aula14Gafanhoto[2];
		g[0] = new Aula14Gafanhoto("Bruno", 20, "masculino", "bruno123");
		g[1] = new Aula14Gafanhoto("Maria", 18, "feminino", "maria123");
		
		
		Aula15Visualizacao vis[] = new Aula15Visualizacao[2];
		vis[0] = new Aula15Visualizacao(g[0], v[1]);		
		vis[0].avaliar(90.0f);	
		
		vis [1]= new Aula15Visualizacao(g[1], v[1]);	
		vis[1].avaliar(100.0f);
		
	}

}
