package br.com.cap13.exercices;

public class Genero {
	
	private int codigo;
	private String descricao;
	
	public Genero() {
		this.descricao ="";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Genero [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

	
}
