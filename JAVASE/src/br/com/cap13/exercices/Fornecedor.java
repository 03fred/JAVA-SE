package br.com.cap13.exercices;

public class Fornecedor {

	private int codigo;
	private String razaoSocial;
	private String telefone;
	private String email;

	public Fornecedor() {
		this.razaoSocial = "";
		this.telefone = "";
		this.email = "";

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {

		if (codigo < 0)
			throw new IllegalArgumentException("O NÚMERO DEVE SER MAIOR QUE 0");
		this.codigo = codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone.length() < 8 || telefone.length() > 13)
			throw new IllegalArgumentException("NOME DEVE TER NO MÍNINO" + "8 E NO MÁXIMO 13 CARACTERES");
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (validaEmail(email)) {
			this.email = email;
		} else {
			throw new IllegalArgumentException("EMAIL INVÁLIDO");
		}

	}

	@Override
	public String toString() {
		return "Fornecedor [codigo=" + codigo + ", razaoSocial=" + razaoSocial + ", telefone=" + telefone + ", email="
				+ email + "]";
	}

	public boolean validaEmail(String email) {

		if (email.length() < 5 || email.length() > 50)
			return false;

		int cont = 0;
		char a = '@';
		char[] c = email.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (a == (c[i])) {
				cont++;
			}
		}
		if (cont != 1) {
			return false;
		}

		int numero = email.indexOf('@');
		int numeroLegth = email.length() - 2;
		if (numero < 2 || numero > numeroLegth) {

			return false;
		}

		this.email = email;
		return true;

	}

}
