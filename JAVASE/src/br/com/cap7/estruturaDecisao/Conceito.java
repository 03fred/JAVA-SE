package br.com.cap7.estruturaDecisao;

import javax.swing.JOptionPane;

public class Conceito {

	public static void main(String[] args) {

		double nota1 = 0, nota2 = 0, media = 0;

		String st = "Informe sua primeira nota (0 a 9) :";
		st = JOptionPane.showInputDialog(null, st);

		if (st == null || st.length() == 0) {
			st = "É PRECISO INFORMAR A NOTA";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);
		} else
			nota1 = Double.parseDouble(st);

		st = "Informe sua segunda nota (0 a 9) :";
		st = JOptionPane.showInputDialog(null, st);

		if (st == null || st.length() == 0) {
			st = "É PRECISO INFORMAR A NOTA";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);
		} else
			nota2 = Double.parseDouble(st);
		
		
		media = (nota1+nota2)/2;
		
		if(media > 9) st = "MEDIA EXCELENTE";
		else st = media < 7 ?" MEDIA INSUFICIENTE": " MEDIA SUFICIENTE";
        
		st = "media obtida" +media+" \nConceito: " +st;
		JOptionPane.showMessageDialog(null,st,"MENSAGEM",1);
	    System.exit(0);
  
		
		
	}

}
