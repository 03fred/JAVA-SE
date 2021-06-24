package br.com.cap18.Dates;

import static javax.swing.JOptionPane.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ComparaDatasCompareTo {

	public static void main(String[] args) {

		DateFormat df = DateFormat.getDateInstance();
		df.setLenient(false);

		while (true) {
			try {

				String str = showInputDialog(null, "Informe uma data");
				if (str == null)
					System.exit(0);
				Date data1 = df.parse(str);

				str = showInputDialog(null, "Informe outra data");
				if (str == null)
					System.exit(0);
				Date data2 = df.parse(str);

				int resultado = data1.compareTo(data2);
				str = "Datas informadas: " + df.format(data1) + " e " + df.format(data2) + "\n";

				if (resultado > 0)
					str += "Primeira data � maior";
				else if (resultado < 0)
					str += "Segunda data � maior";
				else if (data1.before(data2))
					str += "Datas iguais";

				showMessageDialog(null, str, "Messagem", INFORMATION_MESSAGE);

			} catch (ParseException exception) {

				showMessageDialog(null, "Data inv�lida", "ERRO", ERROR_MESSAGE);

			}
		}

	}

}
