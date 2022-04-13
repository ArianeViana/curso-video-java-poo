package br.com.cursovideo;

public class Aula04Caneta {
	//usando métodos especiais
	
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	//getters - tem acesso a informação 
	public String getModelo() {
		return this.modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public boolean getTampada() {
		return this.tampada;
	}
	
	//setters - modifica a informação
	public void setModelo(String m) {
		this.modelo = m;		
	}
		
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public void setTampada(boolean t) {
		this.tampada = t;
	}	
	
	public void tampar() {
		this.setTampada(true);
	}
	
	public void destampar() {
		this.setTampada(false);
	}
	
	//construct - deve ter o mesmo nome que a classe
	//ele vai criar automaticamente os atributos abaixo
	public Aula04Caneta() {
		this.tampar();
		this.setCor("Azul");
	}
	
	//construct com parâmetros
//	public CanetaAula04(String m, float p) {
//		this.setModelo(m);
//		this.setCor("Azul");
//		this.setPonta(p);
//		this.tampar();
//	}
//	
	public void status() {
		System.out.println("==== SOBRE A CANETA ====");
		//System.out.println("Modelo: " + this.modelo);
		//System.out.println("Ponta: " + this.ponta);
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
}
