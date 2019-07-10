package br.com.cap17.classesgenericas.practice;

import javax.swing.JOptionPane;

public class RegistroNotas {

	public static void main(String[] args) {
		CalculaNotas calc = new CalculaNotas();
		if (calc.avaliar(7, 7, 7, 7, 7, 7)) {
			JOptionPane.showMessageDialog(null, "APROVADO");
		} else {
			JOptionPane.showMessageDialog(null, "REPROVADO");
		}

	}

}

class CalculaNotas {
	public boolean avaliar(double minimo, double... notas) {
		double soma = 0;

		for (Double nota : notas)
			soma += nota;
		return (soma / notas.length) < minimo ? false : true;
	}

}