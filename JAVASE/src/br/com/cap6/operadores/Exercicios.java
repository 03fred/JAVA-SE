package br.com.cap6.operadores;

import java.io.PrintStream;
import java.util.Scanner;

public class Exercicios {

	static PrintStream saida = System.out;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// exercicio01();
		// exercicio02();
		// exercicio03();
		// exercicio04();
		//exercicio05();

	}

	public static void exercicio01() {

		saida.println("Digite a distancia percorrida");
		int km = scan.nextInt();

		saida.println("Digite o tempo gasto em minutos");
		int min = scan.nextInt();

		double minutos = (min % 60);
		minutos = minutos / 60;

		double hora = min / 60;
		double horaTotal = hora + minutos;
		saida.println(km / horaTotal + " km/h");

	}

	public static void exercicio02() {

		saida.printf("Digite o faturamento \t");
		double faturamento = scan.nextDouble();

		saida.printf("Digite o imposto \t");
		double impostos = scan.nextDouble();

		saida.println("\nPercentual de impostos " + (impostos / faturamento) * 100 + "%");

	}

	public static void exercicio03() {

		saida.printf(" preco original \t");
		double preco = scan.nextDouble();

		saida.printf("numero do parcelas \t");
		int parcela = scan.nextInt();

		saida.printf("valor das parcelas\t");
		double valorparcela = scan.nextDouble();
		
		saida.println("Calculos realizados");
		saida.printf("Juros pagos  %s" , ( parcela * valorparcela )- preco);
		saida.printf("\n total pago  %s" ,  parcela * valorparcela);
		
		saida.printf("\nPercentual de impostos  %s" ,((( parcela * valorparcela )- preco) / preco)*100 +"%");
	}
	
	public static void exercicio04() {

		
		
		saida.println("informe um numero");
		int num =  scan.nextInt();
		String resposta =  num % 2 == 0 ? "par": "ímpar";
		
		saida.println("Número é " + resposta);

	}
	
	public static void exercicio05() {

		
		
		saida.println("informe um numero");
		int num =  scan.nextInt();
		saida.println("Número é maior que 0 ");
		String resposta = scan.next();
		
		boolean confirma,confirmaResposta,respostaFinal;
		
		confirma =  num > 0 ? true : false ;
        confirmaResposta =  resposta.equals("sim")? true : false;
        respostaFinal = confirma == confirmaResposta ? true : false;        
        saida.println(respostaFinal);

		

	}
}
