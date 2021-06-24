package br.com.cap18.Dates;

import static java.lang.System.out;

import java.util.Locale;

public class IdiomasDisponiveis {

	public static void main(String[] args) {

		String[] idiomas = Locale.getISOLanguages();
		out.println("Idiomas disponíveis:");
		for(int i = 1; i <= idiomas.length; i++) {
			out.print(idiomas[i-1] + " ");
			if(i %25 == 0)out.println();
		}
	}

}
