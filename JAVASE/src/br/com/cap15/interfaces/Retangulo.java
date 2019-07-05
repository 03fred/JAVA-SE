package br.com.cap15.interfaces;

public class Retangulo implements AreaCalculavel {
	private double base;
	private double altura;
	

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	@Override
	public double calculaArea() {
		
		return this.base * this.altura;
	}

}
