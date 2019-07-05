package br.com.cap15.interfaces;

public class TesteArea {

	public static void main(String[] args) {
		
		Retangulo re = new Retangulo(3,2);
		System.out.println(re.calculaArea());
		
		
		Circulo c = new Circulo(5);
		System.out.println(c.calculaArea());
		
		
		Quadrado q = new Quadrado(4);
		System.out.println(q.calculaArea());
	}

}
