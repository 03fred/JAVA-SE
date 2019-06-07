package br.com.cap12.AnatomiaClasses;

import javax.swing.JOptionPane;

public class CadastroEstadoValidacao {

	public static void main(String[] args) {

		Estado[] registros = new Estado[4];
		String relatorio = "Relatório de estados:";

		for (int indice = 0;indice < registros.length;indice++) {
			
			
			Estado estado= new Estado();
			String str;

			while(true) {
				str = JOptionPane.showInputDialog("Nome do estado");
				if(str == null)break;
				if(estado.validarNomes(str)){
					estado.nome = str.trim();
					break;
					
				}
				
			}
			if(str == null)break;
			while(true) {
				str = JOptionPane.showInputDialog("Sigla do estado");
				if(str == null)break;
				if(estado.validarSigla(str)) {
					estado.sigla = str.trim();
					break;
				}
				
			}
			
			if(str ==null)break;
			registros[indice] = estado;
			
			for(int posicao = 0;posicao < registros.length;posicao++) {
				 estado = registros[posicao];
				if(estado ==null)break;
				relatorio += "\n" + estado.recuperaDados();
				
				
			}
			
			
		}
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
		
		
	}

}
