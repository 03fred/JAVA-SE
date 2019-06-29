package br.com.cap14.HerancaPolimorfismo;

import javax.swing.JOptionPane;

public class Caminhao  extends Veiculo{
	
	public Caminhao(String placa,int ano,int eixos) {
		super(placa,ano);
		this.eixos = eixos;
	}

	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	
	public void exibirDados() {
		super.exibirDados();
		String str = "Número de eixos :" +this.eixos;
		JOptionPane.showMessageDialog(null, str);
	}	

}
