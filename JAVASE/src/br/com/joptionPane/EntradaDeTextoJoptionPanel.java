package br.com.joptionPane;

import javax.swing.JOptionPane;

public class EntradaDeTextoJoptionPanel {

	public static void main(String[] args) {

		String msg = JOptionPane.showInputDialog(null,"Informe seu nome");
		JOptionPane.showMessageDialog(null,msg + "Seja bem vindo");
		
	}
	
}
