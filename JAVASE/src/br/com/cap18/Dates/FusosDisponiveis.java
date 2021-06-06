package br.com.cap18.Dates;

import java.util.TimeZone;
import static java.lang.System.out;

public class FusosDisponiveis {

	public static void main(String[] args) {
		
		String[] fusos = TimeZone.getAvailableIDs(-3 * 60 * 60 * 1000);
        
		out.println("Fusos disponíveis para GMT -02:00");
		
		for(int i = 0; i < fusos.length; i++) {
			out.println( i + 1 + ")\t" + fusos[i]);
		}
	}

}
