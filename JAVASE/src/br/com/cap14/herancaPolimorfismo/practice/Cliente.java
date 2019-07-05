package br.com.cap14.herancaPolimorfismo.practice;

public abstract class Cliente {

	private int codigo;
	private String nome;
	private String email;
	private String telefone;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws EDadoInvalido {

		try {
			this.codigo = Integer.parseInt(codigo);

		} catch (NumberFormatException nb) {
			throw new EDadoInvalido("codigo");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws EDadoInvalido{
	nome = nome.trim();
	if(nome.lastIndexOf(" ") == -1) {
		throw new EDadoInvalido("nome inválido");
	};
		
	this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EDadoInvalido {

		char[] letras = email.toCharArray();
		int cont = 0;
		for (char verifica : letras) {

			if (verifica == '@') {
				cont += 1;
				if (cont > 1 || cont == 0)
					throw new EDadoInvalido("Email");
			}
			int i = email.indexOf("@");
			if (i < 2 || i >= email.length() - 1)
				throw new EDadoInvalido("email");

			this.email = email;

		}

		this.email = email;

	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws EDadoInvalido {

		char[] letras = telefone.toCharArray();

		int cont = 0;

		for (char verifica : letras) {
			if (verifica == '(' || verifica == ')' || verifica == '-') {
				cont++;
			}
		}
		if (cont != 3)
			throw new EDadoInvalido("Formato aceito é (99)9999-9999");

		
		this.telefone = telefone;

	}

	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}

}
