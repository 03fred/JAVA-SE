package br.com.cap15.interfaces;

public abstract class Produto implements Tributavel {
	
	private int codigo;
	private String descricao;
	private double preco;	
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws EDadoInvalido {
		
		try {
			this.codigo = Integer.parseInt(codigo);
		}catch(NumberFormatException ed) {
			throw new EDadoInvalido("Digite apenas números");
		}
		if(this.codigo < 0)throw new EDadoInvalido("Digite apenas números positivos");
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) throws EDadoInvalido {
		if(descricao.length() < 2 || descricao.length() > 50)
			throw new EDadoInvalido("Número de caracteres deve ser entre 2 e 50");
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(String preco) throws EDadoInvalido {
		
		
		try { 
		
		this.preco = Double.parseDouble(preco);
		}catch(NumberFormatException nb) {
			throw new EDadoInvalido("Formato não aceito");
			
		}
		if( this.preco < 0) throw new EDadoInvalido("Preço não pode ser menor que 0");
		
	}

	@Override
	public String toString() {
		return "Produto [("+this.getClass().getName()+")codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
	}

}
