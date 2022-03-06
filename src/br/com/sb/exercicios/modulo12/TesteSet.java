package com.br.softblue.exercicios.modulos.modulo12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>();
		//Set<String> set = new LinkedHashSet<>();
		Set<String> set = new TreeSet<>();
		
		set.add("D4");
		set.add("C5");
		set.add("C5");
		set.add("A7");
		set.add("E3");
		set.add("B6");
		set.add("F2");
		set.add("G1");
		set.add("G1");
		set.add("G1");
		set.add("G1");
		
		for (String s: set) {
			System.out.println(s);
		}
		
		//Set<Produto> produtos = new TreeSet<>();
		Set<Produto> produtos = new HashSet<>();
		
		
		Produto p1 = new Produto(1, "abacate");
		Produto p2 = new Produto(2, "melancia");
		Produto p3 = new Produto(3, "cenoura");
		Produto p4 = new Produto(4, "banana");
		Produto p5 = new Produto(5, "morango");
		Produto p6 = new Produto(6, "cacau");
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		produtos.add(p6);
	}
}
