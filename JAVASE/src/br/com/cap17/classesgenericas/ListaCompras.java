package br.com.cap17.classesgenericas;

import static javax.swing.JOptionPane.*;

public class ListaCompras {

	public static VetorObjetos<String> vetor;

	public static void main(String[] args) {

		String str = showInputDialog("Número máxmo de itens na lista");
		if (str == null)
			System.exit(0);

		int maximo = Integer.parseInt(str);

		vetor = new VetorObjetos<String>(maximo);

		while (true) {

			int opcao = showOptionDialog(null, "Escolha uma opcao", "Lista de compras", 0, 1, null,
					new String[] { "Incluir Item", "Excluir Item", "Esvaziar Lista", "Consultar Último", "Ver Lista" },
					"Incluir item");

			if (opcao == -1)
				System.exit(0);
			else if (opcao == 0)
				incluir();
			else if (opcao == 1)
				excluir();
			else if (opcao == 2)
				esvaziar();
			else if (opcao == 3)
				consultar();
			else if (opcao == 4)
				listar();
		}

	}

	private static void listar() {
		if (vetor.vazio()) {
			showMessageDialog(null, "ERROR", "LISTA VAZIA", ERROR_MESSAGE);
			return;
		}

		showMessageDialog(null, vetor.listarObjetos());

	}

	private static void consultar() {
		if (vetor.vazio()) {
			showMessageDialog(null, "ERROR", "LISTA VAZIA", ERROR_MESSAGE);
			return;
		}

		showMessageDialog(null, vetor.verUltimo());

	}

	private static void esvaziar() {
		if (vetor.vazio()) {
			showMessageDialog(null, "ERROR", "LISTA VAZIA", ERROR_MESSAGE);
			return;
		}
		vetor.excluirTodos();
		showMessageDialog(null, "Agora a lista esta vazia");

	}

	private static void excluir() {

		if (vetor.vazio()) {
			showMessageDialog(null, "ERROR", "LISTA VAZIA", ERROR_MESSAGE);
			return;
		}

		showMessageDialog(null, vetor.excluirUltimo());
	}

	private static void incluir() {
		if (vetor.cheio()) {
			showMessageDialog(null, "ERROR", "LISTA CHEIA", ERROR_MESSAGE);
			return;
		}
		String str = showInputDialog("novo item");
		if (str == null)
			return;
		vetor.incluirObjeto(str);

	}

}
