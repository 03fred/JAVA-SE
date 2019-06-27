package br.com.cap13.encapsulamento;


public class Atleta {
	
	private String nome;
	private byte sexo;
	public static final byte SEXO_MASCULINO = 1;
	public static final byte SEXO_FEMININO = 2;

	public Atleta(String nome , byte sexo) {
		this.nome ="";
		this.nome = nome;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		
		String str;
		str = sexo == SEXO_MASCULINO ? str = "Masculino" : "Feminino";
		return "Atleta [nome=" + nome + "sexo= " + str;
	    
				
	}
	
	

}
