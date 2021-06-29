package br.com.cap18.exercicios;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.System.out;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exercicio2 {
	public static String str = "";
	public static List<Date> datas = new ArrayList<>();
	public static DateFormat df = DateFormat.getDateInstance();

	public static void main(String[] args) {

		while (str != null) {
			str = showInputDialog(null, "Informe uma data") /* "15/01/2009 12:00:00" */;
			capturarData();
		}

		if (datas.size() == 0)
			showMessageDialog(null, "Nenhuma Data Informada!!", "ERRO", ERROR_MESSAGE);

		Date menorData = datas.get(0);
		Date maiorData = datas.get(0);

		String strDatas = "";
		int i = 0;

		for (Date d : datas) {
			i++;
			strDatas += df.format(d) + " ";

			if (i % 2 == 0)
				strDatas += "\n";

			menorData = menorData.after(d) ? d : menorData;
			maiorData = maiorData.after(d) ? maiorData : d;
			out.println(strDatas);
		}

		str = " Menor Data Informada " + df.format(menorData) + "\n" + "Maior Data Informada " + df.format(maiorData);
		str += "\n\n\n" + strDatas;
		showMessageDialog(null, str);
	}

	public static void capturarData() {
		if (str == null)
			return;

		try {
			Date data = df.parse(str);
			datas.add(data);

		} catch (ParseException exception) {
			capturarData();
		}
	}

}
