package br.com.sb.exercicios.modulo7;

public class Circunferencia implements AreaCalculavel {

	private double raio;
	
	public Circunferencia(double raio) {
		this.raio = raio;
	}
		
	@Override
	public double areaCalculavel() {
		return 2 * Math.PI * raio;
	}
}
