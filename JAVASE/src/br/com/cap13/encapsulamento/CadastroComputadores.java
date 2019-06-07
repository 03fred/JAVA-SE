package br.com.cap13.encapsulamento;

import static javax.swing.JOptionPane.*;

public class CadastroComputadores {
	public static void main(String[] args) {
		Computador[]computadores = new Computador[3];
		
		for(int i = 0; i < computadores.length;i++) {
			Computador comp = null;
			int codigo = 0;
			
			String str,descricao = null;
			
			String nr = "Computador "+(i+1)+": ";
			
			while(true) {
				
				str = showInputDialog(nr+"codigo");
				if(str == null)break;
				try {
					codigo = Integer.parseInt(str);
					break;
				}catch(NumberFormatException nfe) {
					
					showMessageDialog(null, "Número não pode conter caracteres","ERROR",0);
					continue;
					
				}
			}
			while(true) {
				str = showInputDialog(nr+"descricao");
				
				if(str == null)break;
				try {
					descricao = str;

					comp = new Computador(codigo,descricao);
					break;
				}
				catch (Exception e) {
					showMessageDialog(null, e.getMessage(),"ERROR",0);
					continue;
				}
			}
			
			
			if(str == null)break;
			computadores[i] = comp;
			
			
		}
		
		String relatorio = "Relatório de computadores";
		for(Computador cop : computadores) {
			if(cop == null)break;
			relatorio +="\n"+cop;
			
		}
		showMessageDialog(null, relatorio);
		System.exit(0);
	}

}
