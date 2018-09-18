package br.com.cap5.introducaoApiJava;

public class IntroducaoString {

	public static void main(String[] args) {

		String str = new String("Java");
		System.out.println(str);
		
		char[] texto = {'J','A','V','A'};
		str =  new String(texto);
		System.out.println(str);

		
		//CONCATENAÇÃO
		String sujeito = "Socrátes";
		String adjetivo = "filósofo";
		
		System.out.println(sujeito + " foi um " + adjetivo);

		//CONVERSÃO PARA STRING
		Double db = new Double(5.5);
        str = db.toString( );
		System.out.println(str);

		//MÉTODOS STATICOS 
		int it = 5;
		str = String.valueOf(it);
		System.out.println(str);

		str = new String ("Java");
		System.out.println(str.toLowerCase()); //MINUSCULO
		System.out.println(str.toUpperCase()); //MAIUSCULO


		
		
		
	}

}
