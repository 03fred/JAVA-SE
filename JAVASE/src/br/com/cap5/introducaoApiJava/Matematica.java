package br.com.cap5.introducaoApiJava;

public class Matematica extends AnalisadorDeTexto {

	public static void main(String[] args) {

		saida.println("Valor de E:" + Math.E);
		saida.println("Valor de PI:" + Math.PI);
		saida.println("N�mero aleat�rio:" + Math.random());
		saida.println("Raiz quadrada :" + Math.sqrt(16));
		saida.println("Pot�ncia :" + Math.pow(4, 2));
		saida.println("Pr�ximo inteiro:" + Math.ceil(4.1));
		saida.println("Inteiro Anteriro:" + Math.floor(4.9));
		saida.println("Arredondamento");
		saida.println("com rint:" + Math.rint(4.6));
		saida.println("com round:" + Math.round(4.6));

		
	}

}
