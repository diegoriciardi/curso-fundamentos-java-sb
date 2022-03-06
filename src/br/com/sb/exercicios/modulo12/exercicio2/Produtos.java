package com.br.softblue.exercicios.modulos.modulo12.exercicio2;
import com.br.softblue.exercicios.modulos.modulo12.exercicio2.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Produtos {

	private Collection<Produto> produtos;
	
	public Produtos() {
		//produtos = new ArrayList<>();
		//produtos = new HashSet<>();
		produtos = new TreeSet<>();
	}
	
	public void adicionar(Produto produto) {
		produtos.add(produto);
	}
	
	public void imprimir() {
		Iterator iterator = produtos.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
