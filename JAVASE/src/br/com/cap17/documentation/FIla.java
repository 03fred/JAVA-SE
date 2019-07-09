package br.com.cap17.documentation;

import javax.swing.JOptionPane;

public class FIla {

	private int ficha;
	private String nome;
	
	public FIla(int ficha, String nome) {
		super();
		this.ficha = ficha;
		this.nome = nome;
	}

	public void exibirDados() {
		String st = "Ficha " +ficha+ ": "+nome;
		JOptionPane.showMessageDialog(null, st,"Mensagem",1);
		
	}
	
	
	
	public static void main(String[] args) {
		
		new FIla(10,"Adriana").exibirDados();
		new FIla(11,"Rui").exibirDados();
		System.exit(0);
	}

}
