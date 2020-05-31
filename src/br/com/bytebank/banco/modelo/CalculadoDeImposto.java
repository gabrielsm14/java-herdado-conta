package br.com.bytebank.banco.modelo ;

//br.com.bytebank.modelo.CalculadorDeImposto => FQN
public class CalculadoDeImposto {
	
	private double totalImposto;

	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
