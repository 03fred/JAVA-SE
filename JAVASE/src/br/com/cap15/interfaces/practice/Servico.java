package br.com.cap15.interfaces.practice;

public class Servico implements Recebivel {

	private String descricao;
	private int horas;
	private double precoHora;
	
	
	@Override
	public double totalizarReceita() {

		
		return 0;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getPrecoHora() {
		return precoHora;
	}


	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}


	@Override
	public String toString() {
		return "Servico [descricao=" + descricao + ", horas=" + horas + ", precoHora=" + precoHora + "]";
	}

}
