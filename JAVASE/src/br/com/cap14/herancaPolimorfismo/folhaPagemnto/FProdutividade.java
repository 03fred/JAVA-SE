package br.com.cap14.herancaPolimorfismo.folhaPagemnto;

public class FProdutividade extends Funcionario {
	private double valor;
	private int producao;

	public double getValor() {
		return valor;
	}

	public void setValor(String valor) throws EdadoInvalido {
		try {
			this.valor = Double.parseDouble(valor);

		} catch (NumberFormatException nb) {

			throw new EdadoInvalido("Valor inválido");
		}
	}

	public int getProducao() {
		return producao;
	}

	public void setProducao(String producao) throws EdadoInvalido {

		try {
			this.producao = Integer.parseInt(producao);
		} catch (NumberFormatException nb) {
              throw new EdadoInvalido("Valor de produção inválido");
		}

	}

	@Override
	public double calcularProventos() {
		return super.getSalario() + (producao * valor);
	}

}
