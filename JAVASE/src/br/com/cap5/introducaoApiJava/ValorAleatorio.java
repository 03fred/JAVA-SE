package br.com.cap5.introducaoApiJava;

import java.util.Random;

public class ValorAleatorio extends AnalisadorDeTexto {

	static Random acaso = new Random();
	public static void main(String[] args) {

		saida.println("Qualquer tipo booleano " +  acaso.nextBoolean());
		saida.println("Qualquer tipo inteiro  " + acaso.nextInt());
		saida.println("Qualquer tipo inteiro de 0 a 99 " +  acaso.nextInt(100));
		saida.println("Qualquer tipo inteiro long " + acaso.nextLong());
		saida.println("Qualquer tipo float " + acaso.nextFloat());
		saida.println("Qualquer double " + acaso.nextDouble());

		
	}

}
