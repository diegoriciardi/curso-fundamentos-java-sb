package com.br.softblue.exercicios.modulos.modulo12.exercicio4;

public class Quadrado extends Figura {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
	
	
}
