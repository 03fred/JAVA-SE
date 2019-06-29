package br.com.cap14.HerancaPolimorfismo;

public class ClienteEmpresa extends Cliente{
	
	public ClienteEmpresa(){
		
		this("","","","");
		
	}

	
	public ClienteEmpresa(String nome, String fone,String iE, String cNPJ) {
		super(nome,fone);
		IE = iE;
		CNPJ = cNPJ;
	}

	private String IE;
	private String CNPJ;
	public String getIE() {
		return IE;
	}
	public void setIE(String iE) {
		IE = iE;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	
	
	
	

}
