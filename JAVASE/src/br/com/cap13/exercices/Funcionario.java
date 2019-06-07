package br.com.cap13.exercices;

public class Funcionario {

	
	private int matricula;
	private String nome;
	private double salario;
	
	public Funcionario() {
		this.nome = "";
		
		
		
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
	    if(matricula < 0) throw new IllegalArgumentException("O NÚMERO DEVE SER MAIOR QUE 0");	
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() < 5 || nome.length() > 50)  throw new IllegalArgumentException("NOME DEVE TER NO MÍNINO"
				+ "5 E NO MÁXIMO 50 CARACTERES");
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
	if(salario < 465) throw new IllegalArgumentException("O SALÁRIO DEVE SER MAIOR DO QUE $465,00");
		this.salario = salario;
	}
	
	
	
	
}
