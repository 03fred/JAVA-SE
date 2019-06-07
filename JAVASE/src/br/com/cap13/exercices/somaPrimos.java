package br.com.cap13.exercices;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class somaPrimos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Set<Integer> primos = new HashSet();
		int num = scan.nextInt();
        int contador;
		
        for (int i = num; i > 1; i--) {
        	
        	if(ehPrimo(i)) {
        		primos.add(i);
        	}
        }
		for(Integer numP : primos) {
		System.out.print(numP);
		}
	}
	
	public static boolean ehPrimo (int numero){
		
		 for (int i = 2 ; i < numero; i++){
			 if (numero%i == 0) return false;
	     }
		 return true;
	}
}
