package br.com.cap14.HerancaPolimorfismo;

import javax.swing.JOptionPane;

public class Caminhao2 extends Veiculo2{

	private int eixos;
	
	public Caminhao2(String placa, int ano, int eixos) {
		
		super.setPlaca(placa);
		super.setAno(ano);
		this.setEixos(eixos);
		
		
	}
	
	
	
	public int getEixos() {
		return eixos;
	}



	public void setEixos(int eixos) {
		this.eixos = eixos;
	}



	@Override
	public void exibirDados() {
        
		String str = "Dados do veiculo"+
			    "\nPlaca: "+super.getPlaca()+
			    "\nAno: "+super.getAno()+
			    "\nEixos: "+this.getEixos();
				JOptionPane.showMessageDialog(null, str);
		
		
		
	}
	
	

}
