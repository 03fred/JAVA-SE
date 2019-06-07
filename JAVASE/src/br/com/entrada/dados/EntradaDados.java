package br.com.entrada.dados;

import java.io.IOException;

public class EntradaDados {

	public static void main(String[] args) throws IOException {

		System.out.println("Digite seu nome");
		byte[] bt = new byte[50];
		System.in.read(bt);
		
		String nome = new String(bt).trim();
		System.out.printf("%s: Seja bem vindo!\n\n" ,nome);
		
		
	}

}
