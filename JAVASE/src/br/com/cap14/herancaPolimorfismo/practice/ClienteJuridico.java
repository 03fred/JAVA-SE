package br.com.cap14.herancaPolimorfismo.practice;

public class ClienteJuridico extends Cliente{
	private String razaoSocial;
	private String IE;
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getIE() {
		return IE;
	}
	public void setIE(String iE) {
		IE = iE;
	}
	public ClienteJuridico(String razaoSocial, String iE) {
		super();
		this.razaoSocial = razaoSocial;
		IE = iE;
	}
	public ClienteJuridico() {
		// TODO Auto-generated constructor stub
	}
	
	

}
