package br.edu.utfpr.pos;

//Edilson do Nascimeto

public class Motor {

	private int quantidadePistoes=0;
	private int potencia=0;

	public Motor(int quantidadePistoes, int potencia) {
		this.quantidadePistoes = quantidadePistoes;
		this.potencia = potencia;
	}

	public int getQuantidadePistoes() {
		return quantidadePistoes;
	}

	public void setQuantidadePistoes(int quantidadePistoes) {
		this.quantidadePistoes = quantidadePistoes;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "       * Motor   : Quantida de Pistões=" + this.getQuantidadePistoes() + ", Potência=" + this.getPotencia() +";";
	}

}
