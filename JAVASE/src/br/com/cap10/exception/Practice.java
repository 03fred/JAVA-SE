package br.com.cap10.exception;

import javax.swing.JOptionPane;

public class Practice {

	static boolean verifica;

	public static void main(String[] args) {

		// exercicio01();
		exercicio02();

	}

	public static void exercicio02() {
		String str = "Digite um número";
		int numero = 0;

		while (numero > 1 || numero < 200000 ) {

			str = "Informe um número inteiro";
			str = JOptionPane.showInputDialog(null, str);
			if (str.length() <= 0)System.exit(0);
			try {
				numero = Integer.parseInt(str);
				int cont = 0;
				for (int i = 1; i <= numero; i++) {
					if (numero % i == 0)
						cont++;

				}

				if (cont > 2)
					JOptionPane.showMessageDialog(null, "Não é primo");
				else
					JOptionPane.showMessageDialog(null, "É primo");
			} catch (NumberFormatException nf) {
				str = "Número inválido";
				JOptionPane.showMessageDialog(null, str, "ERROR", 0);

			}

			
		}
		
		System.exit(0);
	}

	public static void exercicio01() {

		String str = "Digite seu nome", nome = "";

		while (nome.length() < 5 || nome.length() > 50) {
			nome = JOptionPane.showInputDialog(str);
			if (nome.length() < 5 || nome.length() > 50)
				JOptionPane.showMessageDialog(null, "números de caracteres inválidos", "ERROR", 0);
			if (str == null)
				System.exit(0);

			verifica = verifica(nome);
			if (!verifica) {
				nome = "";
				JOptionPane.showMessageDialog(null, "campo nome não aceita números", "ERROR", 0);
			}

		}

		str = "Digite seu salário";
		double salario = 0;
		verifica = false;

		while (!verifica) {
			try {

				salario = Double.parseDouble(JOptionPane.showInputDialog(str));
				if (salario < 465) {
					str = "O número deve ser maior ou igual a 465";
					throw new IllegalArgumentException(str);
				}
				verifica = true;
			} catch (NumberFormatException nbfe) {
				JOptionPane.showMessageDialog(null, "Número não condiz com o formato do campo", "ERROR", 0);
			} catch (IllegalArgumentException iae) {
				JOptionPane.showMessageDialog(null, iae.getMessage(), "error", 0);

			}
		}

		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + "\nSalario: " + salario + "\nFGTS: " + (salario * 0.8) / 10, "Recibo de pagamento",
				1);

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
}
