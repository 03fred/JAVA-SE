package br.com.cap8.estruturaRepeticao;

import javax.swing.JOptionPane;


public class Practice {

	public static void main(String[] args) {

		// exercicio01();
		// exercicio02();
		//exercicio03();
		exercicio04();

	}

	public static void exercicio04() {
		String str;
		double peso = 0, altura =0 ;
		do {
		str = " Informe seu peso";
		 peso = Double.parseDouble(JOptionPane.showInputDialog(str));
		str = " Informe sua altura";
		 altura = Double.parseDouble(JOptionPane.showInputDialog(str));
		 
		}while((peso  < 0 && peso >= 300)||(altura <= 0.1 && altura >= 2.5));
		
		
	}

	public static void exercicio03() {

		String str;
		str = " Informe seu nome";
		int fatorial = 0;
		int numero = Integer.parseInt(JOptionPane.showInputDialog(str));
		
		if(numero > 0 && numero <= 25) {
			int j = 0;

			for (int i = numero ; i > 0; i--) {
				j++;
				if( j == 1) fatorial = i;
				else fatorial = i * fatorial;
				System.out.println(fatorial);
			}		
			
			JOptionPane.showMessageDialog(null, "o fatorial de "+numero+ " é :"+ fatorial, "Mensagem",1);
		
		}
		
		
		
		
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

			} while (nome.length() < 5 || nome.length() > 50);
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

		boolean verifica;
		String str = "Informe seu cpf";

		String cpfString = JOptionPane.showInputDialog(str);
		verifica = verificaCPF(cpfString);
		cpfString = cpfString.trim();

		if (!verifica) {
			do {
				str = " O cpf deverá conter apenas números";
				cpfString = JOptionPane.showInputDialog(str);
				verifica = verificaCPF(cpfString);
			} while (verifica != true);
		}

		if (cpfString.length() != 11) {
			do {
				cpfString = JOptionPane.showInputDialog("cpf deve conter 11 digitos");

			} while (cpfString.length() != 11);

			JOptionPane.showMessageDialog(null, "CPF VÁLIDO", "mensagem", 1);
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
