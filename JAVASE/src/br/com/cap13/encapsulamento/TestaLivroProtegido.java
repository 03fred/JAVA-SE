package br.com.cap13.encapsulamento;

import javax.swing.JOptionPane;

public class TestaLivroProtegido {
	public static void main(String[] args) {

		Livro di = new Livro();
		String str = "Dados da disciplina:";
		str += "\n" + di.getCodigo() +": "+di.getTitulo();
		
		JOptionPane.showMessageDialog(null,str);
		try {		
		di.setCodigo(-15);
		di.setTitulo("Pro");
		}catch(RuntimeException rte) {
			JOptionPane.showMessageDialog(null, rte.getMessage(),"Error",0);
			System.exit(0);
		}
		
		str = "Dados da disciplina:";
		str += "\n" + di.getCodigo() +": "+di.getTitulo();
		
		JOptionPane.showMessageDialog(null,str);
		System.exit(0);
		
	}
}
