package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadoDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 222);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoDeImposto calc = new CalculadoDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
		
		
	}

}
