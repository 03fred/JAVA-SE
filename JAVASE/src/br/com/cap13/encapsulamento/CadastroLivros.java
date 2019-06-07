package br.com.cap13.encapsulamento;

import static javax.swing.JOptionPane.*;

public class CadastroLivros {

	public static void main(String[] args) {
    Livro[] registros = new Livro[2];
    Livro li = new Livro();
		String str;
		
    for( int indice = 0 ; indice < registros.length ; indice++) {
    	li = new Livro();
    	while(true) {
    		try {
    			
    			str = showInputDialog("Código do livro");
    			if(str == null)break;
    			li.setCodigo(Integer.parseInt(str));
    			
    			break;
    		}catch(NumberFormatException nfe) {
    			showMessageDialog(null, nfe.getMessage(), "ERRO",1);

    		}catch(IllegalArgumentException iae) {
    			showMessageDialog(null, iae.getMessage(), "ERRO",1);
    		}
    		
    		
    		
    	}
    	
    	if(str == null)break;
    	while(true) {
    		try {
    			
    			str = showInputDialog("Titulo do livro");
    			if(str == null)break;
    			li.setTitulo(str);
    			break;
    		}
    		catch(RuntimeException rte) {
    			showMessageDialog(null, rte.getMessage(), "ERRO",1);
    		}
    		
        	}
    	
    	if(str == null)break;
    	
    	registros[indice] = li;
    	
    	}
    	
    String relatorio = "relatório de livros";
    	
    for(Livro livro : registros) {
    	if(livro == null) break;
    	relatorio += "\n"+livro.getCodigo() + "-" +livro.getTitulo();
    }
   
    showMessageDialog(null, relatorio);
    System.exit(0);
	
	}

}
