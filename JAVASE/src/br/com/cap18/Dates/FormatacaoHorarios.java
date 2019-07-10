package br.com.cap18.Dates;

import java.util.Date;
import static java.lang.System.*;

import java.text.DateFormat;
public class FormatacaoHorarios {

	public static void main(String[] args) {
		Date agora = new Date();
        out.println("Formatos aplicáveis e horários");
        
        DateFormat df = DateFormat.getTimeInstance();
        out.println("Padrão:\t\t" + df.format(agora));
        
        df = DateFormat.getTimeInstance(DateFormat.SHORT);
        out.println("Padrão:\t\t" + df.format(agora));
        
        df = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        out.println("Padrão:\t\t" + df.format(agora));
        
        df = DateFormat.getTimeInstance(DateFormat.LONG);
        out.println("Padrão:\t\t" + df.format(agora));
        
        df = DateFormat.getTimeInstance(DateFormat.FULL);
        out.println("Padrão:\t\t" + df.format(agora));
	} 

}
