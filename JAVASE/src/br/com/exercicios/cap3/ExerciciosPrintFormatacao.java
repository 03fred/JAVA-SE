package br.com.exercicios.cap3;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

public class ExerciciosPrintFormatacao {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		//EXERCÍCIO 1 exercicio1();
		//EXERCÍCIO 2 exercicio2();
        //EXERCÍCIO 3  exercicio3();
		//exercicio4();
		
	}
		
		
	public static void exercicio1() {
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d" + " x " + "%d = \t%d ",9,i,9*i);
			System.out.println();
			
		}
		
		
	}
		
		
	public static void exercicio2() {
		
		
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
		
	
	
	public static void exercicio3() {
		
	System.out.println("Digite seu nome : ");
	String nome =  scan.nextLine();
	System.out.println("Digite sua nacionalidade: ");
	String nacionalidade =  scan.nextLine();
	System.out.println("Digite seu telefone: ");
	String telefone =  scan.nextLine();
	System.out.println("Cadastro confirmado");
	System.out.printf("Nome: \t\t %s ",nome);
	System.out.println();
	System.out.printf("Nacionalidade: \t %s ",nacionalidade);
	System.out.println();
	System.out.printf("Telefone: \t %s ",telefone);

	
		
	}
	
	
	public static void exercicio4() {
		
		String jogo1 = JOptionPane.showInputDialog("Digite seu 1° jogo favorito");
		String jogo2 = JOptionPane.showInputDialog("Digite seu 2° jogo favorito");

		JOptionPane.showMessageDialog(null,"Seus jogos favoritos são: \n" + jogo1 + "\n" + jogo2);
		
	}
}
