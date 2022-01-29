package com.br.softblue.exercicios.modulos.modulo10;

public enum Operacao {

	SOMA('+'),
	SUBTRACAO('-'),
	MULTIPLICACAO('*'),
	DIVISAO('/');
	
	private Character simbolo;
	
	Operacao(Character simbolo) {
		this.simbolo = simbolo;
	}
	
	public double calcular(double numero1, double numero2) {
		double resultado = 0;
		
		if(simbolo.equals('+')) {
			resultado = numero1 + numero2;
		}
		
		if(simbolo.equals('-')) {
			resultado = numero1 - numero2;
		}
		
		if(simbolo.equals('*')) {
			resultado = numero1 * numero2;
		}
		
		if(simbolo.equals('/')) {
			resultado = numero1 / numero2;
		}
		
		return resultado;
	}
}
