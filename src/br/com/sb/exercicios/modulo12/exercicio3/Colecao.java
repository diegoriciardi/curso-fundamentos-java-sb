package com.br.softblue.exercicios.modulos.modulo12.exercicio3;

import java.util.ArrayList;

public abstract class Colecao {

	private ArrayList dados;
	
	public Colecao() {
		this.dados = new ArrayList<>();
	}
	
	public ArrayList getDados() {
		return this.dados;
	}
	
	public void inserirItem(Object item) {
		dados.add(item);
	}
	
	public abstract Object removerItem();
	
	public void imprimir() {
		int contador = 1;
		for (Object o : dados) {
			System.out.println(contador + " => " + o);
			contador++;
		}
	}

}
