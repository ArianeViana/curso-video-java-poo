package br.com.cursovideo;

//heran�a para diferen�a
//al�m dos atributos/m�todos herdados h� novos atributos/m�todos 

public class Aula11Bolsista extends Aula11Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de: " + this.getNome());
	}
	
	//sobreposi��o do m�todo pai
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " � bolsista. Pagamento facilitado.");
		
	}

	public float getBolsa() {
		return this.bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
