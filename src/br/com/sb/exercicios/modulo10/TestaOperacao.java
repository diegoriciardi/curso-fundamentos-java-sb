package com.br.softblue.exercicios.modulos.modulo10;

public class TestaOperacao {

	public static void main(String[] args) {
		
		double numero1 = 7;
		double numero2 = 3;
		
		Operacao operacao1 = Operacao.SOMA;
		double resultadoSoma = operacao1.calcular(numero1, numero2);
		System.out.println("resultado soma: " + resultadoSoma);
		
		Operacao operacao2 = Operacao.SUBTRACAO;
		double resultadoSubtracao = operacao2.calcular(numero1, numero2);
		System.out.println("resultado subtracao: " + resultadoSubtracao);
		
		Operacao operacao3 = Operacao.MULTIPLICACAO;
		double resultadoMultiplicacao = operacao3.calcular(numero1, numero2);
		System.out.println("resultado subtracao: " + resultadoMultiplicacao);

		Operacao operacao4 = Operacao.DIVISAO;
		double resultadoDivisao = operacao4.calcular(numero1, numero2);
		System.out.println("resultado subtracao: " + resultadoDivisao);
		
	}
}
