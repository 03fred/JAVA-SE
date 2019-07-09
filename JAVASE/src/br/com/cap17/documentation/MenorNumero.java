package br.com.cap17.documentation;

import javax.swing.JOptionPane;

public class MenorNumero {

	public static <L extends Number> L localizaMenor(L[]valores) {
		L menor = null;
		
		for (L valor: valores)
			if(menor == null || menor.doubleValue() > valor.doubleValue())
				menor = valor;
	
		return menor;
	}
	
	public static void main (String[] args) {
		Integer i = localizaMenor(new Integer[] {4,2,7,5});
		JOptionPane.showMessageDialog(null, "menor Integer"+i);
		
		double d =  localizaMenor(new Double[] {4.6,2.6,7.2,5.4});
		
		JOptionPane.showMessageDialog(null, "menor Double"+d);
		}
	
	
}
