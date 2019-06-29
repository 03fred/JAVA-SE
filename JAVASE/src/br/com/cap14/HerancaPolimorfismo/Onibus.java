package br.com.cap14.HerancaPolimorfismo;

import javax.swing.JOptionPane;

public class Onibus extends Veiculo{

	private int assentos;

	
	
	public Onibus(String placa,int ano, int assentos) {
		super(placa,ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	public void exibirDados() {
		String str = "Dados do veiculo"+
	    "\nPlaca: "+getPlaca()+
	    "\nAno: "+getAno()+
	    "\nAssentos: "+this.assentos;
		JOptionPane.showMessageDialog(null, str);
	}
	
}
