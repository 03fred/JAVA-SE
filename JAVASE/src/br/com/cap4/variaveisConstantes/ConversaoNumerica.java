package br.com.cap4.variaveisConstantes;



public class ConversaoNumerica {


	public static void main(String[] args) {

		
		int inteiro = 1563;
		long lg = inteiro;		
		float fl = inteiro;
		short sh = (short)inteiro;
		System.out.printf("%s \n %s\n %s \n " + inteiro,lg,fl,sh);
		System.out.println();
		
		
		double db = 24.75;
		int it2 = (int)db; //CONVERTE PARA INTEIRO PEGANDO APENAS OS DIGITOS INTEIROS
		int it3 = (int)Math.round(db); //ARREDONDA O VALOR 
		System.out.println(db);
		System.out.println(it2);
		System.out.println(it3); 
	}

}
