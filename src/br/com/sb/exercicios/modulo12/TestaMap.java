package com.br.softblue.exercicios.modulos.modulo12;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestaMap {
	public static void main(String[] args) {
		
		//Map<Integer, Produto> map = new HashMap<>();
		//Map<Integer, Produto> map = new LinkedHashMap<>();
		Map<Integer, Produto> map = new TreeMap<>();
		
		Produto p1 = new Produto(1, "produto 1");
		Produto p2 = new Produto(2, "produto 2");
		Produto p3 = new Produto(3, "produto 3");
		Produto p4 = new Produto(4, "produto 4");
		Produto p5 = new Produto(5, "produto 5");
		Produto p6 = new Produto(6, "produto 6");
		Produto p7 = new Produto(7, "produto 7");
		
		map.put(1, p1);
		map.put(20, p2);
		map.put(3, p3);
		map.put(3, p3);
		map.put(4, p4);
		map.put(5, p5);
		map.put(6, p6);
		map.put(7, p7);
		
		//System.out.println(map.get(3));
		
		// para iterar sobre as chaves
		
		Set<Integer> keys = map.keySet();
		
		for (Integer k : keys) {
			System.out.println(k);
		}
		
		// para iterar sobre os valores
		
		Collection<Produto> valores = map.values();
		
		for (Produto p : valores) {
			System.out.println(p);
		}
		
		// para ver chave e valor
		
		Set<Map.Entry<Integer, Produto>> es = map.entrySet();
		
		for (Map.Entry<Integer, Produto>  e : es) {
			//System.out.println(e);
			System.out.println(e.getKey() + " => " + e.getValue());
		}

		
		
	}
}
