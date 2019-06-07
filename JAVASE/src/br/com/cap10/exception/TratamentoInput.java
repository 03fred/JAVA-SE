package br.com.cap10.exception;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoInput {

	static PrintStream saida = System.out;
	
	
	public static void main(String[] args) {

		byte  idade = -1;
		
		while(idade < 0) {
			saida.print("\nInforme sua idade:\t");
			Scanner scan = new Scanner(System.in);
			
			try {
				idade = scan.nextByte();
			}catch(InputMismatchException iptm) {
			saida.println("Idade inválida! ");
			}
			
			saida.println("Sua idade:\t\t" + idade);
		}
		
		
		
	}

}
