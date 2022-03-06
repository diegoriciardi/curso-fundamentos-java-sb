package com.br.softblue.exercicios.modulos.modulo12;

public class TesteVarArgs {
	public static void main(String[] args) {
		
		imprimir("a");
		imprimir("a", "b");
		imprimir("a", "b", "c");
		String[] array = { "d", "e", "f" };
		imprimir(array);
		imprimir();
	}

	
	public static void imprimir(String... textos) {
		for (String palavra : textos) {
			System.out.println(palavra);
		}
	}
}
