package br.com.cap8.estruturaRepeticao;

import javax.swing.JOptionPane;

public class Musicas {

	public static void main(String[] args) {

		String lista = "Lista de músicas";
		for (byte numero = 1; numero <= 10; numero++) {

			String str, artista = "", musica = "";
			while (true) {

				str = "musica " + numero + " nome do artista ";
				str = JOptionPane.showInputDialog(null, str);
				if (str == null)
					break;
				artista = str.trim().toUpperCase();

				if (artista.length() < 2 || artista.length() > 30) {
					str = " O Nome informado é inválido ";
					JOptionPane.showMessageDialog(null, str, "Mensagem", 0);
					continue;
				}

				break;
			}

			if (str == null)
				break;
			while (true) {

				str = "musica " + numero + " nome da musica";
				str = JOptionPane.showInputDialog(null, str);
				if (str == null)
					break;
				musica = str.trim().toLowerCase();

				if (musica.length() < 2 || musica.length() > 30) {
					str = " O Nome informado é inválido ";
					JOptionPane.showMessageDialog(null, str, "Mensagem", 0);
					continue;
				}

				break;
			}
			
			
			if(str == null)break;
			lista +="\n"+artista+" - "+musica;
		}

		JOptionPane.showMessageDialog(null,lista);
		System.exit(0);
	}

}
