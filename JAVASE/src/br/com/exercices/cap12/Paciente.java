package br.com.exercices.cap12;

public class Paciente extends Pessoa {

	private double peso;
	private double altura;
	
	public Paciente() {

	}
	
	

	public boolean validarPeso(String peso) {
		return false;

	}
	
	public boolean validarAltura(String altura) {
		return false;

	}
	
	public double calcularImc() {
		return 1;

	}
	
	public String classificarIMC() {
		return "";

	}
	
	public String recuperarResultado() {
		return "";

	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}


