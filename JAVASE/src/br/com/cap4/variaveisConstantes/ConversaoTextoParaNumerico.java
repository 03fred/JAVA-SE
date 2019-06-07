package br.com.cap4.variaveisConstantes;

import java.util.Scanner;

public class ConversaoTextoParaNumerico {

	public static void main(String[] args) {
		/**
		String st = "65";
		byte bt  = Byte.parseByte(st);
		short sh = Short.parseShort(st);
		int it = Integer.parseInt(st);
		long lg = Long.parseLong(st);
		float fl =  Float.parseFloat(st);
		double db =  Double.parseDouble(st);
		char ch = (char)Integer.parseInt(st);
		
		System.out.println(bt);
		System.out.println(sh);
		System.out.println(it);
		System.out.println(lg);
		System.out.println(fl);
		System.out.println(db);
		System.out.println(ch);
		
		
 //CONVERTER QUALQUER VARIAVEL PARA STRING
     	st = String.valueOf(bt); 
		System.out.println(st);
**/
		double numero_decimal;
		int numero_inteiro;
		String string_numeroInteiro,string_numeroDecimal;
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Informe um número inteiro");
		numero_inteiro = scan.nextInt();
		
		System.out.println("\n Informe um número inteiro");
		numero_decimal= scan.nextDouble();
		
		string_numeroInteiro = String.valueOf(numero_inteiro);
		string_numeroDecimal = String.valueOf(numero_decimal);
		
		System.out.println("\n Conteúdo das Strings " + 
		"\n String inteiro = \t" + string_numeroInteiro +
		"\n String decimal = \t" + string_numeroDecimal);
		
		
	}

}
