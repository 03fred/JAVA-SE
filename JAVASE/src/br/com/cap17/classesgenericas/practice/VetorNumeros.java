package br.com.cap17.classesgenericas.practice;

public class VetorNumeros<E> {

	private E[] objetos;
	private int quantidade;
	
	
	public void vetorNumero(int maximo) {
		
		if(maximo == 0 || maximo < 0)System.exit(0);
		objetos  = (E[]) new Object[maximo];
	}
	
	public void incluirNumero (E numero) {
	  objetos[quantidade++] = numero;
		
	}
	
	public double calcularMedia() {
		double soma = 0;
		for(E e : objetos) 
			soma += (Double)e;
		
		return (soma/objetos.length);
	}
	
	public E encontrarMenor() {
		Number menor = null;
		for(E e : objetos) {
		 if(menor == null || menor.doubleValue() > (Double)e)
			 menor = (Double)e;
		}
		return (E)menor;
		
	}
	
	public E encontrarMaior() {
		Number menor = null;
		for(E e : objetos) {
		 if(menor == null || menor.doubleValue() < (Double)e)
			 menor = (Double)e;
		}
		return (E)menor;
		
	}
}
