package br.com.exercices.cap12;

import javax.swing.JOptionPane;

public class GeradorINiciais {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		String str, nome;

		while(true) {
			nome = "";
			try {
				 str = "Digite seu nome";

			  nome = JOptionPane.showInputDialog(str);
				if(nome.isEmpty())break;
		
				while (!pessoa.validarNomes(nome)) {
					str = "digite um nome entre 2 e 50 caracteres";
					 nome = JOptionPane.showInputDialog(null, "ERROR",str,0);
					if (nome.isEmpty())break;
					pessoa.validarNomes(nome);

				}
				 
				
					
				
				while (!verifica(nome)) {
					str = "digite um nome válido,sem números!";
					 nome = JOptionPane.showInputDialog(null, "ERROR",str,0);
					if (nome.isEmpty())break;
					 verifica(nome);

				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
			try{
				String[] partes = nome.split(" ");

				if(partes.length <= 1) {
					str = " O nome deve ser completo";
					throw new IllegalArgumentException(str);						
				}else {
					JOptionPane.showMessageDialog(null,pessoa.gerarIniciais(nome), "Nome válido",1);

				}
				
				}catch (IllegalArgumentException iae) {
                     
					JOptionPane.showMessageDialog(null, iae.getMessage(), "error", 0);
					
				}

	


		}
		
		
	}

	public static boolean verifica(String nome) {
		char[] c = nome.toCharArray();
		boolean d = true;
		for (int i = 0; i < c.length; i++)
			if (Character.isDigit(c[i])) {
				d = false;
				break;
			}

		return d;
	}

}
