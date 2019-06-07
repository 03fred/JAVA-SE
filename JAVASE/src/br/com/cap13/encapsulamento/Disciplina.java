package br.com.cap13.encapsulamento;

public class Disciplina {

	private int codigo;
	private String descricao;
	
	
	public Disciplina() {
		this.descricao = "";
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		if(codigo < 0)return;
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		if(descricao ==null)return;
		descricao = descricao.trim();
		if(descricao.length() < 5 || descricao.length() > 50)return;
		this.descricao = descricao;
	}
	
	
	
}
