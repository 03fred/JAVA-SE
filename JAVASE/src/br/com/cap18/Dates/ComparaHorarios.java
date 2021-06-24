package br.com.cap18.Dates;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ComparaHorarios {

	public static void main(String[] args) {

		DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT);
		df.setLenient(false);

		while (true) {
			try {

				String str = showInputDialog(null, "Informe um horario");
				if (str == null)
					System.exit(0);
				Date hora1 = df.parse(str);

				str = showInputDialog(null, "Informe outro horario");
				if (str == null)
					System.exit(0);
				Date hora2 = df.parse(str);

				str = "Horas informadas: " + df.format(hora1) + " e " + df.format(hora2) + "\n";

				if (hora1.equals(hora2))
					str += "Datas iguais";
				else if (hora1.after(hora2))
					str += "Primeira data é maior";
				else if (hora1.before(hora2))
					str += "Segunda data é maior";

				showMessageDialog(null, str, "Messagem", INFORMATION_MESSAGE);

			} catch (ParseException exception) {

				showMessageDialog(null, "Data inválida", "ERRO", ERROR_MESSAGE);

			}
		}

	}

}
