package br.com.cap17.documentation;

public class Revista {
	
	private String titulo;
	private int numero;
	private int ano;
	private Meses mes;
	
	public Revista(String titulo, int numero, int ano, Meses mes) {
		super();
		this.titulo = titulo;
		this.numero = numero;
		this.ano = ano;
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "Revista [titulo=" + titulo + ", numero=" + numero + ", ano=" + ano + ", mes=" + mes + "]";
	}
		
}
