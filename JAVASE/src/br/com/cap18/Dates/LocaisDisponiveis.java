package br.com.cap18.Dates;

import static java.lang.System.out;

import java.util.Locale;

public class LocaisDisponiveis {

	public static void main(String[] args) {

		Locale[] locais = Locale.getAvailableLocales();
		out.println("N°\tIDIOMA\tPAÍS\tNOME DO LOCAL\n");
		for(int i = 0; i < locais.length; i++) {
			out.print(i+1+ ")\t");
			out.print("[" + locais[i].getLanguage() + "]\t");
			out.print("[" + locais[i].getLanguage() + "]\t");
			out.println(locais[i].getDisplayName());
		}
	}

}
