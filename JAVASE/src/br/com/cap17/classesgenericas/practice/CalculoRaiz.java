package br.com.cap17.classesgenericas.practice;

import javax.swing.JOptionPane;
import static java.lang.Math.*;

public class CalculoRaiz {
	public static void main(String[] args) {

		while (true) {
			String str = JOptionPane.showInputDialog("Digite um numero");
			if (str == null)
				System.exit(0);
			try {
				JOptionPane.showMessageDialog(null, calcular(Integer.parseInt(str)));
			} catch (NumberFormatException nbf) {
				JOptionPane.showMessageDialog(null, "Número Inválido", "ERROR", 0);
			}

		}
	}

	public static Integer calcular(Integer num) {

		return (int) sqrt(num);

	}
}
