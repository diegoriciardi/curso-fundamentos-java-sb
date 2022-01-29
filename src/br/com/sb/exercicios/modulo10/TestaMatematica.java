package com.br.softblue.exercicios.modulos.modulo10;

import com.br.softblue.exercicios.modulos.modulo10.Matematica.TipoAngulo;

public class TestaMatematica {

	public static void main(String[] args) {
		
		String separadorMensagem = "---------------------";
		
		double a = 55.75;
		//Double a = Double.valueOf(55.75);
		TipoAngulo g = TipoAngulo.GRAUS;
		
		//double r = 180;
		Double r = Double.valueOf(180);
		TipoAngulo rd = TipoAngulo.RADIANOS;
		
		//double resultadoGrausParaRadianos = Matematica.converterAngulo(a, g);
		//double resultadoRadianoParaGraus = Matematica.converterAngulo(r, rd);
		Double resultadoGrausParaRadianos = Matematica.converterAngulo(a, g);
		Double resultadoRadianoParaGraus = Matematica.converterAngulo(r, rd);
		
		System.out.println("GRAUS -> RADIANOS: ");
		System.out.println(a + " -> " + resultadoGrausParaRadianos);
		
		System.out.println(separadorMensagem);
		
		System.out.println("RADIANOS -> GRAUS: ");
		System.out.println(r + " -> " + resultadoRadianoParaGraus);
		
		System.out.println(separadorMensagem);
		
		System.out.println("somar com retorno Integer");
		//int resultadoDaSoma = Matematica.somar(88, 97, 105);
		Integer resultadoDaSoma = Matematica.somar(88, 97, 105);
		System.out.println(resultadoDaSoma);
		
		System.out.println(separadorMensagem);
		
		System.out.println("Converter String para binário");
		////////////////// 32 16 8 4 2 1
		String numeroBinario = "11111111";
		//int resultadoConversaoStringParaBinario = Matematica.converterBinarioParaDecimal(numeroBinario);
		Integer resultadoConversaoStringParaBinario = Matematica.converterBinarioParaDecimal(numeroBinario);
		System.out.println("String: " + numeroBinario + " -> Binario: " + resultadoConversaoStringParaBinario);
		
	}

}
