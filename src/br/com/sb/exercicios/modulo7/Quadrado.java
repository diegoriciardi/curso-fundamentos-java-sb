package br.com.sb.exercicios.modulo7;

public class Quadrado implements AreaCalculavel {

	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double areaCalculavel() {
		return lado * lado;
	}
}
