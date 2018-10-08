package br.com.cap9.vetoresMatrizes;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercice {

	static Random rdm = new Random();
	static java.io.PrintStream saida = System.out;

	public static void main(String[] args) {

		//exercicio01();
         //exercicio02();
		exercicio03();
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

	
	public static void exercicio03() {
 

		int numero = 0;
		while (numero <= 0) {
			String str = "Numero de contatos";
			str = JOptionPane.showInputDialog(str);
			if (str == null)
				System.exit(0);
			numero = Integer.parseInt(str);

		}

		String[][] lista = new String[numero][2];

		String str = "";
		for (int i = 1; i <= lista.length; i++) {
			while (true) {
				str = "Contato " + i + ": nome";
				str = JOptionPane.showInputDialog(str);
				if (str == null)
					break;
				str = str.trim();
				if (str.length() >= 2 && str.length() <= 50) {
					lista[i - 1][0] = str;
					break;
				}

			}

			if (str == null)
				break;
			String codigo ="";

			while (true) {

				
				char[] caracteres = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
						'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
				for(int it = 1; it <= 8;it++) 
					codigo += caracteres[rdm.nextInt(8)];
					
				
				
			
					lista[i - 1][1] = codigo;
					break;
				

			}
			
		}

		str = "Lista de contato: ";
		for(int i = 0 ;i<lista.length;i++)
		{
			if(lista[i][1] == null)break;
			str += "\n" + lista[i][0] + " - "+lista[i][1];
		}
		
		JOptionPane.showMessageDialog(null, str);
		System.exit(0);
	}
		
		
	}

