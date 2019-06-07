package br.com.cap13.exercices;

import static javax.swing.JOptionPane.*;

public class cadastroFornecedor {

	public static void main(String[] args) {
		Fornecedor[] registros = new Fornecedor[3];
		Fornecedor forn = new Fornecedor();
		String aux = "", str = "";
		for (int i = 0; i < registros.length; i++) {
			while (true) {
				str = "Digite o codigo";
				str = showInputDialog(str);
				if (str == null)
					break;
				try {
					forn.setCodigo(Integer.parseInt(str));
					break;
				} catch (Exception ex) {

					showMessageDialog(null, ex.getMessage(), "ERROR", 0);
					continue;
				}
			}

			if (str == null)
				break;

			while (true) {
				str = "Digite a razão social";
				str = showInputDialog(str);
				if (str == null)
					break;
				try {
					forn.setRazaoSocial(str);
					;
					break;
				} catch (Exception ex) {

					showMessageDialog(null, ex.getMessage(), "ERROR", 0);
					continue;
				}
			}

			while (true) {
				str = "Digite o telefone";
				str = showInputDialog(str);
				if (str == null)
					break;
				try {
					forn.setTelefone(str);
					;
					break;
				} catch (Exception ex) {

					showMessageDialog(null, ex.getMessage(), "ERROR", 0);
					continue;
				}
			}
			while (true) {
				str = "Digite o email";
				str = showInputDialog(str);
				if (str == null)
					break;
				try {
					forn.setEmail(str);
					;
					break;
				} catch (Exception ex) {

					showMessageDialog(null, ex.getMessage(), "ERROR", 0);
					continue;
				}
			}

			aux += forn.toString();
		}

		showMessageDialog(null, aux);
		System.exit(0);

	}

}
