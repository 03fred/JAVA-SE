package br.com.cap8.estruturaRepeticao;

public class While {

	public static void main(String[] args) {

		System.out.println("Primeiro While");
		byte bt = 0;
		
		while (bt < 5) {
			System.out.println(++bt);
			
			System.out.println("Segundo While");
			
			bt = 69;
			while (bt >= 65) {
				String st =  "O número "+bt+" equivale ao caractere :";
				st +=(char)bt;
				System.out.println(st);
				bt--;
			}
		}
		
		
	}

}
