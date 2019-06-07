package br.com.cap13.encapsulamento;

import javax.swing.JOptionPane;

public class TestaDisciplina {

	public static void main(String[] args) {

		Disciplina di = new Disciplina();
		String str = "Dados da disciplina:";
		str += "\n" + di.getCodigo() +": "+di.getDescricao();
		
		JOptionPane.showMessageDialog(null,str);
		
		di.setCodigo(1);
		di.setDescricao("Programação 3");
		
		str = "Dados da disciplina:";
		str += "\n" + di.getCodigo() +": "+di.getDescricao();
		
		JOptionPane.showMessageDialog(null,str);
		
		di.setCodigo(-15);
		di.setDescricao("Pro");
		
		
		str = "Dados da disciplina:";
		str += "\n" + di.getCodigo() +": "+di.getDescricao();
		
		JOptionPane.showMessageDialog(null,str);
		System.exit(0);
		
	}

}
