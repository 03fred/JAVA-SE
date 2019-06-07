package br.com.cap13.encapsulamento;

import javax.swing.JOptionPane;

public class TestaLivro {
	public static void main(String[] args) {

		Livro di = new Livro();
		String str = "Dados da disciplina:";
		str += "\n" + di.getCodigo() +": "+di.getTitulo();
		
		JOptionPane.showMessageDialog(null,str);
		
		di.setCodigo(1);
		di.setTitulo("Programação 3");
		
		str = "Dados da disciplina:";
		str += "\n" + di.getCodigo() +": "+di.getTitulo();
		
		JOptionPane.showMessageDialog(null,str);
		
		di.setCodigo(-15);
		di.setTitulo("Pro");
		
		
		str = "Dados da disciplina:";
		str += "\n" + di.getCodigo() +": "+di.getTitulo();
		
		JOptionPane.showMessageDialog(null,str);
		System.exit(0);
		
	}
}
