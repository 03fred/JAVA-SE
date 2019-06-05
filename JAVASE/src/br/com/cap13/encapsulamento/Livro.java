package br.com.cap13.encapsulamento;

public class Livro {
	
	private int codigo;
	private String titulo;
	
	public Livro() {
		this.titulo = "";
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) throws IllegalArgumentException {
		if(codigo < 0 ) throw new IllegalArgumentException("Número não pode ser menor que 0");
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo (String titulo) throws IllegalArgumentException, NullPointerException{
		
		if(titulo == null)throw new NullPointerException("Titulo não pode ser nulo");
		if(titulo.length() < 5 || titulo.length() > 50) throw new IllegalArgumentException("titulo deve"
				+ " haver no mínimo 5 e no máximo 50 caracteres");
		
		this.titulo = titulo;
	}

	
	
	
}
