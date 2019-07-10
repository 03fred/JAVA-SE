package br.com.cap18.Dates;

import java.util.Date;
import static java.lang.System.*;
public class RepresentacaoTempo {
	
	
	public static void main(String[] args) {
		
		Date agora = new Date();
		out.println("Agora :" + agora.getTime());
		
		Date dt = new Date(1234567890000L);
		out.println(dt.getTime());
		
		dt.setTime(0);
		out.println(dt.getTime());
		
		
		
	}

}
