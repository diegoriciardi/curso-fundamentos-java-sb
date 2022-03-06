package com.br.softblue.exercicios.modulos.modulo12.exercicio4;

public abstract class Figura {

	public abstract double calcularArea();
	
	public void imprimir() {
		System.out.println("area = " + calcularArea());
	}
	
}
