package br.com.cursovideo;

public class Aula05 {

	public static void main(String[] args) {
		Aula05Banco p1 = new Aula05Banco();
		p1.setNumConta(1111);
		p1.setDono("Ariane Viana");
		//p1.estadoAtual();	
		p1.abrirConta("CC");
		
		Aula05Banco p2 = new Aula05Banco();
		p2.setNumConta(2222);
		p2.setDono("Gustavo Jardim");
		p2.abrirConta("CP");
		
		p1.depositar(100);
		p2.depositar(500);
		
		p1.sacar(50);
		p2.sacar(650);
		
		p2.fecharConta();
		
		p1.estadoAtual();
		p2.estadoAtual();
	}

}
