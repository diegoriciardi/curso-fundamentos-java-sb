package com.br.softblue.exercicios.modulos.modulo12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TesteAntesDosExercicios {

	public static void main(String[] args) {
		
		final int RADIX = 10;
		char jogada;
		int contadorJogadas = 1;
	
		Set<int[]> numeros = new LinkedHashSet<>();
		
		int[] jogada1 = { 1, 1, 1 };
		int[] jogada2 = { 2, 2, 1 };
		int[] jogada3 = { 2, 0, 1 };
		int[] jogada5 = { 1, 2, 1 };
		int[] jogada4 = { 0, 2, 0 };
		int[] jogada6 = { 1, 0, 0 };
		int[] jogada7 = { 0, 0, 0 };
		
		numeros.add(jogada1);
		numeros.add(jogada2);
		numeros.add(jogada3);
		numeros.add(jogada4);
		numeros.add(jogada5);
		numeros.add(jogada6);
		numeros.add(jogada7);
		
		Character[][] tabuleiro = new Character[3][3];
		Character[][] tabuleiro2 = new Character[3][3];
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[0].length; j++) {
				tabuleiro[i][j] = ' ';
				tabuleiro2[i][j] = ' ';
			}
		}

		for (int[] n : numeros) {
				char linha = Character.forDigit(n[0], RADIX);
				char coluna = Character.forDigit(n[1], RADIX);
				if (n[2] == 0) {
					jogada = 'O';
				} else {
					jogada = 'X';
				}
				String mensagem = linha + " " + coluna + " -> " + jogada;
				tabuleiro[n[0]][n[1]] = jogada;
				tabuleiro2[n[0]][n[1]] = Character.forDigit(contadorJogadas, RADIX);
				contadorJogadas++;
		}
				
		for (int a = 0; a < tabuleiro.length; a++) {
			for (int b = 0; b < tabuleiro[0].length; b++) {
				System.out.print("| " + tabuleiro[a][b] + " ");
			}
			System.out.println("\n----+---+----");
		}
		
		System.out.println();
		
		for (int a = 0; a < tabuleiro2.length; a++) {
			for (int b = 0; b < tabuleiro2[0].length; b++) {
				System.out.print("| " + tabuleiro2[a][b] + " ");
			}
			System.out.println("\n----+---+----");
		}
	}
}
