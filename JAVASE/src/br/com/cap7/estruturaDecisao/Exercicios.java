package br.com.cap7.estruturaDecisao;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String args[]) {
		// exercicio01();
		// exercicio02();
		// exercicio03();
		//exercicio04();
		//exercicio05();
		exercicio06();
		//exercicio07();
	}

	public static void exercicio07() {

		
		
	}

	public static void exercicio06() {

		double db = 0;
		try {
			db = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o salario"));
            if( db < 965.67) {
                JOptionPane.showMessageDialog(null,"Sálario bruto "+db+ "\nAlícota do INSS " +8.0+"\n"
                		+ "Valor do inss $"+(db * 8) /100+"\nSalário liquido "+(db - ((db*8)/100)));

            	
            }
            
            if( db >= 965.67 && db <= 1609.45) {
                JOptionPane.showMessageDialog(null,"Sálario bruto "+db+ "\nAlícota do INSS " +9.0+"\n"
                		+ "Valor do inss $"+(db * 9) /100+"\nSalário liquido "+(db - ((db*9)/100)));

            	
            }
            
            
            if( db >= 1609 && db <= 3218.90) {
                JOptionPane.showMessageDialog(null,"Sálario bruto "+db+ "\nAlícota do INSS " +11.0+"\n"
                		+ "Valor do inss $"+(db * 11) /100+"\nSalário liquido "+(db - ((db*11)/100)));

            	
            }
			if(db > 3218.90) {
				  JOptionPane.showMessageDialog(null,"Sálario bruto "+db+ "\nAlícota do INSS " +354.07+"\n"
	                		+ "Valor do inss $"+354.07+"\nSalário liquido "+(db - 354.07));

			}
			
		} catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números");
		
		}
		
		
	}

	public static void exercicio05() {
		String st = "Digite um conceito entre A e F";
		st = JOptionPane.showInputDialog(null, st);
		
		switch (st) {
		
		case "A":
			JOptionPane.showMessageDialog(null, "Excelente","Mensgame",1);
			break;
			
		case "B":
			JOptionPane.showMessageDialog(null, "Ótimo","Mensgame",1);
			break;
		case "C":
			JOptionPane.showMessageDialog(null, "Regular","Mensgame",1);
			break;
		case "D":
			JOptionPane.showMessageDialog(null, "Ruim","Mensgame",1);
			break;
		
		case "F":
			JOptionPane.showMessageDialog(null, "Péssimo","Mensgame",1);
			break;
		
			default:
				JOptionPane.showMessageDialog(null, "NÃO FOI ENCONTRADO CONCEITO","Mensgame",1);
break;
		}
		
	}

	public static void exercicio04() {

		String st = "Digite o CEP";
		st = JOptionPane.showInputDialog(null, st);

		if (st.length() < 8 || st.length() > 8) {

			st = " numeros de caracteres não correspondem ";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);

		}

		try {
			int cep = Integer.parseInt(st);

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null,"APENAS NÚMEROS", "MENSAGEM", 0);

		}

		String cep2 = st.substring(0, 5);
		String cep3 = st.substring(5, 8);

JOptionPane.showMessageDialog(null, cep2 + "-" + cep3, "MENSAGEM",1);
		
	}

	public static void exercicio01() {

		String st = "Digite seu nome completo";
		st = JOptionPane.showInputDialog(null, st);

		String compara = st;

		compara = compara.length() >= 5 && compara.length() <= 50 ? "Nome valido" : "Nome invalido";

		if (compara.equals("Nome invalido")) {

			st = " DIGITE SEU NOME";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);

		}
		compara = st.substring(st.lastIndexOf(" ") + 1, st.length());
		if (compara.isEmpty()) {
			st = " DIGITE SEU SOBRENOME";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);
		}

		if (compara.length() <= 2) {
			st = " SOBRENOME COM MENOS DE 3 CARACTERES";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);
		}

	}

	public static void exercicio02() {

		String st = "Digite seu email";
		st = JOptionPane.showInputDialog(null, st);

		if (st.indexOf("@") != st.lastIndexOf("@")) {

			st = "E-MAIL COM DUAS  OU MAIS @";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);
		}

		if (st.indexOf("@") < 3) {

			st = "APENAS 2 CARACTERES ANTES DA @";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);
		}

		JOptionPane.showMessageDialog(null, "email valido " + st, "MENSAGEM", 1);

	}

	public static void exercicio03() {

		String nome = "Digite seu nome";
		nome = JOptionPane.showInputDialog(null, nome);

		if (nome.length() < 5 || nome.length() > 50) {

			nome = "NOME TEM QUE TER DE 5 A 50 CARACTERES";
			JOptionPane.showMessageDialog(null, nome, "ERROR", 0);
			System.exit(0);
		}

		String st = "Digite seu email";
		st = JOptionPane.showInputDialog(null, st);

		if (st.length() < 5 || st.length() > 50) {

			st = "E-MAIL TEM QUE TER DE 5 A 50 CARACTERES";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);
		}
		if (st.indexOf("@") != st.lastIndexOf("@")) {

			st = "E-MAIL COM DUAS  OU MAIS @";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);
		}

		if (st.indexOf("@") < 3) {

			st = "APENAS 2 CARACTERES ANTES DA @";
			JOptionPane.showMessageDialog(null, st, "ERROR", 0);
			System.exit(0);
		}

		JOptionPane.showMessageDialog(null, "email valido " + st, "MENSAGEM", 1);

	}

}
