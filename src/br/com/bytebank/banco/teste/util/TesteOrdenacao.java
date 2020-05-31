package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cp2 = new ContaPoupanca(22, 44);
        Cliente clienteCp2 = new Cliente();
        clienteCp2.setNome("Guilherme");
        cp2.setTitular(clienteCp2);
        cp2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cp4 = new ContaPoupanca(22, 22);
        Cliente clienteCp4 = new Cliente();
        clienteCp4.setNome("Ana");
        cp4.setTitular(clienteCp4);
        cp4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cp2);
		lista.add(cc3);
		lista.add(cp4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		//NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		lista.sort(new TitularDaContaComparator()); // ordenando a lista
		//lista.sort(null);
		
		//Collections.sort(lista, new NumeroDaContaComparator());
		//Collections.sort(lista);
		//Collections.reverse(lista);
		
		System.out.println("------------");

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
	}
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomec1 = c1.getTitular().getNome();
		String nomec2 = c2.getTitular().getNome();
		return nomec1.compareTo(nomec2);
	}	
}

class NumeroDaContaComparator implements Comparator<Conta> {

	/**
	 * A ideia desse metodo é definir qual a conta maior que a outra, o criterio
	 * depende do desenvolvedor pode ser baseado no saldo, ou no agencia, numero e
	 * etc.
	 * 
	 * Neste código foi comparado o numero
	 * 
	 * Devolve um inteiro negativo, e um inteiro positivo
	 */

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
//		return c1.getNumero() - c2.getNumero();
		
//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		return 0;
	}

}
