package br.com.cap8.estruturaRepeticao;

import javax.swing.JOptionPane;

public class ValidaNome {

	public static void main(String[] args) {

		
		String st = "Digite seu nome";
		boolean nome_falso = false;
		String nome ="";
		
		while (nome_falso == false) {
			
			nome = JOptionPane.showInputDialog(st);

			if (nome == null)System.exit(0);
			nome =  nome.trim();
			
			if(nome.length() < 5 || nome.length()> 50)
				JOptionPane.showMessageDialog(null, "ERROR - NOME NULL", "MENSAGEM", 0);
                 
		    else nome_falso = true;
			
		
		}

		JOptionPane.showMessageDialog(null, "Nome valido , Bem vindo "+nome, "Mengsagem",1);
	System.exit(0);
	
	}

}
