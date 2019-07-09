package br.com.cap17.documentation;

import javax.swing.JOptionPane;


public class CalculoArea {

	public static void main(String[] args) {
		CalculoArea calc = new CalculoArea();
		calc.calcular();
	}

	public void calcular() {
		
		while(true) {
			String str = "Informe o raio de um circulo: ";
			str = JOptionPane.showInputDialog(str);
			if(str == null)System.exit(0);
		  
			Circulo cl = new Circulo(Double.parseDouble(str));
		    
		    str = "A área do circulo é igual a :"+cl.getArea();
		    
		    JOptionPane.showMessageDialog(null, str);
			
		}
	}

	class Circulo {

		private double raio;

		public  Circulo(double raio) {
			this.raio = raio;
		}

		public double getArea() {
			return Math.PI * Math.pow(raio, 2);
		}
	}
}