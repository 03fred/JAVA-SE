package br.com.exercices.cap12;

public class Produto extends Pessoa {

	private int codigo;
	private String descricao;
	private double preco;
	String lista;
	

	
   public String recuperarDados() {
	   lista = lista + "\n" + this.codigo +" - " + this.descricao +" - $"+ this.preco;
	   return lista;
   }
   
	public boolean validarCodigo(String str) {
		int numero;
		try {
			numero = Integer.parseInt(str);
			if (numero < 1) {
				str = "O número deve ser maior que 0";
				throw new IllegalArgumentException(str);
			}
            this.codigo = numero;
			return true;

		} catch (NumberFormatException nf) {
			setMessagem("ERROR: DIGITE APENAS NÚMEROS!");
			return false;

		} catch (IllegalArgumentException iae) {
             setMessagem(iae.getMessage());
			return false;

		}
		
	}
	
	public boolean validarPreco(String str) {
		double numero;
		try {
			numero = Double.parseDouble(str);
			if (numero < 1) {
				str = "O número deve ser maior que 0";
				throw new IllegalArgumentException(str);
			}
            this.preco = numero;
			return true;

		} catch (NumberFormatException nf) {
			setMessagem("ERROR: DIGITE APENAS NÚMEROS!");
			return false;

		} catch (IllegalArgumentException iae) {
             setMessagem(iae.getMessage());
			return false;

		}
	}
	

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}