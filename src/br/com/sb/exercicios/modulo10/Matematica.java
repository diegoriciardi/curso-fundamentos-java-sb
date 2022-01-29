package com.br.softblue.exercicios.modulos.modulo10;

public class Matematica {

	enum TipoAngulo {
		GRAUS,
		RADIANOS
	}
	
	public static Double converterAngulo(Double angulo, TipoAngulo tipo) {
		
		Double resultado = Double.valueOf(0);
		
		if(tipo == TipoAngulo.GRAUS) {
			resultado = Math.toRadians(angulo);
		}
		
		if(tipo == TipoAngulo.RADIANOS) {
			resultado = Math.toDegrees(angulo);
		}
		return resultado;
	}
	
	public static Integer somar(Integer n1, Integer n2, Integer n3) {
		Integer resultado = n1 + n2 + n3;
		System.out.printf(n1 + " " + n2 + " " + n3 + " = ");
		return resultado;
	}
	
	public static Integer converterBinarioParaDecimal(String numeroBinario) {
		int base = 2;
		Integer resultado = Integer.parseUnsignedInt(numeroBinario, base);
		return resultado;
	}
	
}
