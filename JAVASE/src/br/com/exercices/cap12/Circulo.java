package br.com.exercices.cap12;

import javax.swing.JOptionPane;


public class Circulo {

	private double circunferencia;

	
	public boolean validarCircunferencia(String cf) {
		String str;
		
		try {
			this.circunferencia = Double.parseDouble(cf);
			
			if(this.circunferencia <= 0) {
				str = "o número deve ser maior que 0";
				throw new IllegalArgumentException(str);
				
			}else{
				
				return true;
			}
			
			

		} catch (NumberFormatException nb) {
			 str = "N�mero inv�lido";
			JOptionPane.showMessageDialog(null, str, "error", 0);
			return false;

		}catch( IllegalArgumentException ie) {
			JOptionPane.showMessageDialog(null,ie.getMessage(),"ERROR",0);
			return false;
		}catch(NullPointerException np) {
			System.exit(0);
			return false;
		}
		

	}

	public double calcularArea() {
    double diametro;
		diametro  = this.circunferencia / Math.PI;
		double raio = diametro / 2;
		double area = raio = (Math.pow(raio, 2))* Math.PI;
		
		return area;
	}

	
	double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}

}
