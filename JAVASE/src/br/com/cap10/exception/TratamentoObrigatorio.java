package br.com.cap10.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TratamentoObrigatorio {

	public static void main(String[] args){

		String texto = "";
		FileReader fr = null;
		
		
		try {
			fr= new FileReader("/home/fred/git/JAVA-SE/JAVASE/src/br/com/cap10/exception/Excecao.java");
		}catch(FileNotFoundException fnt) {
			System.out.println("Arquivo não encontrado");
			System.exit(0);
		}
		
		try {
			BufferedReader bf =  new BufferedReader(fr);
		while(true) {
			String linha = bf.readLine();
			if(linha == null)break;
			texto += linha + "\n";
		}
		
		bf.close();
		fr.close();
		System.out.println(texto);
		
	
	}catch(IOException ioex){
		System.out.println("Error durante a leitura do arquivo");
		System.exit(0);
	}
		
		System.exit(0);
	}
}
