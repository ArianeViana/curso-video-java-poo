package br.com.cursovideo;

//herança para diferença
//além dos atributos/métodos herdados há novos atributos/métodos 

public class Aula11Bolsista extends Aula11Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de: " + this.getNome());
	}
	
	//sobreposição do método pai
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista. Pagamento facilitado.");
		
	}

	public float getBolsa() {
		return this.bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
