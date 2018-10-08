package br.com.cap10.exception;

import javax.swing.JOptionPane;

public class TratamentoMultiplo {

	public static void main(String[] args) {
	    String str ;
	    int quociente =0 ;
	    try {
	    	
	    	str = JOptionPane.showInputDialog("Informe o dividendo");
	    	int dividendo  = Integer.parseInt(str);
	    	
	    	str = JOptionPane.showInputDialog(null,"Informe o divisor");
	    	int divisor = Integer.parseInt(str);
	    	quociente = dividendo / divisor;
	    
	    
	    }catch(NumberFormatException nf) {
	    	str = "Número inválido" ;
	    	JOptionPane.showMessageDialog(null, str, "ERROR",0);
	    	System.exit(0);
	    	
	    }
	    catch(ArithmeticException ar) {
	    	str = "O divisor não pode ser zero" ;
	    	JOptionPane.showMessageDialog(null, str, "ERROR",0);
	    	System.exit(0);
	    	
	    }
			
			
	JOptionPane.showMessageDialog(null, "Resultado "+quociente);
			
		}
	
	}


