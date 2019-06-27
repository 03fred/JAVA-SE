package br.com.cap14.HerancaPolimorfismo;

public class Cliente {
	
	private String nome;
	private String fone;
	
	public Cliente() {}

	public Cliente(String nome, String fone) {
		super();
		this.nome = nome;
		this.fone = fone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	

}
