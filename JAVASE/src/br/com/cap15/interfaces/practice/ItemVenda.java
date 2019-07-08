package br.com.cap15.interfaces.practice;

public class ItemVenda implements Recebivel {

	private String produto;
	private int quantidade;
	private double precoUnitario;
	
	
	@Override
	public double totalizarReceita() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	@Override
	public String toString() {
		return "ItemVenda [produto=" + produto + ", quantidade=" + quantidade +
				", precoUnitario=" + precoUnitario
				+ ", = "+this.quantidade * this.precoUnitario+"]";
	}
	
	

}
