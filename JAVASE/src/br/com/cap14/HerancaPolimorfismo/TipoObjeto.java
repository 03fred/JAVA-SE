package br.com.cap14.HerancaPolimorfismo;

import javax.swing.JOptionPane;

public class TipoObjeto {

	public static void main(String[] args) {

		Veiculo v1 = new Onibus("k12-b7", 2016, 20);

		String str = "Tipo v1";

		if (v1 instanceof Onibus)
			str += "Onibus";
		JOptionPane.showMessageDialog(null, str);

		Veiculo v2 = new Caminhao("k12-b7", 2016, 20);

		str = "Tipo v2";

		if (v2 instanceof Onibus)
			str += "Onibus";
		else if (v2 instanceof Caminhao)
			str += "Caminhao";
		JOptionPane.showMessageDialog(null, str);

		System.exit(0);

	}

}
