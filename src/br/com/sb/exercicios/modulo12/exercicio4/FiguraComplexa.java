package com.br.softblue.exercicios.modulos.modulo12.exercicio4;

import java.util.ArrayList;

public class FiguraComplexa extends Figura {

	ArrayList<Figura> figuras;
	
	public FiguraComplexa() {
		figuras = new ArrayList<Figura>();
	}
	
	public void adicionar(Figura f) {
		figuras.add(f);
	}
	
	@Override
	public double calcularArea() {
		
		double resultado = 0;
		
		for (Figura f : figuras) {
			resultado += f.calcularArea();
		}
		
		return resultado;
	}

	
}
