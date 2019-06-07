package br.com.cap13.encapsulamento;

public class Assunto {
	
	private int codigo;
	private String descricao;
	
	public Assunto(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String toString() {
		return "Assunto" + this.codigo +":"+ this.descricao;
	}
	

}
