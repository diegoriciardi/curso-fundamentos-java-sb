package com.br.softblue.exercicios.modulos.modulo12.exercicio4;

public class Aplicacao {

	public static void main(String[] args) {

		Quadrado q 	= new Quadrado(10);
		Retangulo r = new Retangulo(2, 4);
		
		q.imprimir();
		r.imprimir();
		
		/*
		1 quadrado com 3 de lado 
		1 quadrado com 10 de lado 
		1 retângulo com lados 2 e 7 
		1 retângulo com lados 5 e 3
		*/
		
		System.out.println("================ comprexa ================");
		
		FiguraComplexa complexa = new FiguraComplexa();
		complexa.adicionar(new Quadrado(3));
		complexa.adicionar(new Quadrado(10));
		complexa.adicionar(new Retangulo(2, 7));
		complexa.adicionar(new Retangulo(5, 3));
		complexa.imprimir();
		
		System.out.println("================ comprexa ainda mais ================");
		
		FiguraComplexa maisComplexaAinda = new FiguraComplexa();
		maisComplexaAinda.adicionar(new Quadrado(3));
		maisComplexaAinda.adicionar(new Quadrado(10));
		maisComplexaAinda.adicionar(new Retangulo(2, 7));
		maisComplexaAinda.adicionar(new Retangulo(5, 3));
		maisComplexaAinda.adicionar(complexa);
		maisComplexaAinda.imprimir();
		
		
// erro int[] a1 = new int[];
//OK int a2[] = new int[5];
//OK int[] a3 = new int[] { 1, 2 };
//OK int[] a4 = { 1, 2 };
// erro int[] a5 = new int[5] { 1, 2, 3, 4, 5 };

		
	}
}
