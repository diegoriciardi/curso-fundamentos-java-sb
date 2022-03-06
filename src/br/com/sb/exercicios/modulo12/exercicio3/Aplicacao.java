package com.br.softblue.exercicios.modulos.modulo12.exercicio3;

public class Aplicacao {
	public static void main(String[] args) {
		
//		String palavraPilha = "nome";
//		int idadePilha = 25;
//		double alturaPilha = 1.76;
//		
//		Pilha pilha = new Pilha();
//		
//		pilha.inserirItem(palavraPilha);
//		pilha.inserirItem(idadePilha);
//		pilha.inserirItem(alturaPilha);
//		
//		pilha.imprimir();
//		
//		pilha.removerItem();
//		
//		pilha.imprimir();
		
		String palavraFila = "nome";
		int idadeFila = 25;
		double alturaFila = 1.76;
		
		Fila fila = new Fila();
		
		fila.inserirItem(palavraFila);
		fila.inserirItem(idadeFila);
		fila.inserirItem(alturaFila);
		
		fila.imprimir();
		
		fila.removerItem();
		fila.removerItem();
		
		fila.imprimir();
		
		
	}
}
