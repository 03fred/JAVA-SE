package br.com.cap14.herancaPolimorfismo.folhaPagemnto;

import java.text.NumberFormat;

public abstract class Funcionario {

	private int matricula;
	private String nome;
	private double salario;

	public abstract double calcularProventos();

	@Override
	public String toString() {

		double total = calcularProventos();
		double diferenca = total - salario;

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return "Funcionario " + matricula + ": " + nome + " - " + nf.format(salario) + " + " + nf.format(diferenca)
				+ " = " + nf.format(total);

	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) throws EdadoInvalido {

		try {
			this.matricula = Integer.parseInt(matricula);

		} catch (NumberFormatException nb) {
			throw new EdadoInvalido("A matricula deve ser um número");

		}
		;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws EdadoInvalido {
		if (nome.length() < 5 || nome.length() > 50)
			throw new EdadoInvalido("O nome deve conter entre 5 e 50 caracteres");

		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(String salario) throws EdadoInvalido {
		try {
			this.salario = Double.parseDouble(salario);

		} catch (NumberFormatException nb) {
			throw new EdadoInvalido("A o salario deve ser um número");

		}
		;
	}

}
