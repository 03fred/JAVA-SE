package br.com.cap8.estruturaRepeticao;

import javax.swing.JOptionPane;

public class Tarefas {

	public static void main(String[] args) {

		String lista = "Lista de Tarefas";
		
		for (int nt_item = 1; nt_item <= 5; nt_item++) {
			String str = " Tarefa numero "+nt_item;
			str = JOptionPane.showInputDialog(null,str);
			
			if(str == null || str.length() == 0)break;
			str = str.trim();
			
			lista += "\n item " + nt_item + ": "+str;
		}
		
		JOptionPane.showMessageDialog(null, lista);
		System.exit(0);
	}

}
