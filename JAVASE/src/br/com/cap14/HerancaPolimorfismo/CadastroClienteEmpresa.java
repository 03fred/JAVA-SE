package br.com.cap14.HerancaPolimorfismo;

import javax.swing.JOptionPane;

public class CadastroClienteEmpresa {

	public static void main(String[] args) {

		ClienteEmpresa clienteEmpresa = new ClienteEmpresa();
		String str ;
        str = "nome da empresa";
        str = JOptionPane.showInputDialog(str);
        clienteEmpresa.setNome(str);
        str = "telefone";
        str = JOptionPane.showInputDialog(str);
        clienteEmpresa.setFone(str);
        str = "EI";
        clienteEmpresa.setIE(JOptionPane.showInputDialog(str));
        str = "CNPJ";
        clienteEmpresa.setCNPJ(JOptionPane.showInputDialog(str));
		str = clienteEmpresa.getNome()+"\n"+clienteEmpresa.getFone()+"\n"+clienteEmpresa.getIE()+"\n"+clienteEmpresa.getCNPJ();
		JOptionPane.showMessageDialog(null,str, "Dados do cliente",1); 
		 
   
		
	}

}
