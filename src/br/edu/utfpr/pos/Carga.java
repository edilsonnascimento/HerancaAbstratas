package br.edu.utfpr.pos;

import java.math.BigDecimal;

public final class Carga extends Veiculo {

	private int tara;
	private int cargaMaxima;

	public Carga(int quantidadePistoes, int potencia) {
		super(quantidadePistoes, potencia);
		this.tara = 0;
		this.cargaMaxima = 0;
	}

	public Carga(String placa, String marca, String modelo, int velocidadeMaxima, int quantidadePistoes, int potencia,
			int tara, int cargaMaxima) {
		super(placa, marca, modelo, velocidadeMaxima, quantidadePistoes, potencia);
		this.tara = tara;
		this.cargaMaxima = cargaMaxima;
	}

	public int getTara() {
		return tara;
	}

	public final void setTara(int tara) {
		this.tara = tara;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public final void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	// Entrada Km/h saída Cm/h
	@Override
	public BigDecimal calculaVelocidade(double velocidadeMaxima) {
		return new BigDecimal((velocidadeMaxima * 1000) * 100);
	}

	@Override
	public String toString() {
		return "\n VEÍCULO DE CARGA: " +
				super.toString() +
			   "\n       * Detalhes: Máximo de Carga=" + this.getCargaMaxima() 
				+ ", Velocidade Máxima=" + this.calculaVelocidade(this.getVelocidadeMaxima()) + " cm/h";
		
	}

}
