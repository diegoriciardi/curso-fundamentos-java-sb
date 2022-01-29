package com.br.softblue.exercicios.modulos.modulo9;

public class TestaMetodoProcessar {
	
	public static void main(String[] args) {
		System.out.println(processar(null));
		System.out.println(processar("ab"));
		System.out.println(processar("abcdefg"));
	}

	public static String processar(String s) {
		if(s == null) {
			return null;
		}
		
		if(s.length() <= 3) {
			s = s.toUpperCase();
			return s;
		} 
		
		if(s.length() > 3) {
			int indiceInicio = 0;
			int indiceFinal = 3;
			StringBuilder parte1 = new StringBuilder();
			parte1.append(s.substring(indiceInicio, indiceFinal));
			String parte2 = s.substring(indiceFinal, s.length());
			s = (parte1.reverse() + parte2).toUpperCase();
		}
		return s;
	}
}
