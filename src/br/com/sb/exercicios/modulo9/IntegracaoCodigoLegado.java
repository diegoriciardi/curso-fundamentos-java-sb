package com.br.softblue.exercicios.modulos.modulo9;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class IntegracaoCodigoLegado {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Date e Calendar são mais ou menos o equivalente ao Instant
		 * 
		 */
		
		//Date para LocalDateTime
		
		System.out.println("------------ Date -> LocalDateTime -------------");
		
		Date date = new Date();
		Instant i = date.toInstant();
		LocalDateTime ldt = LocalDateTime.ofInstant(i, ZoneId.systemDefault());
		
		System.out.println(date);
		System.out.println(ldt);
		
		System.out.println("------------ LocalDateTime -> Date -------------");
		
		LocalDateTime ldt2 = LocalDateTime.now();
		Instant i2 = ldt2.atZone(ZoneId.systemDefault()).toInstant();
		Date date2 = Date.from(i2);
		
		System.out.println(ldt2);
		System.out.println(date2);
		
		System.out.println("------------ Calendar -> LocalDateTime -------------");
		
		// Calendar para LocalDateTime
		
		Calendar cal = Calendar.getInstance();
		Instant i3 = cal.toInstant();
		LocalDateTime ldt3 = LocalDateTime.ofInstant(i3, ZoneId.systemDefault());
		
		System.out.println(cal);
		System.out.println(ldt3);
		
		System.out.println("------------ LocalDateTime -> Calendar -------------");
		
		LocalDateTime ldt4 = LocalDateTime.now();
		Instant i4 = ldt4.atZone(ZoneId.systemDefault()).toInstant();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(Date.from(i4));
		
		System.out.println(ldt4);
		System.out.println(cal2);
		
		Random r = new Random();
		System.out.println("next double: " + r.nextDouble());
		System.out.println("next int: " + r.nextInt(11));
		
		double aa = Math.random() * 10;
		System.out.println("math.random " + (int) aa);
		
		for (int o = 1; o <= 10; o++) {
			System.out.println(gerarInt(new Random().nextInt(11), new Random().nextInt(12)));
		}

	}
	
	public static int gerarInt(int inicio, int fim) {
		int intervalo = fim - inicio;
		int n = (int) (Math.random() * intervalo) + inicio;
		return n;
	}

}
