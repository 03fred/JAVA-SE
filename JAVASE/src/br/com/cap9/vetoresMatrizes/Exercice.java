package br.com.cap9.vetoresMatrizes;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercice {

	static Random rdm = new Random();
	static java.io.PrintStream saida = System.out;

	public static void main(String[] args) {

		//exercicio01();
          exercicio02();
	}

	public static void exercicio01() {

		int[] numero  = new int[8];
		String veto ="";

	
		for (int i = 1 ; i < numero.length;i++) {
			numero[i] = i;
			String codigo = "";
			veto += " " + numero[rdm.nextInt(6)] ;

			
	}
		
             JOptionPane.showMessageDialog(null, veto);
	
	}

	public static void exercicio02() {

		String str = "Digite o nome: ";
		String[] nome = new String[3];
		int it;
		for(int i = 0; i < nome.length;i++) {
			str = "Digite o nome: ";
			str =  JOptionPane.showInputDialog(str);
			nome[i] = str.trim();
		}
	
		it = rdm.nextInt(nome.length);
		saida.println(nome[it]);
	}

}
