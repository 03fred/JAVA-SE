package br.com.cap13.encapsulamento;

import javax.swing.JOptionPane;

public class TestaAtleta {

	public static void main(String[] args) {

		
		Atleta rodrigo = new Atleta("Rodrigo P ",Atleta.SEXO_MASCULINO);
		JOptionPane.showMessageDialog(null, rodrigo);
		
		System.exit(0);
	}

}
