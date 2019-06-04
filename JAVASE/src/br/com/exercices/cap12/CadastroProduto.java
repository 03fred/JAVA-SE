package br.com.exercices.cap12;

import javax.swing.JOptionPane;

public class CadastroProduto {

	static Produto produto = new Produto();

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "Digite o nome do cliente";
		try {
			if (str == null) {
				throw new NullPointerException();
			}
			while (true) {
				str = "Digite o codigo do produto";
				str = JOptionPane.showInputDialog(str);
				while (!produto.validarCodigo(str)) {
					str = JOptionPane.showInputDialog(null, produto.getMessagem(), "ERROR", 0);
				}
				

				str = "Preço do produto";
				str = JOptionPane.showInputDialog(str);
				while (!produto.validarPreco(str)) {
					str = JOptionPane.showInputDialog(null, produto.getMessagem(), "ERROR", 0);
				}
				
				str = "Descrição do produto";
				str = JOptionPane.showInputDialog(str);
				while (!produto.validarNomes(str)) {
					str = JOptionPane.showInputDialog(null, produto.getMessagem(), "ERROR", 0);
				}

				produto.setDescricao(str);
				JOptionPane.showMessageDialog(null, produto.recuperarDados());

			}

		} catch (NullPointerException nb) {
			System.out.println("FIM!");
		}
	}
}
