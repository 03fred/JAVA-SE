package br.com.cap8.estruturaRepeticao;

import javax.swing.JOptionPane;


public class Practice {

	public static void main(String[] args) {

		//exercicio01();
             exercicio02();
	}

	public static void exercicio01() {

		String str;
		String nome = "";

		str = " Informe seu nome";
		nome = JOptionPane.showInputDialog(str);

	  
		if (nome.length() < 5 || nome.length() > 50) {
			do {
				nome = "";
				str = " O nome deverá ser preenchido";
				nome = JOptionPane.showInputDialog(str);
				
				
			} while (nome.length() <  5 || nome.length() > 50 );
		}
	
		
	    str = nome.trim();
		boolean verifica = verifica(str);

		if (verifica == false) {
			do {
				str = " O nome deverá conter apenas letras";
				str = JOptionPane.showInputDialog(str);
				verifica = verifica(str);
			} while (verifica != true);
		}

	}

	public static void exercicio02() {

		boolean verifica ;
		String str = "Informe seu cpf";
		
		String cpfString = JOptionPane.showInputDialog(str);
        verifica = verificaCPF(cpfString);
        cpfString =  cpfString.trim();
        
       if(!verifica)
       {
    	   do {
				str = " O cpf deverá conter apenas números";
				cpfString = JOptionPane.showInputDialog(str);
				verifica = verificaCPF(cpfString);
			} while (verifica != true);
       }
    	 
	        if(cpfString.length() != 11) {
	        	do {
	             cpfString = JOptionPane.showInputDialog("cpf deve conter 11 digitos");

	        	}while(cpfString.length() != 11);
	        	
	        	JOptionPane.showMessageDialog(null, "CPF VÁLIDO","mensagem",1);
	        }
	    
	       
	}
	
	public static boolean verifica(String nome) {
		char[] c = nome.toCharArray();
		boolean d = true;

		for (int i = 0; i < c.length; i++)

			if (Character.isDigit(c[i])) {
				d = false;
				break;
			}
		
		return d;
	}
	

	public static boolean verificaCPF(String cpf) {
		char[] c = cpf.toCharArray();
		boolean d = true;

		for (int i = 0; i < c.length; i++)

			if (!Character.isDigit(c[i])) {
				d = false;
				break;
			}
		
		System.out.println(d);
		return d;
	}
	
	
}
