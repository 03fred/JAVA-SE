package br.com.cap15.interfaces;

public class Circulo implements AreaCalculavel {
private double diametro;

	public Circulo(double diametro) {
	super();
	this.diametro = diametro;
}


	@Override
	public double calculaArea() {
		double raio = this.diametro/2;
		return Math.PI * Math.pow(raio,2);
	}

}
