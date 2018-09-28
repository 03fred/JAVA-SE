package br.com.cap7.estruturaDecisao;

import javax.swing.JOptionPane;

public class Meses {

	public static void main(String[] args) {

		String  st = "Informe o número de 1 a 12";
		st = JOptionPane.showInputDialog(null,st);
		byte mes = Byte.parseByte(st);
		
		switch(mes)
		{
		case 1:
			st =  "Janeiro";
			break;
		case 2:
			st =  "Fevereiro";
			break;
		case 3:
			st =  "Março";
			break;
		case 4:
			st =  "Abril";
			break;
		case 5:
			st =  "Maio";
			break;
		case 6:
			st =  "Junho";
			break;
		case 7:
			st =  "Julho";
			break;
		case 8:
			st =  "Agosto";
			break;
		case 9:
			st =  "Setembro";
			break;
			
		case 10:
			st =  "outubro";
			break;
		case 11:
			st =  "novembro";
			break;
		case 12:
			st =  "dezembro";
			break;
			
	     default:
	    	 st = "Mês inválido!";
	    	 break;
		
		}
		
		st = "Você escolheu o mês de "+st;
		JOptionPane.showMessageDialog(null, st , "MENSAGEM", 1);
		System.exit(0);
		
	}

}
