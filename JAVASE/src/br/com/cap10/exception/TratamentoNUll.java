package br.com.cap10.exception;

import javax.swing.JOptionPane;

public class TratamentoNUll {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Informe seu nome ");
		if(nome == null)System.exit(0);
		nome = nome.toUpperCase();
		JOptionPane.showMessageDialog(null, "Seun nome "+nome);
		System.exit(0);
		
		
	}

}
