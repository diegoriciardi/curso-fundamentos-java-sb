package com.br.softblue.exercicios.modulos.modulo12.exercicio2;

public class Produto implements Comparable<Produto> {

	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		this.nome  = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String toString() {
		String resposta = getNome() + ", " + getValor();
		return resposta;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}

		if (!(this instanceof Produto)) {
			return false;
		}
		
		Produto other = (Produto) obj;
		
		if (this.getNome().equals(other.getNome())) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return String.valueOf(getNome()).hashCode();
	}

	@Override
	public int compareTo(Produto o) {
//		if(this.getNome().equals(o.getNome())) {
//			return 0;
//		}
		
		if(this.getNome().equals(o.getNome())) {
			if (this.getValor() < o.getValor()) {
				return 1;
			}
		}
		
		if (this.getNome().compareTo(o.getNome()) > 0) {
			return 1;
		}
		
		return -1;
	}
}
