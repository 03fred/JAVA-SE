package br.com.cap18.Dates;

import static java.lang.System.out;

import java.text.DateFormat;
import java.util.Date;

public class FormatacaoMista {

	public static void main(String[] args) {
		
		Date agora = new Date();
	
		out.println("Formatos com data e horário");
		
		DateFormat df = DateFormat.getDateInstance();
		out.println("Padrão\t"+df.format(agora) );
		
	     df = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		out.println("curto\t"+df.format(agora) );
		
		df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		out.println("Longo\t"+df.format(agora) );
		
	
		
		
	}

}
