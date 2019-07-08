package br.com.cap15.interfaces.practice;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.*;

public class RegistroDeRecebimentos {

	public static void main(String[] args) {
		Recebivel[] registros = new Recebivel[2];
		String str = "";

		for (int i = 0; i < 2; i++) {

			int tipo = showOptionDialog(null, "tipo do produto", "selecione", 0, QUESTION_MESSAGE, null,
					new String[] { "ItemVenda", "Servico" }, 1);
			switch (tipo) {
			case 0:
				ItemVenda item = new ItemVenda();
				str = "Digite o nome do produto";
				 item.setProduto(showInputDialog(null,str));			
				str = "Quantidade";
				item.setQuantidade(Integer.parseInt(showInputDialog(null,str)));
				str = "Preco unitario";
				item.setPrecoUnitario(Integer.parseInt(showInputDialog(null,str)));
				registros[i]=item;
				break;

			case 1:
				Servico servico = new Servico();
				str = "Digite a descrição do serviço";
				servico.setDescricao(showInputDialog(null,str));			
				str = "Horas";
				servico.setHoras(Integer.parseInt(showInputDialog(null,str)));
				str = "Preco Hora";
				servico.setPrecoHora(Integer.parseInt(showInputDialog(null,str)));
				registros[i]=servico;
				break;
			default:
				break;
			}
			
		}

		str ="";
		for (Recebivel r : registros) {
			str +="\n"+r;
			
		}
		
		showMessageDialog(null, str);
	}
}
