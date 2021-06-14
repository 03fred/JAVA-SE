package br.com.cap18.Dates;

import static java.lang.System.out;

import java.text.DecimalFormat;

public class FormataDecimais {

	public static void main(String[] args) {

		double numero = 1234567.123456;
		out.println("Número original:\t" + numero);

		DecimalFormat df = new DecimalFormat("#,##0.0000");
		out.println("Número formatado :\t " + df.format(numero));
	}

}
