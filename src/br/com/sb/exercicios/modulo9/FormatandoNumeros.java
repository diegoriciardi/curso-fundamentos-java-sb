package com.br.softblue.exercicios.modulos.modulo9;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatandoNumeros {

	public static void main(String[] args) {
		
		Locale l = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getCurrencyInstance(l);
		double valor = 100098712.5;
		String s = nf.format(valor);
		System.out.println(s);
		
		Locale l2 = new Locale("pt", "BR");
		NumberFormat nf2 = NumberFormat.getInstance(l2);
		String s2 = nf2.format(valor);
		System.out.println(s2);
		
		/*
		 * Date = data / hora
		 * Calendar = manipular data / hora
		 * DateFormat = formatação de datas
		 * Locale = localidade
		 * 
		 */
		
		
		Date data = new Date(2022, 0, 26);
		System.out.println(data);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		Date daquiA7Dias = cal.getTime();
		System.out.println(daquiA7Dias);
		
		Date dataHoraAtual = new Date(2020, 8, 13);
		System.out.println(dataHoraAtual);
		cal.setTime(dataHoraAtual);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println(cal.getTime());
		
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		String s3 = df.format(d);
		System.out.println(s3);
		
		Locale pais = new Locale("fr", "FR");
		Date d2 = new Date();
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, pais);
		String s4 = df2.format(d2);
		System.out.println(s4);
		
		Locale jp = new Locale("es", "ES");
		Date d3 = new Date();
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG, jp);
		String s5 = df3.format(d3);
		System.out.println(s5);
		
	}

}
