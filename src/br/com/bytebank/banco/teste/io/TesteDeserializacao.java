package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDeserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	//  cria��o de um objeto a partir de um um fluxo bin�rio
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
	    ContaCorrente cc = (ContaCorrente) ois.readObject();
	    ois.close();
	    System.out.println(cc.getSaldo());
	    System.out.println(cc.getTitular().getNome());
	    
	}
}
