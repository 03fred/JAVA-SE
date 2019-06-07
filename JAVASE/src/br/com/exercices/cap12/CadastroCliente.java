package br.com.exercices.cap12;

import javax.swing.JOptionPane;

public class CadastroCliente {

	static Cliente cli = new Cliente();

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "Digite o nome do cliente";
		try {
			if (str == null) {
				throw new NullPointerException();
			}
			while (true) {
				str = "Digite o nome do cliente";
				str = JOptionPane.showInputDialog(str);
				while (!cli.validarNomes(str)) {
					str = JOptionPane.showInputDialog(null, cli.getMessagem(), "ERROR", 0);
				}
				

				str = "Email do cliente";
				str = JOptionPane.showInputDialog(str);
				while (!cli.validaEmail(str)) {
					str = JOptionPane.showInputDialog(null, cli.getMessagem(), "ERROR", 0);
				}
				
				str = "Telefone do cliente";
				str = JOptionPane.showInputDialog(str);
				while (!cli.validaTelefone(str)) {
					str = JOptionPane.showInputDialog(null, cli.getMessagem(), "ERROR", 0);
				}

				str = "Cpf do cliente";
				str = JOptionPane.showInputDialog(str);
				while (!cli.validaCPF(str)) {
					str = JOptionPane.showInputDialog(null, cli.getMessagem(), "ERROR", 0);
				}

				JOptionPane.showMessageDialog(null, cli.recuperarDados());

			}

		} catch (NullPointerException nb) {
			System.out.println("FIM!");
		}
	}
}
