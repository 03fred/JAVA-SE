package br.com.cap4.variaveisConstantes;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Exercicio {
	static Scanner scan = new Scanner(System.in);
	static NumberFormat nf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {

		//exercicio01();
		//exercicio02();
		//exercicio03();
	    exercicio04();
	}
	
	
	public static void exercicio01(){
		
		System.out.printf("Nome completo \t");
		String nome = scan.nextLine();
		System.out.printf("Sexo (M ou F) \t");
		char sexo = scan.nextLine().charAt(0);
		System.out.printf("Renda familiar \t");
        double renda = scan.nextDouble();
		System.out.println();
		System.out.println("DADOS GRAVADOS");
		System.out.println("NOME \t" + nome );
		System.out.println("SEXO \t" + sexo );
		System.out.println("RENDA \t" + renda);

        
	}

	
	public static void exercicio02() {
		
		String nome = JOptionPane.showInputDialog(null,"informe seu nome completo");
		char sexo  = JOptionPane.showInputDialog(null,"informe seu sexo [F ou M]").charAt(0);
		double renda = Double.parseDouble(JOptionPane.showInputDialog(null,"informe sua renda"));

		JOptionPane.showMessageDialog(null," DADOS GRAVADOS" + "\nNome " + nome +"\nSexo " + sexo +"\nRenda: R$ " + nf.format(renda));
	}
	
	public static void exercicio03() {
		
		System.out.println("digite um numero");
		int quadrado = scan.nextInt();
		
		System.out.println("O quadrado do número digitado é " + quadrado * quadrado);
		
		
	}
	
	public static void exercicio04() {
		
		int cubico = Integer.parseInt(JOptionPane.showInputDialog(null,"informe um número"));
		JOptionPane.showMessageDialog(null, " O cúbico do valor digitado é \n" + Math.round(Math.pow(cubico,cubico)));
		
	}

}



