package br.com.cap5.introducaoApiJava;

public class Caractere extends AnalisadorDeTexto {

	public static void main(String[] args) {

		saida.println("\nCodigos de caracteres");
		saida.println("A =\t" + Character.getNumericValue('A'));
		saida.println("B =\t" + Character.getNumericValue('B'));
		saida.println("C =\t" + Character.getNumericValue('C'));
		saida.println("\nTestes diversos");
		saida.print("\"5\" � um digito\t\t");
		saida.println(Character.isDigit('5'));
		saida.print("\"5\" � uma letra\t\t");
		saida.println(Character.isLetter('5'));
		saida.print("\"5\" � um digito ou letra\t\t");
		saida.println(Character.isLetterOrDigit('5'));
		saida.print("\"-\" � um espa�o em branco\t\t");
		saida.println(Character.isWhitespace('-'));
		saida.print("\"A\" � uma letra min�scula\t\t");
		saida.println(Character.isLowerCase('A'));
		saida.print("\"A\" � uma letra mai�scula\t\t");
		saida.println(Character.isUpperCase('A'));
		
	}

}
