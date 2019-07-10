package br.com.cap18.Dates;

import java.text.DateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class ValidaHorario {

	public static void main(String[] args) {
		DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT);
		df.setLenient(false);

		while (true) {

			try {
				String str = "Digite um horario";
				str = JOptionPane.showInputDialog(str);
				if (str == null)
					System.exit(0);

				Date data = df.parse(str);

				str = "data formatada :" + df.format(data);

				JOptionPane.showMessageDialog(null, str);

			} catch (java.text.ParseException ex) {
				JOptionPane.showMessageDialog(null, "error");
			}

		}
	}

}
