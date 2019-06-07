package br.com.exercices.cap12;

import javax.swing.JOptionPane;

public class AreaCirculo {

	public static void main(String[] args) {
		while (true) {
			Circulo ci = new Circulo();
			String str = JOptionPane.showInputDialog("Digite a circunferência");
			
			while (!ci.validarCircunferencia(str))
				str = JOptionPane.showInputDialog(null, "ERROR", "Digite a circunferência", 0);
			JOptionPane.showMessageDialog(null, ci.calcularArea(), "Area Do Circulo", 1);

		}

	}
}
