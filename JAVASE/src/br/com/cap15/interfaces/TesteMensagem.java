package br.com.cap15.interfaces;

import javax.swing.JOptionPane;

public class TesteMensagem implements Mensagem{

	public static void main(String[] args) {
		TesteMensagem teste = new TesteMensagem();
		teste.exibir(ENTRADA);
		teste.exibir(SUCESSO);

	}
	

	@Override
	public void exibir(String texto) {
		JOptionPane.showMessageDialog(null, texto,"Mensagem",1);
		
	}

}
