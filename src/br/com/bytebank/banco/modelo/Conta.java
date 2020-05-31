package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author Gabriel Mendonça
 * 
 * 
 */
public abstract class Conta implements Comparable<Conta>, Serializable {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	
	/**
	 * Construtor para inciar o objeto Conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }
        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
		Conta.total++;
		// System.out.println(" O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		//System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);

	
	/**
	 * Valor precisa ser maior que o saldo 
	 * 
	 * @param valor
	 * 
	 * Foi criado uma exceção Runtime
	 */
	
	public void saca(double valor) {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int Numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		this.numero = Numero;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menos igual a 0");
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
    @Override
	public int compareTo(Conta outra) { // ordem natural 
		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() { // chamar a conta por baixo dos panos
		return  "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	}
}
