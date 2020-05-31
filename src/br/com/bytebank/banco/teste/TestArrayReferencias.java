package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		//Conta[] contas = new Conta[5];
		Object[] referencias = new Object[5]; // Object pode guardar qualquer objeto
		
		ContaCorrente cc1 = new ContaCorrente(22, 22);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 12);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(cc2.getNumero());
//		
//		Object referenciaGenerica = contas[1];
//		
//		System.out.println(referenciaGenerica.getNumero());

		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}

}
