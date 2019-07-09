package br.com.cap17.documentation;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;


public class ImportacaoEstatica {
	
	public static void main(String[]args) {
		String str = showInputDialog("Informe um número: ");
		if(str == null) System.exit(0);
		double numero = Double.parseDouble(str);
		
		 str = "Número :" + numero +"\nSeno:" + sin(numero)+
				 "\nCosseno:"+ cos(numero);
		 showMessageDialog(null, str);
		 System.exit(0);
		
	}

}
