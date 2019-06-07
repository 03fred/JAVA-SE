package br.com.cap4.variaveisConstantes;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculoImposto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// A CLASSES NUMBERFORMAT É USADA PARA FORMATAR NÚMEROS DECIMAIS QUE REPRESENTAM 
		// NÚMEROS MONETÁRIOS 
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.println("Informe o valor do faturamento");
		double faturamento = scan.nextDouble();

		double valorConfis = faturamento * Constantes.CONFINS / 100;
		double valor_pis = faturamento * Constantes.PIS / 100;
        double totalImposto = valorConfis + valor_pis;
		
		System.out.println("CONFINS(3%):\t" +nf.format(valorConfis)) ;
		System.out.println("PIS(0.65%):\t" +nf.format(valor_pis)) ;
		System.out.println("Total imposto:\t" +nf.format(totalImposto)) ;

	}
}