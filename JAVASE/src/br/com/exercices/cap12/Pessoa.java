package br.com.exercices.cap12;

public class Pessoa {

	String nome;

	public Pessoa() {

		nome = "";
	}

	boolean validarNomes(String nome){
		
		if(nome.length() < 2 || nome.length() > 50)return false;
		else return true;
	}
	
	String gerarIniciais(String nome) {
		String iniciais ="";
		String[] partes = nome.split(" ");
		
		if(partes.length < 2)iniciais = "nome possui apenas a inicial " +nome.charAt(0);
		else {
			for(String s: partes) {
				char c = s.charAt(0);
				iniciais += " "+String.valueOf(c);

			}
			
		}
		return iniciais;

	}
	
	
}
