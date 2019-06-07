package br.com.cap8.estruturaRepeticao;

public class DoWhile {

	public static void main(String[] args) {

		
		System.out.println("Primeiro do While");
		byte numero = 9;
		
		do System.out.println(++numero);
		while(numero  < 5);
		System.out.println();
		System.out.println("Segundo do While");

		numero = 69;
		do {
			String st = "O número " + numero + " equivalente ao caractere ";
			st = st +  (char)numero;
			System.out.println(st);
			numero--;
		}while(numero >= 65);
		
	}

}
