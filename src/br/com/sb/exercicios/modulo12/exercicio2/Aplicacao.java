package com.br.softblue.exercicios.modulos.modulo12.exercicio2;
import com.br.softblue.exercicios.modulos.modulo12.exercicio2.Produtos;
import com.br.softblue.exercicios.modulos.modulo12.exercicio2.Produto;

public class Aplicacao {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Laranja", 2.5);
		Produto p2 = new Produto("Laranja", 2.7);
		Produto p3 = new Produto("Maça", 1.45);
		Produto p4 = new Produto("Mamão", 4.95);
		Produto p5 = new Produto("Limão", 2.30);
		
		Produtos colecao = new Produtos();
		
		colecao.adicionar(p1);
		colecao.adicionar(p2);
		colecao.adicionar(p3);
		colecao.adicionar(p4);
		colecao.adicionar(p5);
		
		colecao.imprimir();
		
		/*
		 * saída ArrayList
		 * ---------------
		Laranja, 2.7
		Maça, 1.45
		Mamão, 4.95
		Limão, 2.3
		*/
		
		/*
		 * saída HashSet
		 * ---------------
		Laranja, 2.5
		Maça, 1.45
		Limão, 2.3
		Mamão, 4.95
		*/
		
		/*
		 * saída TreeSet após implementar class Comparable e método compareTo 
		 * ---------------
		Laranja, 2.5
		Limão, 2.3
		Mamão, 4.95
		Maça, 1.45
		*/
		
		/*
		 * saída após implementar class Comparable e método compareTo 
		 * com uma regra adicional, sendo:
		 * se o nome for igual, faça a ordenação pelo valor mais caro
		 * 
		 * ---------------
		Laranja, 2.7
		Laranja, 2.5
		Limão, 2.3
		Mamão, 4.95
		Maça, 1.45
		*/
		
	}
}
