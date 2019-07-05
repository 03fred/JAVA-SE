package br.com.cap15.interfaces;

import javax.swing.JOptionPane;

public class TesteAlerta extends TesteMensagem implements Alerta{

	public static void main(String[] args) {
		TesteAlerta teste = new TesteAlerta();
		teste.exibir(ENTRADA);
		teste.exibir(FECHAR, JOptionPane.WARNING_MESSAGE);
		teste.exibir(DEMORA, JOptionPane.WARNING_MESSAGE);
		
		try { 
			Thread.sleep(3000);
			
		}catch(Exception ex) {
		}
		teste.exibir(SUCESSO);
		System.exit(0);
	}

	@Override
	public void exibir(String texto, int icone) {

		JOptionPane.showMessageDialog(null, texto,"Atenção",icone);
		
		
	}

}
