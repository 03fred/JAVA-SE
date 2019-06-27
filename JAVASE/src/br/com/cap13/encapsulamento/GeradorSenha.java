package br.com.cap13.encapsulamento;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GeradorSenha {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		BufferedWriter fr = new BufferedWriter(new FileWriter("/home/fred/txt/senhas.txt"));
		Random random = new Random();
		List<Integer> numeros = new ArrayList<>();
		Set<String> valores = new HashSet<>();
		String str = "";
		for (int i = 0; i < 10000; i++) {
			numeros = new ArrayList<>();
			str = new String();
			int num1 = random.nextInt(10);
			int num2 = random.nextInt(10);
			int num3 = random.nextInt(10);
			int num4 = random.nextInt(10);
			int num5 = random.nextInt(10);
			int num6 = random.nextInt(10);
			int num7 = random.nextInt(10);
			int num8 = random.nextInt(10);

			numeros.add(num1);
			numeros.add(num2);
			numeros.add(num3);
			numeros.add(num4);
			numeros.add(num5);
			numeros.add(num6);
			numeros.add(num7);
			numeros.add(num8);
			
			for (Integer indice : numeros) {
				str += str.valueOf(indice);
			}
			str = "\n"+str;
			valores.add(str);
			
		}

		for (String valor : valores) {

			System.out.print(valor);
			fr.write(valor);
		}
		
		fr.close();
	}
}
