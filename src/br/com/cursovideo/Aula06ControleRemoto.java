package br.com.cursovideo;

//implementado a interface
public class Aula06ControleRemoto implements Aula06Controlador {
	
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//construct	
	public Aula06ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	//m�todos especiais
	//colocar os m�todos como privado torna mais r�gido o encapsulamento
	private int getVolume() {
		return this.volume;
	}
	
	private boolean getLigado() {
		return this.ligado;
	}
	
	private boolean getTocando() {
		return this.tocando;
	}
	
	private void setVolume(int v) {
		this.volume = v;
	}
	
	private void setLigado(boolean l) {
		this.ligado = l;
	}
	
	private void setTocando(boolean t) {
		this.tocando = t;
	}

	//sobrescrevendo os m�todos abstratos da interface
	
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		if (this.getLigado() == true) {
			System.out.println("=====MENU=====");
			System.out.println("Est� ligado? " + this.getLigado());
			System.out.println("Est� tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i = 1; i <= this.getVolume(); i += 10) {
				System.out.print("|");
			}
		}else {
			System.out.println("Imposs�vel abrir o menu!");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}

	@Override
	public void maisVolume() {
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() + 10);
		}else {
			System.out.println("Imposs�vel aumentar volume!");
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() -10);
		}else {
			System.out.println("Imposs�vel diminuir volume!");
		}
		
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado()== true && this.getTocando() == false) {
			this.setTocando(true);
		}else {
			System.out.println("N�o consegui reproduzir");
		}
		
	}

	@Override
	public void pause() {
		if(this.getLigado() == true && this.getTocando() == true) {
			this.setTocando(false);
		}else {
			System.out.println("N�o consegui dar pause");
		}
		
	}
	
}
