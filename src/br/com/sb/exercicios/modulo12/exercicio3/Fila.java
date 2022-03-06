package com.br.softblue.exercicios.modulos.modulo12.exercicio3;

public class Fila extends Colecao {
	
	public Fila() {
		super();
	}

	@Override
	public Object removerItem() {
		Object primeiro = getDados().get(0);
		System.out.println("vou remover o objeto da fila { " + primeiro  + " }");
		return getDados().remove(primeiro );
	}
}
