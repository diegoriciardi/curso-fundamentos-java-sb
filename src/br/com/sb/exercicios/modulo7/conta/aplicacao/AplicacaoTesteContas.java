package br.com.sb.exercicios.modulo7.conta.aplicacao;

import br.com.sb.exercicios.modulo7.conta.ContaCorrente;
import br.com.sb.exercicios.modulo7.conta.ContaInvestimento;

public class AplicacaoTesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(2);
		System.out.println("antes do saque");
		System.out.println(cc);
		
		cc.saca(0.01);
		
		System.out.println("===================");
		System.out.println("depois do saque");
		System.out.println(cc);
		
		System.out.println("\n-------------------------");
		System.out.println("-X-X-X-X-X-X-X-X-X-X-X-X-");
		System.out.println("_________________________\n");
		
		ContaInvestimento ci = new ContaInvestimento(1);
		System.out.println("antes do saque");
		System.out.println(ci);
		
		ci.saca(0.01);
		
		System.out.println("===================");
		System.out.println("depois do saque");
		System.out.println(ci);
	}
}
