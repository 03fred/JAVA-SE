package br.com.cap18.Dates;

import static javax.swing.JOptionPane.*;

import java.text.NumberFormat;
import java.text.ParseException;

public class ValidaMoeda {

	public static void main(String[] args) {

		NumberFormat nfNumero = NumberFormat.getInstance();
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();

		while (true) {
			try {
				String str = showInputDialog(null, "Informe um valor");
				if (str == null)
					System.exit(0);

				Number nb = nfNumero.parse(str.trim());
				double valor = nb.doubleValue();
				valor = Math.floor(valor * 100) / 100;

				str = "Valor informado: " + nfMoeda.format(valor);
				showMessageDialog(null, str);

			} catch (ParseException exception) {

				showMessageDialog(null, "Dado Inválido", "ERRO", ERROR_MESSAGE);
			}
		}

	}

}
