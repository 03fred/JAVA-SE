package br.com.cap15.interfaces;

public class Quadrado implements AreaCalculavel {
private double lado;
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}
	

	public Quadrado(double lado) {
		this.lado = lado;
	}
}
