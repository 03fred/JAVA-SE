package br.com.cap17.documentation;
import static javax.swing.JOptionPane.*;

public class CadastroAmigos {

	public static void main(String[] args) {
		Amigo[] cadastros =new Amigo[2];
		
		for(int i =0;i < cadastros.length;i++) {
			
			String str1 = showInputDialog(null,"Amigo " + (i+1) + " :nome");
			if(str1 == null )break;
			String nome = str1.trim();
			
			str1 =  showInputDialog(null,"Amigo " + (i+1) + " :fone");
			String fone = str1.trim();
			
			cadastros[i]=new Amigo(nome, fone);
		}
		
		
		String mensagem = "Lista de amigos";
		
		for(Amigo am :cadastros) {
			if(am == null)break;
			mensagem += "\n -"+am;
		}

		showMessageDialog(null, mensagem);
		System.exit(0);
	}
	
}class Amigo{
	
	private String nome;
	private String fone;
	
	public Amigo(String nome, String fone) {
		super();
		this.nome = nome;
		this.fone = fone;
	}

	@Override
	public String toString() {
		return "Amigo [nome=" + nome + ", fone=" + fone + "]";
	}
	

	
	
}
