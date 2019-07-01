package br.com.cap14.HerancaPolimorfismo;

import javax.swing.JOptionPane;

public class ConsultaClasse {
	
	public static void main(String[] args) {
		
		Veiculo v1 = new Onibus("abcdg-2", 2019, 15);
		Veiculo v2 = new Caminhao("abcdg-2", 2019, 4);
		JOptionPane.showMessageDialog(null, v1.getClass().getName());
		JOptionPane.showMessageDialog(null, v2.getClass().getName());
		
		System.exit(0);

	}

}
