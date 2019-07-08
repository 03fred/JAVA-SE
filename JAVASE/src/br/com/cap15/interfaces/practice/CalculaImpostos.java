package br.com.cap15.interfaces.practice;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class CalculaImpostos implements Aliquotas{
	
	public static void main (String[] args) {
		String str = "Digite o faturamento da empresa ";
		double faturamento = 0 ;
		str = JOptionPane.showInputDialog(null, str);
		while (true) {
			try {
			faturamento = Double.parseDouble(str);
			break;
			}catch(NumberFormatException nb) {

				str = JOptionPane.showInputDialog(null, "ERROR",nb.getMessage(),0);
			}
			
		}
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		str = "Faturamento: R$"+nf.format(faturamento)+
				"\nCONFINS :R$"+nf.format(faturamento * CONFINS)+
				"\nPIS: R$"+nf.format(faturamento * PIS_FATURAMENTO)+
				"\nSoma dos impostos"+nf.format(faturamento * CONFINS + faturamento * PIS_FATURAMENTO );
		JOptionPane.showMessageDialog(null,String.valueOf(str));
		System.exit(0);
		
	}
	
}
