package br.com.cap17.classesgenericas.practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class GeradorNumeros {

	public static void main(String[] args) {

		Random rand = new Random();
		int randomNum = rand.nextInt((10 - 5) + 1) + 5;
		Integer[] vetor = new Integer[randomNum];

		for (int i = 0; i < vetor.length; i++) {
			int num = rand.nextInt((1500 - 1000) + 1) + 1000;
			vetor[i] = num;
		}

		String str = "";
		for (Integer in : vetor) {
			str += "[" + in + "]";

		}

		JOptionPane.showMessageDialog(null, str);
	}

}
