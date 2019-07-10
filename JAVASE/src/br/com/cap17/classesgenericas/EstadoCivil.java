package br.com.cap17.classesgenericas;

public enum EstadoCivil {

	SOLTEIRO("solteiro",'S'),
	CASADO("casado",'C'),
	DIVORCIADO("divorciado",'D'),
	VIUVO("viuvo",'V');
	
	private String texto;
	private char caracter;
	
	private EstadoCivil(String texto, char caracter) {
		this.texto = texto;
		this.caracter = caracter;
	}

	public String getTexto() {
		return texto;
	}

	public char getCaracter() {
		return caracter;
	}
	
	
	
}
