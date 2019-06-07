package br.com.cap8.estruturaRepeticao;

import javax.swing.JOptionPane;

public class Continue {

	public static void main(String[] args) {

		for (int i =0; true ; i++) {
			String st = "Digite seu nome";
			st =  JOptionPane.showInputDialog(null,st);
			
			if (st == null)System.exit(0);
			st = st.trim();
			if(st.length() < 2)continue;
			
			if( i == 0 ) st = "Bem vindo" +st;
			else st = " Bem vindo " + st + "\nErros cometidos" +i;
			JOptionPane.showMessageDialog(null,st);
			System.exit(0);

			
		}
		
	}

}
