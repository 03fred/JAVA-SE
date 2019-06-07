package br.com.cap12.AnatomiaClasses;

import javax.swing.JOptionPane;

public class CadastroEstados {
	
	public static void main(String[] args) {
		
		Estado[] registros =  new Estado[3];
		for(int indice  = 0;indice < registros.length;indice++ ) {
			Estado estado = new Estado();
			String  str = JOptionPane.showInputDialog("Nome do estado");
			if(str ==null)break;
			estado.nome = str;
			
			str = JOptionPane.showInputDialog("sigla do estado");
			if(str == null)break;
			estado.sigla =  str;
			registros[indice] = estado;
			
			
			
		}
		
		
		
		String relatorio = "Relatório de estados :";
		for(int posicao = 0; posicao < registros.length;posicao++) {
			Estado estado = registros[posicao];
			relatorio += "\n" + estado.recuperaDados();
			
		}
		
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
	}

}
