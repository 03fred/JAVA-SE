package br.com.cap8.estruturaRepeticao;

import javax.swing.JOptionPane;

public class Compras {

	public static void main(String[] args) {

		String lista = "Lista de compras";
		for (byte nt_item = 1; nt_item <= 5; nt_item++) {
			String str = " Informe o item número "+nt_item;
			str = JOptionPane.showInputDialog(null,str);
			
			if(str == null || str.length() == 0)System.exit(0);
			str = str.trim();
			
			lista += "\n item " + nt_item + ": "+str;
		}
		
		JOptionPane.showMessageDialog(null, lista);
		System.exit(0);
	}

}
