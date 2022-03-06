package com.br.softblue.exercicios.modulos.modulo12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteList {
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("abc");
		l.add("def");
		l.add(0, "ghi");
		
		String e = l.get(1);
		System.out.println("imprimindo indice 1 = " + e);
		
		for (String s : l) {
			System.out.println(s);
		}
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		Iterator iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
