package br.com.cap4.variaveisConstantes;

public class NumerosInteiros {

	public static void main(String[] args) {

		byte bt;
		short sh;
		int it;
		long lg;

		bt = 127;
		sh = 32767;
		it = 24567849;
		lg = 1212231244434534L;

		System.out.println("Limite superior:");
		System.out.println("byte:\t " + bt);
		System.out.println("short:\t " + sh);
		System.out.println("int:\t " + it);
		System.out.println("long:\t " + lg);
		System.out.println();
		
		bt = -127;
		sh = -32767;
		it = -24567849;
		lg = -1212231244434534L;

		System.out.println("Limite inferior:");
		System.out.println("byte:\t " + bt);
		System.out.println("short:\t " + sh);
		System.out.println("int:\t " + it);
		System.out.println("long:\t " + lg);

	}

}
