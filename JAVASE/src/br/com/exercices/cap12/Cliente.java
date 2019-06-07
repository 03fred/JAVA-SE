package br.com.exercices.cap12;

public class Cliente extends Pessoa {

	private String telefone;
	private String email;
	private String cpf;
	private String lista = "";

	
	public boolean validaEmail(String email) {
		
		if(email.length() < 5 || email.length() >50 )return false;
		
		int cont = 0;
		char a = '@';
		char[] c = email.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (a == (c[i])) {
				cont++;
			}
		}
		if(cont != 1) {
			setMessagem("EMAIL INVÁLIDO, ACEITA APENAS UM '@'");
			return false;
		}

		int numero = email.indexOf('@');
		int numeroLegth = email.length() - 2;
		if(numero < 2 || numero > numeroLegth) {
			setMessagem("O '@' DEVE SER PRECEDIDO POR PELO MENOS 2 CARACTERES E DEVE HAVER PELO MENOS "
					+ "DOIS CARACTERES DEPOIS DELE");

			return false;
		}
		
		
		this.email = email;
		return true;

	}
	
	public boolean validaCPF(String cpf) {

		if(cpf.length() != 11) {
			setMessagem("O CPF deve conter 11 números");
			return false;
		}
		
		try {
			Long cpfNumero = Long.parseLong(cpf);
			this.cpf = String.valueOf(cpfNumero);
			return true;
		}catch(NumberFormatException nb) {
			setMessagem("O CPF deve conter apenas números");
			return false;
		}
		
	}
	
	public String recuperarDados() {
	lista = lista + "\n"+this.getNome()+" - "+this.telefone+" - "+this.email+" - "+this.cpf;
		return lista;
	}
	
	public boolean validaTelefone(String telefone) {
		
		if(telefone.length() != 10) {
			setMessagem("O telefone deve conter 10 números");
			return false;
		}
		
		try {
			Long telefoneNumero = Long.parseLong(telefone);
			this.telefone = String.valueOf(telefoneNumero);
			return true;
		}catch(NumberFormatException nb) {
			setMessagem("O telefone deve conter apenas números");
			return false;
		}
		
		
		
	}
		
}
