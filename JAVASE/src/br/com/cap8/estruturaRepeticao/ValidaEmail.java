package br.com.cap8.estruturaRepeticao;

import javax.swing.JOptionPane;

public class ValidaEmail {

	public static void main(String[] args) {

		String email = " ";
		do {
			email = JOptionPane.showInputDialog(null, "Informe seu email");
			if( email == null)System.exit(0);
			email = email.trim();
		}
			while(email.length() < 5 || email.indexOf("@") < 1);
				JOptionPane.showMessageDialog(null, "Email valido "+email,"Mensagem",1);
			System.exit(0);
		
		
	}

}
