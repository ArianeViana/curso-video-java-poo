// aula 07 e 08

package br.com.cursovideo;

public class Aula07 {

	public static void main(String[] args) {

		//Aula07Lutador l1 = new Aula07Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		
		//usando vetor
		Aula07Lutador l[] = new Aula07Lutador[6];
		l[0] = new Aula07Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Aula07Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Aula07Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Aula07Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Aula07Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Aula07Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		//l[3].setPeso(134.5f);
		//l[3].ganharLuta();
		//l[3].status();
		
		Aula07Luta luta01 = new Aula07Luta();
		luta01.marcarLuta(l[0], l[1]);
		luta01.lutar();
		l[0].status();
		l[1].status();
		
		
	}

}
