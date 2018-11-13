package br.com.cap12.AnatomiaClasses;

import javax.swing.JOptionPane;

public class TestaPeixe {

	public static void main(String[] args) {

		Peixe espada = new Peixe();
		espada.nomePopular = "Espada";
		espada.nomeCientifico = "Xiphophorus";
		espada.familia = "Poecilícideos";
		espada.origem = "América Central";
		espada.comprimento = 13;

		Peixe beijador = new Peixe("Beijador", "Helostoma", "Anabantídeos", "Java e Tailandia", 30);

		String str = "dados do primeiro peixe: \n" + "\nNome popular: " + espada.nomePopular + "\nNome Cientifico: "
				+ espada.nomeCientifico + "\nFamilia: " + espada.familia + "\nOrigem: " + espada.origem
				+ "\nComprimento : " + espada.comprimento;

		JOptionPane.showMessageDialog(null, str);

		str = "dados do segundo peixe: \n" + "\nNome popular: " + beijador.nomePopular + "\nNome Cientifico: "
				+ beijador.nomeCientifico + "\nFamilia: " + beijador.familia + "\nOrigem: " + beijador.origem
				+ "\nComprimento : " + beijador.comprimento;

		JOptionPane.showMessageDialog(null, str);

	}

}
