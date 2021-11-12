package br.com.sb.exercicios.modulo7;

public class AplicacaoAreaCalculavel {
	public static void main(String[] args) {
		
		AreaCalculavel quadrado = new Quadrado(12);
		System.out.println(quadrado.imprimir());
		
		AreaCalculavel circunferencia = new Circunferencia(19);
		System.out.println(circunferencia.imprimir());
		
		AreaCalculavel retangulo = new Retangulo(13, 12);
		System.out.println(retangulo.imprimir());
	}
}
