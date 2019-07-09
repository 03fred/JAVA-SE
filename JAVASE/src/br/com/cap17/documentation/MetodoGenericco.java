package br.com.cap17.documentation;

import java.util.Random;

import javax.swing.JOptionPane;

public class MetodoGenericco {
	
	public static <O> void exibirObjeto(O object) {
		String str = "classe do objeto :" +object.getClass().getName()+
	  "\nRepresentação textual: "+object;
		
		JOptionPane.showMessageDialog(null, str);
		
	}

	public static void main(String[] args) {
		Random rd = new Random();
		
		exibirObjeto(rd.nextInt(10000000));
		exibirObjeto(rd.nextDouble()+100);
		exibirObjeto((char)(rd.nextInt(25)+26));
		exibirObjeto("Fred");
	}
	
}
