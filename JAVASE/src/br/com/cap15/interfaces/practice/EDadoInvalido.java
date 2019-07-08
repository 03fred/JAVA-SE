package br.com.cap15.interfaces.practice;


public class EDadoInvalido extends Exception{
	private static final long serialVersionUID = 1L;
	

	
	public EDadoInvalido() {
		super("Dado inválido");
	}
	
	public EDadoInvalido(String mensagem) {
		super("Dado inválido : "+mensagem);
	}
	

}
