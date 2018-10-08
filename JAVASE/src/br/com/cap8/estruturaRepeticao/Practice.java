package br.com.cap8.estruturaRepeticao;

import javax.swing.JOptionPane;

public class Practice {

	public static void main(String[] args) {

		// exercicio01();
		// exercicio02();
<<<<<<< HEAD
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
		
		
		
		
=======
		// exercicio04();
		exercicio05();

	}

	public static void exercicio05() {
		double salario = 0, inss = 0, imposto = 0;
		String nome = "";
		boolean verifica;
		String str = "Informe seu salário";
		str = JOptionPane.showInputDialog(str);
		str = str.trim();
		verifica = verificaCPF(str);
		if (!verifica) {

			do {
				str = "Informe seu salário";
				str = JOptionPane.showInputDialog(str);
				verifica = verificaCPF(str);
			} while (!verifica);
		} else {
			salario = Double.parseDouble(str);
		}

		str = "Informe seu nome";
		str = JOptionPane.showInputDialog(str);
		str = str.trim();

		if (str.length() >= 2 && str.length() <= 30) {
			verifica = verifica(str);
			if (!verifica) {

				do {
					str = "Informe seu nome";
					str = JOptionPane.showInputDialog(str);
					verifica = verifica(str);
				} while (!verifica);
			} else {
				nome = str;
			}

		} else {

			while (str.length() <= 2 || str.length() > 30) {
				str = "Informe seu nome";
				str = JOptionPane.showInputDialog(str);

			}
		}

		if (salario < 965)
			inss =  ((salario * 8) / 100);
		if (salario >= 965.68 && salario <= 1609.45)
			inss = ((salario * 9) / 100);
		if (salario >= 1609.46 && salario <= 3218.90)
			inss = ((salario * 11) / 100);
		if (salario > 3218.90)
			salario =  354.07;
		if (salario >= 1434.01 && salario <= 2150)
			imposto =  ((salario * 7.5) / 100);
		if (salario >= 2150.01 && salario <= 2886)
			imposto =  ((salario * 15) / 100);
		if (salario >= 2886.01 && salario <= 3582)
			imposto = ((salario * 22.5) / 100);
		if (salario > 3582)
			imposto =  ((salario * 27.5) / 100);

		double totalSalario = salario - (imposto + inss);
		JOptionPane.showMessageDialog(null, "O funcionário " + nome + "\n  desconto inss " + inss + "$ \n desconto imposto de renda "+imposto+
				"\n salario com os desconto " + totalSalario);

	}

	public static void exercicio04() {

		String str;
		double peso = 0, altura = 0, imc;

		while (true) {

			str = " Informe seu peso";
			peso = Double.parseDouble(JOptionPane.showInputDialog(str));
			str = " Informe sua altura";
			altura = Double.parseDouble(JOptionPane.showInputDialog(str));

			if ((peso > 1 && peso <= 300) && (altura > 0.1 && altura <= 2.5))
				break;

		}

		imc = peso / Math.pow(altura, 2);

		if (imc >= 16 && imc <= 16.9)
			JOptionPane.showMessageDialog(null, " Muito abaixo do peso \nSeu imc deu " + imc);
		if (imc >= 18.5 && imc <= 24.9)
			JOptionPane.showMessageDialog(null, "Peso normal \nSeu imc deu " + imc);

>>>>>>> 264274fe0411343663a8fc8c71392e0a06d8f526
	}

	public static void exercicio01() {

		String str;
		String nome = "";

		str = " Informe seu nome";
		nome = JOptionPane.showInputDialog(str);

		if (nome.length() < 5 || nome.length() > 50) {
			do {
				nome = "";
				str = " O nome deverÃ¡ ser preenchido";
				nome = JOptionPane.showInputDialog(str);

			} while (nome.length() < 5 || nome.length() > 50);
		}

		str = nome.trim();
		boolean verifica = verifica(str);

		if (verifica == false) {
			do {
				str = " O nome deverÃ¡ conter apenas letras";
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
<<<<<<< HEAD
				str = " O cpf deverá conter apenas números";
=======
				str = " O cpf deverÃ¡ conter apenas nÃºmeros";
>>>>>>> 264274fe0411343663a8fc8c71392e0a06d8f526
				cpfString = JOptionPane.showInputDialog(str);
				verifica = verificaCPF(cpfString);
			} while (verifica != true);
		}

		if (cpfString.length() != 11) {
			do {
				cpfString = JOptionPane.showInputDialog("cpf deve conter 11 digitos");

			} while (cpfString.length() != 11);

<<<<<<< HEAD
			JOptionPane.showMessageDialog(null, "CPF VÁLIDO", "mensagem", 1);
=======
			JOptionPane.showMessageDialog(null, "CPF VÃ�LIDO", "mensagem", 1);
>>>>>>> 264274fe0411343663a8fc8c71392e0a06d8f526
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
