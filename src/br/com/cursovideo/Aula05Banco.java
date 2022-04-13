package br.com.cursovideo;

public class Aula05Banco {
	
	//atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//getters
	public int getNumConta() {
		return this.numConta;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	//setters
	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public void setDono(String d) {
		this.dono = d;
	}
	
	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public void setStatus(boolean st) {
		this.status = st;
	}
	
	//métodos
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t  == "CP") {
			this.setSaldo(150);
		}else if (t == "CC") {
			this.setSaldo(50);
		}
	}
	
	// v = valor depositado, sacado ou cobrado
	public void depositar(float v) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta de: " + this.getDono());
		}else {
			System.out.println("Impossível depositar. Conta Inativa");
		}
	}
	
	public void sacar(float v) {
		if(this.getStatus() == true) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de: " + this.getDono());
			}else {
				System.out.println("Saldo Insuficiente");
			}
		}else {
			System.out.println("Impossível sacar. Conta Inativa");
		}
		
	}
	public void pagarMensal() {
		float v;
		if (this.getTipo() == "CC") {
			v = 12;
		}else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus() == true) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Olá, " + this.getDono() + " mensalidade paga com sucesso!");
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("Impossível pagar. Conta Inativa!");
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		}else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito");
		}else {
			this.setStatus(false);
			System.out.println("Conta de " + this.getDono() + " foi encerrada");
		}
	}
	
	//construct
	public Aula05Banco() {
		setStatus(false);
		setSaldo(0);
	}
	
	public void estadoAtual() {
		System.out.println("------------------------");
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Titular: " + this.getDono());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo: R$" + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
}
