package br.com.cap5.introducaoApiJava;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class AnalisadorDeTexto {

	static PrintStream saida = System.out;
	static Random acaso = new Random();
	 static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		String artista = "";
		
		
		
		saida.println("\n Informe o  nome de um artista: \t");
		artista = scan.nextLine();
		
		saida.println("Análise do nome: \t\t" + artista);
		
		saida.println("Conversão para maiúsculo \t "+  artista.toUpperCase());
		saida.println("Conversão para minúsculo \t "+  artista.toLowerCase());
		saida.println("Substituindo espaços por _ \t"+  artista.replace("","_"));
		saida.println("Quantidade de caracteres \t "+  artista.length());
		saida.println("Primeira letra \t\t "+  artista.charAt(0));
		saida.println("Posição da primeira letra a \t "+  artista.indexOf("a"));
		saida.println("Posição da ultima letra a \t "+  artista.lastIndexOf("a"));
		saida.println("O primeiro nome \t "+  artista.substring(0,artista.indexOf(" ")));
		saida.println("O último nome \t "+  artista.substring(artista.lastIndexOf(" ") + 1,artista.length()));





	}

}
