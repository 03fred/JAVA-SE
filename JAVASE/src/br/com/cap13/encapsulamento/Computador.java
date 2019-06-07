package br.com.cap13.encapsulamento;

public class Computador {
	private int codigo;
	private String descricao;

	public Computador(int codigo, String descricao) throws Exception {

		if (codigo < 0)
			throw new IllegalArgumentException("Codigo não pode ser menor que zero");
		if (descricao == null)
			throw new Exception("Descrição nula");

		if (descricao.length() < 5 || descricao.length() > 50)
			throw new Exception("No mínimo 5 e no máximo 50 caracteres");
		this.codigo = codigo;
		this.descricao = descricao.trim();

	}

	@Override
	public String toString() {
		return "Computador [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
