package br.com.cap14.herancaPolimorfismo.folhaPagemnto;

public class FComissionado extends Funcionario {
	private double percentual;
	private double vendas;

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(String percentual) throws EdadoInvalido {

		try {
			this.percentual = Double.parseDouble(percentual);
		} catch (NumberFormatException nb) {

			throw new EdadoInvalido("Percentual não pode ser menor que 0");
		}
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(String vendas) throws EdadoInvalido {
	try {
		this.vendas = Double.parseDouble(vendas);
	} catch (NumberFormatException nb) {

		throw new EdadoInvalido("vendas deve ser um número");
	}
}

	@Override
	public double calcularProventos() {
		return super.getSalario()+(vendas * percentual/100);
	}

}
