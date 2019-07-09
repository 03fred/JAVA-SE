package br.com.cap17.documentation;
import static javax.swing.JOptionPane.*;

public class cadastroRevistas {

	public static void main (String []args) {
		
		Revista[] revistas = new Revista[2];
		
		String str ;
		

		for(int i =0;i < revistas.length;i++) {
			
			String str1 = showInputDialog(null,"Revista " + (i+1) + " :titulo");
			if(str1 == null )break;
			String titulo = str1.trim();
			
			str1 =  showInputDialog(null,"Revista " + (i+1) + " :número");
			int numero = Integer.parseInt(str1);
		      
			str1 =  showInputDialog(null,"Revista " + (i+1) + " :ano");
			int ano = Integer.parseInt(str1);
			
			str1 =  showInputDialog(null,"Revista " + (i+1) + " :mês");
			int mes_numero = Integer.parseInt(str1);
		
			
			Meses mes = null;
			
			if(mes_numero == 1)mes = Meses.JANEIRO;
			else if(mes_numero == 2)mes = Meses.FEVEREIRO;
			else if(mes_numero == 3)mes = Meses.MARCO;
			else if(mes_numero == 4)mes = Meses.ABRIL;
			else if(mes_numero == 5)mes = Meses.MAIO;
			else if(mes_numero == 6)mes = Meses.JUNHO;
			else if(mes_numero == 7)mes = Meses.JULHO;
			else if(mes_numero == 8)mes = Meses.AGOSTO;
			else if(mes_numero == 9)mes = Meses.SETEMBRO;
			else if(mes_numero == 10)mes = Meses.OUTUBRO;
			else if(mes_numero == 11)mes = Meses.NOVEMBRO;
			else if(mes_numero == 12)mes = Meses.DEZEMBRO;
			
			revistas[i] = new Revista(titulo,numero,ano,mes); 
			
		}
		String mensagem = "Revistas Cadastradas";
		
		for(Revista revista : revistas) {
			if(revista == null)break;
			mensagem += "\n -"+revista;
		}
		showMessageDialog(null,mensagem);
		System.exit(0);
		
	}
}
