package br.com.cap18.Dates;

import static java.lang.System.out;

import java.text.NumberFormat;

public class FormatacaoPercentuais {

	public static void main(String[] args) {

		double percentual = 0.25;
		out.println("Número original:\t" + percentual);

		NumberFormat nf = NumberFormat.getPercentInstance();
		out.println("Forma Percentual :\t " + nf.format(percentual));
	}

}
