package br.com.sb.exercicios.modulo7;

public class Retangulo implements AreaCalculavel {

	private double base;
	private double altura;
		
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double areaCalculavel() {
		return base * altura;
	}
}
