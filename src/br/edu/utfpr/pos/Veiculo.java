package br.edu.utfpr.pos;

import java.math.BigDecimal;

public abstract class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private double velocidadeMaxima;
	private Motor motor;

	public Veiculo(int quantidadePistoes, int potencia) {
		this.placa = "";
		this.marca = "";
		this.modelo = "";
		this.velocidadeMaxima = 0;
		this.motor = new Motor(quantidadePistoes, potencia);
	}

	public Veiculo(String placa, String marca, String modelo, int velocidadeMaxima, int quantidadePistoes,
			int potencia) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.motor = new Motor(quantidadePistoes, potencia);
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public abstract BigDecimal calculaVelocidade(double velocidadeMaxima);

	@Override
	public String toString() {	
		return "\n       * Identificação: placa=" + this.getPlaca() + ", Marca=" + this.getMarca() + ", Modelo=" + this.getModelo() + ";\n" +
		        this.getMotor();		       
	}
}
