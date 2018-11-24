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
			for(int i = 0; i < partes.length;i++) {
				if(partes[i].length() > 3) {
				char c = partes[i].charAt(0);
				iniciais += " "+String.valueOf(c).toUpperCase();
				}
			}
			
		}
		return iniciais;

	}
	
	
}
