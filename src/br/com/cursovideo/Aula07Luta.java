//relacionamento entre classes

package br.com.cursovideo;

import java.util.Random;

public class Aula07Luta {
	//private String desafiado;
	//private String desafiante;
	//tipo abstrato de dados: desafiado e desafiante não são strings, eles são instâncias(objetos) da classe Lutador
	
	private Aula07Lutador desafiante;
	private Aula07Lutador desafiado;
	private int round;
	private boolean aprovada;
		
	public Aula07Lutador getDesafiante() {
		return this.desafiante;
	}

	public void setDesafiante(Aula07Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Aula07Lutador getDesafiado() {
		return this.desafiado;
	}

	public void setDesafiado(Aula07Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public int getRound() {
		return this.round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public boolean getAprovada() {
		return this.aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public void marcarLuta(Aula07Lutador l1, Aula07Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	public void lutar() {
		if (this.getAprovada() == true) {
			System.out.println("======DESAFIADO======");
			desafiado.apresentar();
			System.out.println("======DESAFIANTE======");
			desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			switch(vencedor) {
			case 0: 
				System.out.println("======================");
				System.out.println("        Empatou!        ");
				System.out.println("======================");
				System.out.println(" ");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
			break;
			case 1:
				System.out.println("======================");
				System.out.println("Vitória do " + this.desafiado.getNome());
				System.out.println("======================");
				System.out.println(" ");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
			break;			
			case 2:
				System.out.println("======================");
				System.out.println("Vitória do " + this.desafiante.getNome());
				System.out.println("======================");
				System.out.println(" ");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
			break;			
			}
		} else {
			System.out.println("A luta não pode acontecer!");
		}
	}
	

}
