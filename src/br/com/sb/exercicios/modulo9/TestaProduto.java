package com.br.softblue.exercicios.modulos.modulo9;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class TestaProduto {

	public static void main(String[] args) {
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Feijão", 2.5, "04/10/2020"));
		produtos.add(new Produto("Café", 1.0, "01/01/2022"));
		produtos.add(new Produto("Beterraba", 0.9, "12/11/2017"));
		produtos.add(new Produto("Banana", 4.93, "17/09/2016"));
		produtos.add(new Produto("Laranja", 3.59, "23/08/2022"));
		produtos.add(new Produto("Abacate", 12.945, "14/07/2021"));
		produtos.add(new Produto("Goiaba", 3.79, "02/06/2019"));
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("%d) %12s %09.2f %s \n", i+1, 
					produtos.get(i).getNome(), 
					produtos.get(i).getPeso(), 
					df.format(produtos.get(i).getDataDeValidade()));
		}
		
	}

}
