package br.com.cap17.documentation;

import javax.swing.JOptionPane;

/** 
 * Essa classe visa ilustrar o uso de comentários comuns
 * de documentação
 * @author fred
 * @version 1*/
public class Documentacao {
	/** Armazena um texo qualquer
	 * @see java.lang.String*/
	
	private String texto;

	/**Construtor padrão da classe. Ele atribui o conteúdo 
	 * de seu parametro texto ao atributo texto da classe.
	 * @param texto O texto a ser atribuido ao atributo texto.
	 * */
	
	
	public Documentacao (String texto) {
		this.texto  = texto;
	}
	
	/** Esse método inverte o conteúdo do atributo texto
	 * @return uma <code>String</code> com o conteúdo
	 * invertido do atributo texto */
	
	public String inverso() {
		String str = "";
		for(int i =0;i < texto.length();i++) str = texto.charAt(i)+str;
		return str;
	}
	
	/**Metodo que torna esta classe executável e permite testá-la 
	 * Cria uma instância da classe Documentacao e a usa para 
	 * exibir o inverso da palavra informada 
	 * @see javax.swing.JOptionPane */
	public static void main(String [] args) {
		
		String str = JOptionPane.showInputDialog("Informe uma palavra");
		if(str == null)System.exit(0);
		
		Documentacao dc = new Documentacao(str);
		
		str = dc.inverso();
		JOptionPane.showMessageDialog(null, str);
		System.exit(0);
	}
	
}
