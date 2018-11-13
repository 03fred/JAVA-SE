package br.com.cap12.AnatomiaClasses;

public class TestaMatematico {

	public static void main(String[] args) {

		
		Matematico matematico = new Matematico();
		
		System.out.println(matematico.somar(3, 4));
		System.out.println(matematico.multiplicar(3, 4));
		System.out.println(matematico.dividir(3, 4));
		System.out.println(matematico.subtrair(3, 4));
      System.out.println(matematico.fatorial((byte)3));
		
	}

}
