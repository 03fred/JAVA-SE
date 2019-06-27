package br.com.cap13.exercices;

import static javax.swing.JOptionPane.*;

public class CadastroGeneros {

	public static void main(String[] args) {
		Genero[] generos = new  Genero[3];
		String str;
		String aux = "";
	  for(int i =0; i< generos.length;i++) {
		  str = "Código do genêro";
		  Genero gen = new Genero();
		str = showInputDialog(str);
		if(str == null)break;
		gen.setCodigo(Integer.parseInt(str));
		
		str = "Descricao do genêro";
		str = showInputDialog(str);
		if(str == null)break;
	    gen.setDescricao(str);	
    		
		aux += "\n"+ gen.toString();
		  
	  }
	
		showMessageDialog(null, aux);
		
		

	}

}
