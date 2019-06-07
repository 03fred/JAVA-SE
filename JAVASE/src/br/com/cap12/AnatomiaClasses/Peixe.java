package br.com.cap12.AnatomiaClasses;

public class Peixe {
	
	String nomePopular;
	String nomeCientifico;
	String familia;
	String origem;
	int comprimento;
	
	
	Peixe(String nomePopular,String nomeCientifico, String familia ,String origem ,int comprimento){
		
		this.nomePopular = nomePopular;
		this.nomeCientifico = nomeCientifico;
		this.familia = familia;
		this.comprimento = comprimento;
	}
	
	Peixe(){
		
		nomePopular = "";
		nomeCientifico = "";
		familia = "";
		origem = "";
		
	}
	

}


