package br.com.cap14.HerancaPolimorfismo;

public class ClientePessoa extends Cliente {
	
	private String rg;
	private String cpf;
	
	public ClientePessoa() {
		this("","","","");
	}
	
	public ClientePessoa(String nome, String fone,String rg, String cpf) {
		super(nome,fone);
		this.rg = rg;
		this.cpf = cpf;
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
