package br.com.exercicios;

import java.util.Scanner;

public class ExerciciosPrintFormatacao {

	public static void main(String[] args) {
		
		//EXERCÍCIO 1 exercicio1();
		//EXERCÍCIO 2 exercicio2();

		
		
	}
		
		
	public static void exercicio1() {
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d" + " x " + "%d = \t%d ",9,i,9*i);
			System.out.println();
			
		}
		
		
	}
		
		
	public static void exercicio2() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("digite seu nome: \t");
		String nome = scan.nextLine();
		System.out.printf("digite seu email: \t");
		String email = scan.nextLine();
		System.out.println();
		System.out.println("Cadastro confirmado");
		System.out.printf("Nome: \t %s ",nome);
		System.out.println();
		System.out.printf("Email: \t %s ",email);

		
		}
		
	
}
