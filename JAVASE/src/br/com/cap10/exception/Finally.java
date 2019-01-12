package br.com.cap10.exception;

import javax.swing.JOptionPane;

public class Finally {

	public static void main(String[] args) {

		String str =  "Informe um número :";
		str =  JOptionPane.showInputDialog(null,str);
		if(str == null)System.exit(0);
		
		try {
			int numero = Integer.parseInt(str);
			JOptionPane.showMessageDialog(null,"numero válido");
		}catch(NumberFormatException nb) {
			JOptionPane.showMessageDialog(null,"numero inválido","ERROR",0);

		}finally {
			JOptionPane.showMessageDialog(null,"Operação encerrada!");
			System.exit(0);

		}
		
		
	}

}
