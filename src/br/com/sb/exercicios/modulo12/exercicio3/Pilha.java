package com.br.softblue.exercicios.modulos.modulo12.exercicio3;

public class Pilha extends Colecao {
	
	public Pilha() {
		super();
	}

	@Override
	public Object removerItem() {
		Object ultimo = null;
		for (Object o : getDados()) {
			ultimo = o;
		}
		
		System.out.println("vou remover o objeto da pilha { " + ultimo + " }");
		return getDados().remove(ultimo);
		
	}
}
