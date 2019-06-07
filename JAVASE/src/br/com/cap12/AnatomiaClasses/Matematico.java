package br.com.cap12.AnatomiaClasses;

public class Matematico {

	public double somar(double num1, double num2) {

		return num1 + num2;
	}

	public double subtrair(double num1, double num2) {

		return num1 - num2;
	}

	public double multiplicar(double num1, double num2) {

		return num1 * num2;
		
	}
	public double dividir(double num1, double num2) {

		return num1 / num2;
		
	}
	
	public double fatorial(byte valor) {

	if(valor == 0)return 1;
	
	long resultado= valor --;
	while (valor> 0)resultado = resultado* valor--;
	return resultado;
	

}
}