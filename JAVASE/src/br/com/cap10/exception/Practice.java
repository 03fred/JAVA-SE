package br.com.cap10.exception;
import javax.swing.JOptionPane;


public class Practice {

	static boolean verifica;

	public static void main(String[] args) {

		// exercicio01();
		// exercicio02();
		// exercicio04();
		exercicio05();
	}

	public static void exercicio05() {

		int indice = 0;
		String[] nomes = new String[100];
		int[] idade = new int[100];
		char[] statusCivil = new char[100];
		String str, nome = "";

		while (!verifica) {

			while (true) {
				try {
					str = "Digite o nome";
					nome = JOptionPane.showInputDialog(str);

					if (nome.length() <= 0)
					{
						
						for(int i = 0; i< nomes.length;i++) {
							
						String mensagem = nomes[i] + "\t"+ String.valueOf(statusCivil[i]);
						System.out.println(mensagem);
						}
						
						System.exit(0);
					}
						
						
					if (nome.length() > 50 || nome.length() < 5) {
						str = "nome deve ter entre 5 e 50 caracteres";
						throw new IllegalArgumentException(str);
					}

					if (verifica(nome)) {

						nomes[indice] = nome;
						System.out.println(nomes[indice]);
						break;
					}
				} catch (IllegalArgumentException iae) {
					JOptionPane.showMessageDialog(null, iae.getMessage(), "error", 0);

				}
			}
			while (idade[indice] > 100 || idade[indice] < 18) {
				str = "digite sua idade entre 18 e 100 anos";
				str = JOptionPane.showInputDialog(str);
				if (!verifica(str)) {
					idade[indice] = Integer.parseInt(str);

				} else
					JOptionPane.showMessageDialog(null, "Idade deve ter apenas números", "ERROR", 0);

			}

			while (true) {

				str = "digite seu status S solteiro C casado D divorciado N namorando";
				str = JOptionPane.showInputDialog(str);
				str = str.trim();
				str = str.toUpperCase();
				char teste = str.charAt(0);
				System.out.println(teste);
				if (teste == 'S' || teste == 'N' || teste == 'C' || teste == 'D') {
					statusCivil[indice] = str.charAt(0);
					break;
				}
			}

			indice++;
		}
	}

	public static void exercicio04() {

		String str = "Digite um número";
		int numero = 1;

		while (!verifica) {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog(null, str));
				if (numero <= 0) {
					str = "O número deve ser maior que 0";
					throw new IllegalArgumentException(str);
				}
				int valor = 0;
				for (int i = 1; i < numero; i++) {
					if (numero % i == 0) {
						valor = valor + i;
						System.out.println(valor);
					}

				}
				if (valor == numero) {
					JOptionPane.showMessageDialog(null, "Número perfeito");
					verifica = true;
				}

			} catch (NumberFormatException nb) {
				JOptionPane.showMessageDialog(null, "Número inválido");

			} catch (IllegalArgumentException ie) {
				JOptionPane.showMessageDialog(null, ie.getMessage(), "error", 0);
			}

		}
	}

	public static void exercicio02() {
		String str = "Digite um n�mero";
		int numero = 0;

		while (numero > 1 || numero < 200000) {

			str = "Informe um n�mero inteiro";
			str = JOptionPane.showInputDialog(null, str);
			if (str.length() <= 0)
				System.exit(0);
			try {
				numero = Integer.parseInt(str);
				int cont = 0;
				for (int i = 1; i <= numero; i++) {
					if (numero % i == 0)
						cont++;
				}

				if (cont > 2)
					JOptionPane.showMessageDialog(null, "N�o � primo");
				else
					JOptionPane.showMessageDialog(null, "� primo");
			} catch (NumberFormatException nf) {
				str = "N�mero inv�lido";
				JOptionPane.showMessageDialog(null, str, "ERROR", 0);

			}

		}

		System.exit(0);
	}

	public static void exercicio01() {

		String str = "Digite seu nome", nome = "";

		while (nome.length() < 5 || nome.length() > 50) {
			nome = JOptionPane.showInputDialog(str);
			if (nome.length() < 5 || nome.length() > 50)
				JOptionPane.showMessageDialog(null, "n�meros de caracteres inv�lidos", "ERROR", 0);
			if (str == null)
				System.exit(0);

			verifica = verifica(nome);
			if (!verifica) {
				nome = "";
				JOptionPane.showMessageDialog(null, "campo nome n�o aceita n�meros", "ERROR", 0);
			}

		}

		str = "Digite seu sal�rio";
		double salario = 0;
		verifica = false;

		while (!verifica) {
			try {

				salario = Double.parseDouble(JOptionPane.showInputDialog(str));
				if (salario < 465) {
					str = "O número deve ser maior ou igual a 465";
					throw new IllegalArgumentException(str);
				}
				verifica = true;
			} catch (NumberFormatException nbfe) {
				JOptionPane.showMessageDialog(null, "N�mero n�o condiz com o formato do campo", "ERROR", 0);
			} catch (IllegalArgumentException iae) {
				JOptionPane.showMessageDialog(null, iae.getMessage(), "error", 0);

			}
		}

		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + "\nSalario: " + salario + "\nFGTS: " + (salario * 0.8) / 10, "Recibo de pagamento",
				1);

	}

	public static boolean verifica(String nome) {
		char[] c = nome.toCharArray();
		boolean d = true;

		for (int i = 0; i < c.length; i++)

			if (Character.isDigit(c[i])) {
				d = false;
				break;
			}

		return d;
	}
}
