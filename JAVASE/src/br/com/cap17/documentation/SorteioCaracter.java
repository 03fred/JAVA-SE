package br.com.cap17.documentation;

import java.util.Random;

import javax.swing.JOptionPane;

public class SorteioCaracter {

	private static enum TipoCaractere {
		NUMERO, LETRA_MAIUSCULA, LETRA_MINUSCULA, OUTRO
	};

	public static void main(String[] args) {

		int num = new Random().nextInt(150);
        char caractere = (char)num;
        
        TipoCaractere tipo;
        
        if(caractere >= '0' && caractere <= '9')
        	tipo = TipoCaractere.NUMERO;
        else if(caractere >= 65 && caractere <= 90)
        	tipo = TipoCaractere.LETRA_MINUSCULA;
        else if(caractere >= 97 && caractere <= 122)
        	tipo = TipoCaractere.LETRA_MAIUSCULA;
        else tipo = TipoCaractere.OUTRO;
        
        String str = "Caractere sorteado :"+caractere+"\ntipo :";
        switch(tipo) {
        case NUMERO: str += "Numero";break;
        case LETRA_MAIUSCULA: str += "Letra Maiscúla";break;
        case LETRA_MINUSCULA: str += "Letra Minúscula";break;
        case OUTRO: str += "Outro";break;
        }
	JOptionPane.showMessageDialog(null, str);
        
	}

}
