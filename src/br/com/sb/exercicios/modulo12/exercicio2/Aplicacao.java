package com.br.softblue.exercicios.modulos.modulo12.exercicio2;
import com.br.softblue.exercicios.modulos.modulo12.exercicio2.Produtos;
import com.br.softblue.exercicios.modulos.modulo12.exercicio2.Produto;

public class Aplicacao {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Laranja", 2.5);
		Produto p2 = new Produto("Laranja", 2.7);
		Produto p3 = new Produto("Ma�a", 1.45);
		Produto p4 = new Produto("Mam�o", 4.95);
		Produto p5 = new Produto("Lim�o", 2.30);
		
		Produtos colecao = new Produtos();
		
		colecao.adicionar(p1);
		colecao.adicionar(p2);
		colecao.adicionar(p3);
		colecao.adicionar(p4);
		colecao.adicionar(p5);
		
		colecao.imprimir();
		
		/*
		 * sa�da ArrayList
		 * ---------------
		Laranja, 2.7
		Ma�a, 1.45
		Mam�o, 4.95
		Lim�o, 2.3
		*/
		
		/*
		 * sa�da HashSet
		 * ---------------
		Laranja, 2.5
		Ma�a, 1.45
		Lim�o, 2.3
		Mam�o, 4.95
		*/
		
		/*
		 * sa�da TreeSet ap�s implementar class Comparable e m�todo compareTo 
		 * ---------------
		Laranja, 2.5
		Lim�o, 2.3
		Mam�o, 4.95
		Ma�a, 1.45
		*/
		
		/*
		 * sa�da ap�s implementar class Comparable e m�todo compareTo 
		 * com uma regra adicional, sendo:
		 * se o nome for igual, fa�a a ordena��o pelo valor mais caro
		 * 
		 * ---------------
		Laranja, 2.7
		Laranja, 2.5
		Lim�o, 2.3
		Mam�o, 4.95
		Ma�a, 1.45
		*/
		
	}
}
