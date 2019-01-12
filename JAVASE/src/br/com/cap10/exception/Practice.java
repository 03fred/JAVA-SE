package br.com.cap10.exception;

import java.io.PrintStream;
import javax.swing.JOptionPane;


public class Practice {

	static boolean verifica;
	static PrintStream saida = System.out;

	public static void main(String[] args) {

		// exercicio01();
		// exercicio02();
		//exercicio03();

	}

	public static void exercicio03() {

		String str = "Digite um número";
		long numero = 1, at = 1, ant = 1, p;
		while (true) {
			str = "Informe um número inteiro";
			str = JOptionPane.showInputDialog(null, str);
			if (str.length() <= 0)
				System.exit(0);
			try {
				numero = Integer.parseInt(str);

				if(numero > 92) {
					str = "O número deve estar entre 1 e 92";
					throw new IllegalArgumentException(str);
					
				}
				for (int i = 1; i < numero; i++) {

					p = at + ant;
					if(p > 0) {
					saida.println(p);
					ant = at;
					at = p;
					}
				}

			} catch (NumberFormatException nbe) {
				JOptionPane.showMessageDialog(null, "Digite apenas números", "ERROR", 0

				);

			}catch(IllegalArgumentException iae) {
				JOptionPane.showMessageDialog(null, iae.getMessage());
			}
		}
		// exercicio04();
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
					JOptionPane.showMessageDialog(null, "Idade deve ter apenas nÃºmeros", "ERROR", 0);

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

		String str = "Digite um nÃºmero";
		int numero = 1;

		while (!verifica) {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog(null, str));
				if (numero <= 0) {
					str = "O nÃºmero deve ser maior que 0";
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
					JOptionPane.showMessageDialog(null, "NÃºmero perfeito");
					verifica = true;
				}

			} catch (NumberFormatException nb) {
				JOptionPane.showMessageDialog(null, "NÃºmero invÃ¡lido");

			} catch (IllegalArgumentException ie) {
				JOptionPane.showMessageDialog(null, ie.getMessage(), "error", 0);
			}

		}
	}

	public static void exercicio02() {
		String str = "Digite um nï¿½mero";
		int numero = 0;

		while (numero > 1 || numero < 200000) {

			str = "Informe um nï¿½mero inteiro";
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
					JOptionPane.showMessageDialog(null, "Nï¿½o ï¿½ primo");
				else
					JOptionPane.showMessageDialog(null, "ï¿½ primo");
			} catch (NumberFormatException nf) {
				str = "Nï¿½mero invï¿½lido";
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
				JOptionPane.showMessageDialog(null, "nï¿½meros de caracteres invï¿½lidos", "ERROR", 0);
			if (str == null)
				System.exit(0);

			verifica = verifica(nome);
			if (!verifica) {
				nome = "";
				JOptionPane.showMessageDialog(null, "campo nome nï¿½o aceita nï¿½meros", "ERROR", 0);
			}

		}

		str = "Digite seu salï¿½rio";
		double salario = 0;
		verifica = false;

		while (!verifica) {
			try {

				salario = Double.parseDouble(JOptionPane.showInputDialog(str));
				if (salario < 465) {
					str = "O nÃºmero deve ser maior ou igual a 465";
					throw new IllegalArgumentException(str);
				}
				verifica = true;
			} catch (NumberFormatException nbfe) {
				JOptionPane.showMessageDialog(null, "Nï¿½mero nï¿½o condiz com o formato do campo", "ERROR", 0);
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
