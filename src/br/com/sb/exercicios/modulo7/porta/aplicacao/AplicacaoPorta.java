package br.com.sb.exercicios.modulo7.porta.aplicacao;

import br.com.sb.exercicios.modulo7.porta.Porta;

public class AplicacaoPorta {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Porta porta = new Porta(2, 1.70);
		System.out.println(porta);
		
		porta.abrir();
		
		System.out.println(porta);
	
		
		Porta novaPorta = (Porta) porta.clone();
		
		System.out.println(novaPorta);
	}
}
