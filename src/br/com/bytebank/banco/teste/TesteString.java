package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

	// se precisar conectar muitos strings usa o o StringBuilder
		StringBuilder builder = new StringBuilder("Socorram"); 
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		
		
//		String vazio = "Gabriel";
//		String outroVazio = vazio.trim(); // tira o espaço
		
		//System.out.println(vazio.contains("el"));
		
		//System.out.println(vazio.isEmpty());
		
//		String nome = "ALURA";
//		CharSequence cs = new StringBuilder("al");
//
//		nome = nome.replace("AL", cs);
//
//		System.out.println(nome);
		
		//String nome = "Gabriel"; // object literal
		//Má pratica 
		//String outro = new String("Gabriel");
		
		
//		System.out.println(nome.length()); // quantos caracteres tem 
//		
//		for(int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
	
//		String sub = nome.substring(1); // a partir de qual posição gostaria de começa 
//		System.out.println(sub);
		
//		int pos = nome.indexOf("br"); // qual a aposição dessses caracteres 
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
			
		//String outra = nome.replace("Ga", "gA");
		//String outra = nome.toLowerCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
	}

}
