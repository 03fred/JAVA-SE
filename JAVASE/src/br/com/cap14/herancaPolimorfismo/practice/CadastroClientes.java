package br.com.cap14.herancaPolimorfismo.practice;

import static javax.swing.JOptionPane.*;

public class CadastroClientes {

	public static void main(String[] args) {

		Cliente[] clientes = new Cliente[2];

		String str = "";

		for (int i = 0; i < 2; i++) {
			int tipo = showOptionDialog(null, "tipo do funcionário", "selecione", 0, QUESTION_MESSAGE, null,
					new String[] { "Cliente Físico", "Cliente Jurídico" }, 1);
			switch (tipo) {
			case 0:
				clientes[i] = new ClienteFisico();
				break;

			case 1:
				clientes[i] = new ClienteJuridico();
				break;
			default:
				break;
			}
			if (str == null)
				break;
			while (true) {
				str = "digite o codigo";
				try {
					str = showInputDialog(str);
					if (str == null)
						break;
					clientes[i].setCodigo(str);
					break;
				} catch (EDadoInvalido ei) {
					showMessageDialog(null, ei.getMessage(), "ERROR", 0);
				}

			}

			if (str == null)
				break;

			while (true) {
				str = "digite o nome";
				try {
					str = showInputDialog(str);
					if (str == null)
						break;
					clientes[i].setNome(str);
					break;
				} catch (EDadoInvalido ei) {
					showMessageDialog(null, ei.getMessage(), "ERROR", 0);
				}

			}
			if (str == null)
				break;
			while (true) {
				str = "digite o telefone";
				if (str == null)
					break;
				try {
					str = showInputDialog(str);
					clientes[i].setTelefone(str);
					break;
				} catch (EDadoInvalido ei) {
					showMessageDialog(null, ei.getMessage(), "ERROR", 0);
				}

			}
			if (str == null)
				break;
			while (true) {
				str = "digite o email";
				if (str == null)
					break;
				try {
					str = showInputDialog(str);
					clientes[i].setEmail(str);
					break;
				} catch (EDadoInvalido ei) {
					showMessageDialog(null, ei.getMessage(), "ERROR", 0);
				}

			}

			if (str == null)
				break;

			str = tipo == 0 ? "Digite o Rg" : "Digite Razão Social";

			while (true) {
				try {
					str = showInputDialog(str);
					if (str == null)
						break;
					if (clientes[i] instanceof ClienteFisico) {
						((ClienteFisico) clientes[i]).setRg(str);
						break;
					} else if (clientes[i] instanceof ClienteJuridico) {
						((ClienteJuridico) clientes[i]).setRazaoSocial(str);
						break;
					}
				} catch (Exception e) {
					showMessageDialog(null, e.getMessage());
				}
			}

			
			str = tipo == 0 ? "Digite o cpf" : "Digite IE";

			while (true) {
				try {
					str = showInputDialog(str);
					if (str == null)
						break;
					if (clientes[i] instanceof ClienteFisico) {
						((ClienteFisico) clientes[i]).setCpf(str);
						break;
					} else if (clientes[i] instanceof ClienteJuridico) {
						((ClienteJuridico) clientes[i]).setIE(str);
						break;
					}
				} catch (Exception e) {
					showMessageDialog(null, e.getMessage());
				}
			}

			
			
		}
		
		str = "";
		for (Cliente cliente : clientes) {
			str += "\n" + cliente;
			
		}
		

		showMessageDialog(null, str);
		
	}
}
