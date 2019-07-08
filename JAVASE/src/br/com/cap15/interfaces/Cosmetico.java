package br.com.cap15.interfaces;

public class Cosmetico extends Produto {
	
	@Override
	public double calcularIcms() {
		// TODO Auto-generated method stub
		return super.getPreco() * 0.25;
	}

}
