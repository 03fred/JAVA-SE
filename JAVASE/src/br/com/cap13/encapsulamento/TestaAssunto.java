package br.com.cap13.encapsulamento;

import javax.swing.JOptionPane;

public class TestaAssunto {

	public static void main(String[] args) {
		
		Assunto ass = new Assunto(1,"algoritmo");
		JOptionPane.showMessageDialog(null, ass);
		
		Assunto ed = new Assunto(2,"Estrutua de dados");
		JOptionPane.showMessageDialog(null, ed);
		System.exit(0);
		
		
	}

}
