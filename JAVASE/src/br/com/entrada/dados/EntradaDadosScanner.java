package br.com.entrada.dados;

import java.util.Scanner;

public class EntradaDadosScanner {

	public static void main(String[] args)  {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome:\t");
		String nome = scan.nextLine();
		
		System.out.println("Digite seu email:\t");
		String email = scan.nextLine();
		
		System.out.printf("Dados recebidos.\t Nome: %s e email: %s", nome,email);
	}
}
