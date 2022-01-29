package com.br.softblue.exercicios.modulos.modulo9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestaDataJamesGoling {
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.parse("19/05/1955", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(ld);
		LocalDate agora = LocalDate.now();
		
		Period diferenca = Period.between(ld, agora);
		int anos = diferenca.getYears();
		int meses = diferenca.getMonths();
		int dias = diferenca.getDays();
		String resultado = "ano(s): %d\nmes(es): %d\ndia(s): %d\n";
		System.out.printf(resultado, anos, meses, dias);
		
		LocalTime lt = LocalTime.parse("00:30:00", DateTimeFormatter.ofPattern("HH:mm:ss"));
		LocalTime atual = LocalTime.now();
		
		System.out.println(ChronoUnit.SECONDS.between(lt, atual));
		
		
	}
}
