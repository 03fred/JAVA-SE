package br.com.cap4.variaveisConstantes;

import java.util.Scanner;

public class ConversaoCaracterNumeroJava {


	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um caractere");
		String texto = scan.nextLine();
		char caracter = texto.charAt(0);
		int codigo= (int)caracter;
		
		System.out.println("Código do caracter:\t "+codigo);
		System.out.println();
		
		System.out.println("Informe um numero");
		int it = scan.nextInt();
		
		//CONVERTER INTEIRO PARA CHAR 
		char ch = (char)it;
		System.out.println("Caracter correspondente a este código é :" + ch);
		
	}

}
