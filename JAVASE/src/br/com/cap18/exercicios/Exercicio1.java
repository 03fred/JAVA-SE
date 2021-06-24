package br.com.cap18.exercicios;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;

public class Exercicio1 {

	public static void main(String[] args) {

		try {

			while (true) {
				DecimalFormat decimalFormat = new DecimalFormat("###,###,###,000");

				String str =  showInputDialog(null, "Informe uma data") /*"15/01/2009 12:00:00"*/;
				DateFormat df = DateFormat.getDateInstance();

				validarString(str);
				Date dataUm = df.parse(str);

				str =  showInputDialog(null, "Informe data") /*"15/02/2009 13:02:03"*/;
				validarString(str);
				Date dataDois = df.parse(str);

				// Calucalte time difference
				// in milliseconds
				long diferencaMilisegundos = dataDois.after(dataUm) ? dataDois.getTime() - dataUm.getTime()
						: dataUm.getTime() - dataDois.getTime();
				
				long diferencaSegundos = (diferencaMilisegundos / 1000);
				
				long differencaMinutos = (diferencaMilisegundos / (1000 * 60));
				
				long differencaHoras = (diferencaMilisegundos / (1000 * 60 * 60));
				
				long differencaDias = (diferencaMilisegundos / (1000 * 60 * 60 * 24));

				str = "Dados informados: " + df.format(dataUm) + " e " + df.format(dataDois) + "\n"
						+ "Diferença em milissegundos: " + decimalFormat.format(diferencaMilisegundos) + "\n"
						+ "Diferença em segundos: " + decimalFormat.format(diferencaSegundos) + "\n"
						+ "Diferença em minutos: " + decimalFormat.format(differencaMinutos) + "\n"
						+ "Diferença em horas: " + differencaHoras + "\n" + "Diferença em dias: "
						+ differencaDias;

			    showMessageDialog(null, str);
			}

		} catch (ParseException exception) {
			showMessageDialog(null, "error");
		}

	}

	public static void validarString(String str) {
		if (str == null)
			System.exit(0);
	}

}
