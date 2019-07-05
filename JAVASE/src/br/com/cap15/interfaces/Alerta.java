package br.com.cap15.interfaces;

public interface Alerta extends Mensagem {
 String DEMORA = "Aguarde um instante ...";
 String FECHAR = "Encerre o programa de forma Correta.";
 
 void exibir(String texto,int icone);
	
	
}
