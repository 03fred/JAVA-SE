package br.com.cap18.Dates;

import java.text.DateFormat;
import java.util.Date;
import static java.lang.System.*;


public class FormatacaoDatas {

	public static void main(String[] args) {
	Date hoje = new Date();
	
	DateFormat df = DateFormat.getDateInstance();
	out.println("Classe do objeto:\t " +df.getClass().getName());
    out.println("Formato Padrão :\t" + df.format(hoje));
    
    df = DateFormat.getDateInstance(DateFormat.SHORT);
    out.println("Formato Curto :\t" + df.format(hoje));
	
    df = DateFormat.getDateInstance(DateFormat.MEDIUM);
    out.println("Formato Medio :\t" + df.format(hoje));
	
    df = DateFormat.getDateInstance(DateFormat.LONG);
    out.println("Formato Long :\t" + df.format(hoje));
    
    df = DateFormat.getDateInstance(DateFormat.FULL);
    out.println("Formato completo :\t" + df.format(hoje));
    
    
	}

}
