package br.com.cap7.estruturaDecisao;

import javax.swing.JOptionPane;

public class Exercicios {
	
	public static void main(String args[]) {
		//exercicio01();
		exercicio02();
		
}
	public static void exercicio01() {

		String st = "Digite seu nome completo";
		st = JOptionPane.showInputDialog(null,st);
		
		String compara = st;
		
		compara = compara.length() >=5 && compara.length() <= 50?"Nome valido":"Nome invalido";
		
		if(compara.equals("Nome invalido")) {
			
			st = " DIGITE SEU NOME";
			JOptionPane.showMessageDialog(null,st,"ERROR",0);
			System.exit(0);
			
		}
		compara = st.substring(st.lastIndexOf(" ")+1,st.length());
		if(compara.isEmpty()) {
			st = " DIGITE SEU SOBRENOME";
			JOptionPane.showMessageDialog(null,st,"ERROR",0);
			System.exit(0);
		}
		
		if(compara.length() <= 2) {
			st = " SOBRENOME COM MENOS DE 3 CARACTERES";
			JOptionPane.showMessageDialog(null,st,"ERROR",0);
			System.exit(0);
		}
		
		
	}

	
	public static void exercicio02() {
		

		String st = "Digite seu email";
		st = JOptionPane.showInputDialog(null,st);
		
		if(st.indexOf("@") != st.lastIndexOf("@"))
		{
			
			st = "E-MAIL COM DUAS  OU MAIS @";
			JOptionPane.showMessageDialog(null,st,"ERROR",0);
			System.exit(0);
		}
		
		if(st.indexOf("@") < 3)
		{
			
			st = "APENAS 2 CARACTERES ANTES DA @";
			JOptionPane.showMessageDialog(null,st,"ERROR",0);
			System.exit(0);
		}
		
      JOptionPane.showMessageDialog(null, "email valido " + st, "MENSAGEM",1);

		
	}
	
	}
	
