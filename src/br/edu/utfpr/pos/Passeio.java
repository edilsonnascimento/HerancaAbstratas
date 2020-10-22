package br.edu.utfpr.pos;

import java.math.BigDecimal;

public final class Passeio extends Veiculo {

	private int quantidadePassageiros;

	public Passeio(int quantidadePistoes, int potencia) {
		super(quantidadePistoes, potencia);
		this.quantidadePassageiros = 0;
	}

	public Passeio(String placa, String marca, String modelo, int velocidadeMaxima, int quantidadePistoes, int potencia,
			int quantidadePassageiros) {
		super(placa, marca, modelo, velocidadeMaxima, quantidadePistoes, potencia);
		this.quantidadePassageiros = quantidadePassageiros;
	}

	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public final void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}

	@Override
	public BigDecimal calculaVelocidade(double velocidadeMaxima) {
		return new BigDecimal(velocidadeMaxima * 1000);
	}

	@Override
	public String toString() {
		return "\nVEÍCULO DE PASSEIO:" +
				super.toString() +
			   "\n       * Detalhes: Quantidade de Passageiros=" + this.getQuantidadePassageiros() + ", " + 
				                     "Velocidade Máxima=" + this.calculaVelocidade(this.getVelocidadeMaxima()) + " m/h";
		
	}

}
