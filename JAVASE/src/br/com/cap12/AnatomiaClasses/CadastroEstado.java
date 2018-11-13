package br.com.cap12.AnatomiaClasses;

import javax.swing.JOptionPane;

public class CadastroEstado {

	public static void main(String[] args) {

		Estado estado = new Estado();
		String str = JOptionPane.showInputDialog("Nome do estado");
		if(str == null)System.exit(0);
        estado.nome = str;
        
        str = JOptionPane.showInputDialog("sigla do estado");
        if(str== null)System.exit(0);
        estado.sigla = str;
        estado.exibirDados();
		
	}

}
