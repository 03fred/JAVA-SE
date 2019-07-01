package br.com.cap14.herancaPolimorfismo.folhaPagemnto;

public class EdadoInvalido extends Exception {

	private static final long serialVersionUID = 1L;

	public EdadoInvalido() {

		super("Dado Inválido");

	}

	public EdadoInvalido(String mensagem) {

		super("Dado Inválido " + mensagem);

	}

}
