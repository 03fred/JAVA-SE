package br.com.cap17.documentation;

public enum Meses {

	JANEIRO(1, "janeiro", "jan."), 
	FEVEREIRO(2, "fevereiro", "fev."),
	MARCO(3,"março","mar."),
	ABRIL(4,"abril","abr."),
	MAIO(5,"maio","mai."),
	JUNHO(6,"junho","jun."),
	JULHO(7,"julho","jul."),
	AGOSTO(8,"agosto","ago."),
	SETEMBRO(9,"setembro","set."),
	OUTUBRO(10,"outubro","out."),
	NOVEMBRO(11,"novembro","nov."),
	DEZEMBRO(12,"dezembro","dez.");
	
	
	private int numero;
	private String extensao;
	private String abreviado;
	private Meses(int numero, String extensao, String abreviado) {
		this.numero = numero;
		this.extensao = extensao;
		this.abreviado = abreviado;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getExtensao() {
		return extensao;
	}
	public String getAbreviado() {
		return abreviado;
	}
	
	
}
