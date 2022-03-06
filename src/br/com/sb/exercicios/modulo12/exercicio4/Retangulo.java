package com.br.softblue.exercicios.modulos.modulo12.exercicio4;

public class Retangulo extends Figura {

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base 	= base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}
	
	
}
