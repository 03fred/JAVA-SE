package br.com.cap13.exercices;

import static javax.swing.JOptionPane.*;

public class CadastroFuncionarios {

	public static void main(String[] args) {
		String str = "",aux ="";
		Funcionario[] funcionarios = new Funcionario[3];
		Funcionario func = new Funcionario();
		for (int i = 0; i < funcionarios.length; i++) {
			func = new Funcionario();
			while (true) {
				str = "Digite a matricula";
				str = showInputDialog(str);
				if (str == null)
					break;
				try {
					func.setMatricula(Integer.parseInt(str));
					break;
				} catch (Exception e) {
					showMessageDialog(null, e.getMessage(), "ERROR", 0);
					continue;
				}
			}
			if (str == null)
				break;
			
			while (true) {
				str = "Digite o nome do funcionario";
				str = showInputDialog(str);
				if (str == null)
					break;
				try {
					 func.setNome(str);
					break;
				} catch (Exception e) {
					showMessageDialog(null, e.getMessage(), "ERROR", 0);
					continue;
				}
			}


			while (true) {
				str = "Digite o salario";
				str = showInputDialog(str);
				if (str == null)
					break;
				try {
					 func.setSalario(Double.parseDouble(str));
					break;
				} catch (Exception e) {
					showMessageDialog(null, e.getMessage(), "ERROR", 0);
					continue;
				}
			}
			
			aux +="\n"+ func.toString();
		}

		showMessageDialog(null, aux);
		System.exit(0);
	}

}
