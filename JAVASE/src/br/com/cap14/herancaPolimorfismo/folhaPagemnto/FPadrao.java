package br.com.cap14.herancaPolimorfismo.folhaPagemnto;

public class FPadrao extends Funcionario{

	@Override
	public double calcularProventos() {
		return super.getSalario();
	}

}
