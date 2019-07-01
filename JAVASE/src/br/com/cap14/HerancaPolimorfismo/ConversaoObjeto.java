package br.com.cap14.HerancaPolimorfismo;

import javax.swing.JOptionPane;

public class ConversaoObjeto {

	public static void main(String[] args) {

		Veiculo v1 = new Onibus("klb-90",2015, 40);
		Onibus bus = (Onibus)v1;
		
		String str = "Dados do veiculo"+
			    "\nPlaca: "+v1.getPlaca()+
			    "\nAno: "+v1.getAno()+
			    "\nAssentos: "+bus.getAssentos();
				JOptionPane.showMessageDialog(null, str);
		
		
			
		
	}

}
