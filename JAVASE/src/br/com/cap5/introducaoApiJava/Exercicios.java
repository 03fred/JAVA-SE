package br.com.cap5.introducaoApiJava;

import javax.swing.JOptionPane;

public class Exercicios extends AnalisadorDeTexto {

	public static void main(String[] args) {

		 exercicio01();
		// exercicio02();
		// exercicio03();
		// exercicio04();
		// exercicio05();
		//exercicio06();
		//exercicio07();
		//exercicio08();
		//exercicio09();
		//exercicio10();
		//exercicio11();
		//exercicio12();
		
	}

	private static void exercicio12() {
		saida.println("\nDigite o diametro  " );
        double diametro = scan.nextDouble();
        double raio = diametro / 2;
        double circuferencia = diametro *  Math.PI;
        double area = Math.PI * Math.pow(raio,2);
 		saida.println("\n raio  " + raio);
 		saida.println("\n circunferencia  " + circuferencia);
 		saida.println("\n area  " + area);

	
	
	}

	public static void exercicio11() {

		int num = acaso.nextInt((90 - 65)+1)+65;
		saida.println("\nN�mero sorteado  " + num );
         char caracter = (char)num;
 		saida.println("\n Caracter correspondente  " + caracter );

	}

	public static void exercicio01() {
		saida.println("Informe seu CEP (S� N�MEROS)");
		int cep = scan.nextInt();

		String cepstring = String.valueOf(cep);
		String cep2 = cepstring.substring(0, 5);
		String cep3 = cepstring.substring(5, 8);

		saida.println(cep2 + "-" + cep3);
	}

	public static void exercicio02() {
		saida.println("Informe seu CEP (S� N�MEROS)");
		String cep = scan.nextLine();
		saida.println(cep.replaceAll("-", ""));
	}

	public static void exercicio03() {
		saida.println("Informe seu CPF");
		long cpf = scan.nextLong();

		String cepstring = String.valueOf(cpf);
		String cpf2 = cepstring.substring(0, 3);
		String cpf3 = cepstring.substring(3, 6);
		String cpf4 = cepstring.substring(6, 9);
		String cpf5 = cepstring.substring(9, 11);

		saida.println(cpf2 + "." + cpf3 + "." + cpf4 + "-" + cpf5);
	}

	public static void exercicio04() {
		saida.println("Informe primeiro texto");
		String texto1 = scan.nextLine();
		saida.println("Informe segundo texto");
		String texto2 = scan.nextLine();
		saida.println();
		saida.println(texto1);
		saida.println(texto2);
		saida.println(texto1.equals(texto2));
	}

	public static void exercicio05() {
		saida.println("Informe primeiro texto");
		String texto1 = scan.nextLine();
		saida.println("Informe segundo texto");
		String texto2 = scan.nextLine();
		saida.println();
		saida.println(texto1);
		saida.println(texto2);
		saida.println(texto1.equalsIgnoreCase(texto2));
	}

	public static void exercicio06() {

		saida.println("Informe seu nome completo");
		String nome = scan.nextLine();
		char inicial = nome.charAt(0);
		char segundoInicial = nome.substring(nome.indexOf(" ") + 1).charAt(0);
		String completo = String.valueOf(inicial) + " " + String.valueOf(segundoInicial);
		saida.println(completo);

	}

	public static void exercicio08() {

		saida.println("Informe um numero");
		int num = scan.nextInt();
		saida.println("Informe seu expoente");
		int num2 = scan.nextInt();
		saida.println("\nResultado :" + Math.pow(num, num2));

	}

	public static void exercicio07() {

		saida.println("Informe um numero");
		int num = scan.nextInt();

		saida.println("\nResultado :" + Math.sqrt(num));

	}

	public static void exercicio10() {

		saida.println("Informe o limite para o sorteio");
		int num = scan.nextInt();

		saida.println("\nResultado :" + acaso.nextInt(num));

	}

	public static void exercicio09() {

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A PRIMEIRA NOTA"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A SEGUNDA NOTA"));
		JOptionPane.showMessageDialog(null," SUA MÉDIA FINAL FOI :" + (nota1 + nota2) / 2);

	}

}
