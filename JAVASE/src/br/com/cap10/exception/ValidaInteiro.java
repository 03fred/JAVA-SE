package br.com.cap10.exception;

import javax.swing.JOptionPane;

public class ValidaInteiro {

	public static void main(String[] args) {

		String str = "";
		int numero = 0;

		while (numero < 1 || numero > 10) {

			str = "Informe um número inteiro";
			str = JOptionPane.showInputDialog(null, str);
			if (str == null)
				break;
			try {
				numero = Integer.parseInt(str);
				if (numero < 1) {
					str = "O número deve ser maior que 0";
					throw new IllegalArgumentException(str);
				}

				if (numero > 10) {
					str = "O número deve ser menor que 10";
					throw new IllegalArgumentException(str);
				}

			} catch (NumberFormatException nf) {
				str = "Número inválido";
				JOptionPane.showMessageDialog(null, str, "ERROR", 0);
				System.exit(0);

			} catch (IllegalArgumentException iae) {

				JOptionPane.showMessageDialog(null, iae.getMessage(), "error", 0);

			}
		}
		JOptionPane.showMessageDialog(null, "Número válido " + numero);
	}
}