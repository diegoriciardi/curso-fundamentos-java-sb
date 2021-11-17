package br.com.sb.exercicios.modulo8.conta.aplicacao;

import br.com.sb.exercicios.modulo8.conta.ContaBancaria;
import br.com.sb.exercicios.modulo8.conta.SaldoInsuficienteException;
import br.com.sb.exercicios.modulo8.conta.ValorInvalidoException;

public class TesteConta {
	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		System.out.println(c1);
		System.out.println(c2);
		
		imprimeSeparador();
		
		try {
			
			c1.deposita(1100.0);
			c1.transferePara(c2, 1.0);
			
		} catch(ValorInvalidoException | SaldoInsuficienteException ex) {
			
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println(c1);
		System.out.println(c2);
		
	}
	
	private static void imprimeSeparador() {
		System.out.println();
		System.out.println("<<<<<<<<<<<>>>>>>>>>>>");
		System.out.println();
	}
}
