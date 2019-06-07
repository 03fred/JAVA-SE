package br.com.exercices.cap12;

public class Pessoa {

	private String nome;
	private String messagem;

	public Pessoa() {

		nome = "";
	}

	boolean validarNomes(String nome) {

		if (nome.length() < 2 || nome.length() > 50) {
			messagem = "NOME TEM QUE TER NO MININIMO 2 E NO MÁXIMO 50 CARACTERES";
			return false;

		}

		char[] c = nome.toCharArray();
		for (int i = 0; i < c.length; i++)
			if (Character.isDigit(c[i])) {
				messagem = "NOME NÃO PODE CONTER NÚMEROS";
				return false;
			}
		this.nome = nome;
		return true;
	}

	String gerarIniciais(String nome) {
		String iniciais = "";
		String[] partes = nome.split(" ");

		if (partes.length < 2)
			iniciais = "nome possui apenas a inicial " + nome.charAt(0);

		else {
			for (int i = 0; i < partes.length; i++) {
				if (partes[i].length() > 3) {
					char c = partes[i].charAt(0);
					iniciais += " " + String.valueOf(c).toUpperCase();
				}
			}

		}
		return iniciais;

	}

	public String getMessagem() {
		return messagem;
	}

	public void setMessagem(String messagem) {
		this.messagem = messagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
