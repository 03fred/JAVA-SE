package br.com.cap5.introducaoApiJava;

public class ComparaTexto extends AnalisadorDeTexto {

	public static void main(String[] args) {

		saida.println("Informe um texto");
		String t1 = scan.nextLine();

		saida.println("Informe outro texto");
		String t2 = scan.nextLine();

		saida.println("\nComparações");
		saida.println("Igualdade (C.S)/t" + (t1.equals(t2)));
		saida.println("Igualdade:\t\t" + t1.equalsIgnoreCase(t2));
		saida.println("Ordem (C.S)\t\t" + t1.compareTo(t2));
		saida.println("Ordem:\t\t" + t1.compareToIgnoreCase(t2));
		saida.println();

	}

}
