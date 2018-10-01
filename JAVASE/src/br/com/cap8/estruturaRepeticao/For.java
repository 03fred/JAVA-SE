package br.com.cap8.estruturaRepeticao;

public class For {

	public static void main(String[] args) {

		System.out.println("Primeiro laço \t");
		
		for(byte num = 1; num <= 5;num++) 
			System.out.println(num + " ");
		
		System.out.println("\nSegundo laço \t");
		for(byte num = 5; num >= 1 ; num--)
			System.out.println(num + "");
		
		System.out.println();
	}

}
