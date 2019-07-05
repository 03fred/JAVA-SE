package br.com.cap14.herancaPolimorfismo.folhaPagemnto;

import javax.swing.JOptionPane;

public class TesteFolha {

	public static void main(String[] args) {
	
		Funcionario[]dados = new Funcionario[3];
		
		try {
		FPadrao fPadrao = new FPadrao();
		fPadrao.setMatricula("1234");
		fPadrao.setNome("funcionario");
		fPadrao.setSalario("1000");
		dados[0]= fPadrao;
		
		FComissionado fc = new FComissionado();
		fc.setMatricula("123");
		fc.setNome("comissionados");
		fc.setSalario("1000");
		fc.setVendas("5");
		fc.setPercentual("20");
		
		dados[1]= fc;
		
		FProdutividade fp = new FProdutividade();
		fp.setMatricula("123");
		fp.setNome("Produtividade");
		fp.setSalario("1000");
		fp.setValor("5");
		
		dados[2] = fp;
		
		
		
		
		}catch(EdadoInvalido ei) {
			JOptionPane.showMessageDialog(null, ei.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
			
			System.exit(0);
		}
		
		String str = "";
		for (Funcionario f: dados) {
			
			str += f;
		}
		
		JOptionPane.showMessageDialog(null, str,"Folha de pagamento",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
