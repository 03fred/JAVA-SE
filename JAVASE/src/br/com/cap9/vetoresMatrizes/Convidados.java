package br.com.cap9.vetoresMatrizes;

import javax.swing.JOptionPane;

public class Convidados {

	public static void main(String[] args) {

		String[] convidados = new String[20];

		for (int numero = 1; numero <= convidados.length; numero++) {
			String str = "Convidado" + numero;
			str = JOptionPane.showInputDialog(str);
			if (str == null)
				break;
			str = str.trim();
			convidados[numero - 1] = str;

		}

		String mensagem = "Relação de convidados: ";
		for (int posicao = 0; posicao < convidados.length; posicao++) {
			if (convidados[posicao] == null)
				break;
			mensagem += "\n-" + convidados[posicao];

		}
		JOptionPane.showMessageDialog(null, mensagem);
		System.exit(0);

	}
}
