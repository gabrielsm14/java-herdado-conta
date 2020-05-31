package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(2222, 2222);
		
		conta.deposita(200);
		try {
		  conta.saca(210);
		}catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}

}
