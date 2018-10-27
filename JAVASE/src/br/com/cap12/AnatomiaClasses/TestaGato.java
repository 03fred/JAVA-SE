package br.com.cap12.AnatomiaClasses;

import javax.swing.JOptionPane;

public class TestaGato {
	public static void main(String[]args) {
		
	
		Gato gato1 = new Gato("Sitio",'F',12,12.4);
		
		
		String str =  "Dados do meu gato";
		str += "\nNome: "+gato1.nome;
		str += "\nSexo ";
		str +=  gato1.sexo == 'M'?"MACHO" : "FEMEA";
		str += "\nIdade: "+ gato1.idade + " anos";
		str += "\nPeso " + gato1.peso + " KG";
		JOptionPane.showMessageDialog(null, str);
		System.exit(0);
		
		
	}

}
