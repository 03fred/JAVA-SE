package br.com.cap10.exception;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Try {

	public static void main(String[] args) {
    String str ;
    int quociente =0 ;
    try {
    	
    	str = JOptionPane.showInputDialog("Informe o dividendo");
    	int dividendo  = Integer.parseInt(str);
    	
    	str = JOptionPane.showInputDialog(null,"Informe o divisor");
    	int divisor = Integer.parseInt(str);
    	quociente = dividendo / divisor;
    }catch(Exception ex) {
    	str = "Ocorreu um erro na exceção" +
        "\nTipo: "+ex.getClass()+
        "\nMensagem " +ex.getMessage();
    	JOptionPane.showMessageDialog(null, str, "ERROR",0);
    	System.exit(0);
    	
    }
		
		
JOptionPane.showMessageDialog(null, "Resultado "+quociente);
		
	}

}
