package br.com.exercices.cap12;

import javax.swing.JOptionPane;

public class TesteImc {

	public static void main(String[] args) {

		Paciente pc = new Paciente();
		String str = "Digite seu nome completo";
		str = JOptionPane.showInputDialog(str);

		while (!pc.validarNomes(str)) 
			str = JOptionPane.showInputDialog(null,"ERROR","NOME INVÁLIDO",0);
		

	}

}
