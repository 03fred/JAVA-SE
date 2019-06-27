package br.com.cap14.HerancaPolimorfismo;

import javax.swing.JOptionPane;
public class CadastroClientePessoa {

	public static void main(String[] args) {

		ClientePessoa celso = new ClientePessoa();
		celso.setNome(new String("Celso Miranda"));
		celso.setFone(new String("34984381917"));
		celso.setRg(new String("4.456.879-4"));
		celso.setCpf(new String("415.485.66725"));
		
		String str = "Dados do cliente\n"+
		"Nome :"+celso.getNome()+
		"\nFone :"+celso.getFone()+
		"\nRg: "+celso.getRg()+
		"\nCPF: "+celso.getCpf();
		 JOptionPane.showMessageDialog(null, str,"Mensagem",1);
		 
		 System.exit(0);
		
	}

}
