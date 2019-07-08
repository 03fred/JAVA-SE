package br.com.cap15.interfaces;


import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showOptionDialog;

import java.text.NumberFormat;


public class CadastroProdutos {

	public static void main(String[] args) {

		
		Tributavel[] registros  = new Tributavel[2];
       String str="";

		for (int i = 0; i < 2; i++) {
			Produto produto = null;
			
			int tipo = showOptionDialog(null, "tipo do produto", "selecione", 0, QUESTION_MESSAGE, null,
					new String[] { "Cosmetico", "Alimento" }, 1);
			switch (tipo) {
			case 0:
				produto = new Cosmetico();
				break;

			case 1:
				produto = new Alimento();
				break;
			default:
				break;
			}
			
			while (true) {
				str = "digite o codigo";
				try {
					str = showInputDialog(str);
					if (str == null)
						break;
					produto.setCodigo(str);
					break;
				} catch (EDadoInvalido ei) {
					showMessageDialog(null, ei.getMessage(), "ERROR", 0);
				}

			}

			if(str ==null)break;
			
			while (true) {
				str = "digite a descricao";
				try {
					str = showInputDialog(str);
					if (str == null)
						break;
					produto.setDescricao(str);
					break;
				} catch (EDadoInvalido ei) {
					showMessageDialog(null, ei.getMessage(), "ERROR", 0);
				}

			}

			if(str ==null)break;
			
		
			while (true) {
				str = "digite o preco";
				try {
					str = showInputDialog(str);
					if (str == null)
						break;
					produto.setPreco(str);
					break;
				} catch (EDadoInvalido ei) {
					showMessageDialog(null, ei.getMessage(), "ERROR", 0);
				}

			}

			if(str ==null)break;
			registros[i] = produto;
		}
		
		NumberFormat nb = NumberFormat.getCurrencyInstance();
		str = "";
		for (Tributavel p : registros) {
			
			str += "\n"+p + "ICMS :"+ nb.format(p.calcularIcms());
			 
		}
		
		if(str.length() ==0 )System.exit(0);
		
		showMessageDialog(null, str);
		
	}

}
