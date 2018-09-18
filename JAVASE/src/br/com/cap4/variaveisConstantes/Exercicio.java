package br.com.cap4.variaveisConstantes;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio {
	static Scanner scan = new Scanner(System.in);
	static NumberFormat nf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {

		// exercicio01();
		// exercicio02();
		// exercicio03();
		//exercicio04();
		//exercicio05();
		//exercicio06();
		exercicio07();
	}

	

	public static void exercicio01() {

		System.out.printf("Nome completo \t");
		String nome = scan.nextLine();
		System.out.printf("Sexo (M ou F) \t");
		char sexo = scan.nextLine().charAt(0);
		System.out.printf("Renda familiar \t");
		double renda = scan.nextDouble();
		System.out.println();
		System.out.println("DADOS GRAVADOS");
		System.out.println("NOME \t" + nome);
		System.out.println("SEXO \t" + sexo);
		System.out.println("RENDA \t" + renda);

	}

	public static void exercicio02() {

		String nome = JOptionPane.showInputDialog(null, "informe seu nome completo");
		char sexo = JOptionPane.showInputDialog(null, "informe seu sexo [F ou M]").charAt(0);
		double renda = Double.parseDouble(JOptionPane.showInputDialog(null, "informe sua renda"));

		JOptionPane.showMessageDialog(null,
				" DADOS GRAVADOS" + "\nNome " + nome + "\nSexo " + sexo + "\nRenda: R$ " + nf.format(renda));
	}

	public static void exercicio03() {

		System.out.println("digite um numero");
		int quadrado = scan.nextInt();

		System.out.println("O quadrado do n�mero digitado � " + quadrado * quadrado);

	}

	public static void exercicio04() {

		int cubico = Integer.parseInt(JOptionPane.showInputDialog(null, "informe um n�mero"));
		JOptionPane.showMessageDialog(null, " O c�bico do valor digitado � \n" + Math.round(Math.pow(cubico, 3)));

	}

	public static void exercicio05() {
		System.out.printf("Digite o nome do vendedor: \t\t");
		String nome = scan.nextLine();

		System.out.printf("Digite o valor total de vendas: \t");
		double totalVendas = scan.nextDouble();

		System.out.printf("Digite o percentual sobre as vendas: \t");
		double percentual = scan.nextDouble();

		System.out.println("Valor da comiss�o de " + nome + ". � de $" + nf.format((totalVendas * (percentual/100))));
		
	}
	
	public static void exercicio06() {
		
		System.out.printf("Digite sua altura:\t");
        double altura = scan.nextDouble();
        
        System.out.printf("Digite seu peso:\t");
        double peso = scan.nextDouble();
		
        double imc = peso + (Math.pow(altura,2));
        System.out.printf("Seu imc:\t" + imc);

	}
	
	private static void exercicio07() {

		String texto = JOptionPane.showInputDialog(null,"informe um caracter");
		char caracter = texto.charAt(0);
		int it = (int)caracter;

		it++;
		
		char caracterSaida = (char)it;
		
		JOptionPane.showMessageDialog(null, "o pr�ximo caracter � \n" +  caracterSaida);
	}
}
