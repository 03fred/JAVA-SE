package br.com.cap14.herancaPolimorfismo.practice;

public class ClienteFisico extends Cliente {
	private String rg;
	private String cpf;
	
	public ClienteFisico(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}
	
	
	public ClienteFisico() {
		// TODO Auto-generated constructor stub
	}


	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
