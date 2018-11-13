package br.com.exercices.cap12;

public class GeradorINiciais {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		String inicial = pessoa.gerarIniciais("Fred");
		
		System.out.println(inicial);
	}

}
