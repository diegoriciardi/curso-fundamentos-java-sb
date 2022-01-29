package com.br.softblue.exercicios.modulos.modulo9;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NovaAPIData {
	public static void main(String[] args) {
		
		Instant start = Instant.now();
		String mensagemInicial = "inicio de execucao do programa: " + start; 
		
		for(double i = 0; i <= 5; i++) {
			for(double x = 0; x <= 100000; x = x + 0.7) {
				System.out.println(i + " [] " + x);
			}
		}
		
		/*
		 * pacote java.time
		 * a partir da versão 8
		 * diversas classes pra representar vários conceitos
		 * classes imutáveis (thread safe)
		 * 
		 * LocalDate = representa uma data
		 * LocalTime = representa hora/minuto/segundo
		 * LocalDateTime = representa data e hora
		 * Period = denota um período/intervalo de tempo (longos (anos, meses, dias, semana))
		 * Duration = duração de tempo num intervalo menor (dias, hora, minuto, segundo, milissegundo)
		 * MonthDay = par de mês e dia (exemplo aniversário)
		 * YearMonth = par de ano e mês (validade do cartão)
		 * Instant = representa um instante no tempo (casa dos nanossegundos)
		 * 
		 * Enum = nada mais é do que uma lista de elementos com valor fixo
		 * ChronoUnit = representa unidades de tempo
		 *  
		 * 
		 */
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate d = LocalDate.of(2020, Month.DECEMBER, 10);
		System.out.println(d);
		
		LocalTime t = LocalTime.of(13, 45, 0);
		System.out.println(t);
		
		LocalDate d2 = LocalDate.parse("04/03/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(d2);
		
		LocalTime t2 = LocalTime.parse("16:53:46", DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println(t2);
		
		LocalDate dd = LocalDate.now();
		System.out.println("now: " + dd);
		LocalDate dd1 = dd.plusDays(745);
		LocalDate dd2 = dd.minus(1, ChronoUnit.WEEKS); 
		System.out.println("then: " + dd1);
		LocalDate dd3 = dd.plusYears(2);
		System.out.println(dd3);
		
		LocalTime tt1 = LocalTime.now();
		LocalTime tt2 = tt1.plusHours(2).plusMinutes(43);
		System.out.println(tt2);
		LocalTime tt3 = tt2.minus(100, ChronoUnit.MILLIS);
		System.out.println(tt3);
		
		LocalDateTime xt1 = LocalDateTime.now();
		System.out.println(xt1);
		System.out.println(xt1.plusDays(2).plusHours(30));
		
		/*
		 * 
		 * Period e Duration
		 * 
		 */
		
		Period p = Period.of(5, 1, 7);
		System.out.println(p);
		
		LocalDate pp1 = LocalDate.now();
		System.out.println("agora: " + pp1);
		System.out.println("depois: " + pp1.plus(p));
		
		Duration ddrin = Duration.of(5, ChronoUnit.MINUTES);
		LocalTime ldrin = LocalTime.now();
		System.out.println("agora sec: " + ldrin);
		System.out.println("agora sec: " + ldrin.plus(ddrin).plus(57, ChronoUnit.SECONDS));
		
		
		LocalDate dataDeHoje = LocalDate.now();
		LocalDate prazoEntrega = LocalDate.parse("07/03/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(prazoEntrega);
		
		Period diferenca = Period.between(dataDeHoje, prazoEntrega);
		
		System.out.println("Data inicial: " + dataDeHoje);
		System.out.println("Data fim: " + prazoEntrega);
		String mensagem = diferenca.getYears() + " ano(s), " + diferenca.getMonths() + 
				" mes(es) e " + diferenca.getDays() + " dia(s)";
		System.out.println(mensagem);
		
		LocalTime horarioHoje = LocalTime.now();
		LocalTime horarioPrazo = LocalTime.parse("23:59:47", DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println("mamamia: " + horarioHoje);
		System.out.println("mamamia2: " + horarioPrazo);
		
		Duration diferenca2 = Duration.between(horarioHoje, horarioPrazo);
		
		System.out.println("min uto(s): " + ChronoUnit.MINUTES.between(horarioHoje, horarioPrazo));
		System.out.println("min uto(s): " + ChronoUnit.DAYS.between(dataDeHoje, prazoEntrega));
		
//		System.out.println("SECONDS");
//		System.out.println("Data inicial: " + dataDeHoje);
//		System.out.println("Data fim: " + prazoEntrega);
//		String outramensagem = diferenca2.getSeconds() + " segundos(s), " + diferenca2.get(ChronoUnit.MINUTES) + 
//				" minutos " + diferenca2 + " dia(s)";
//		System.out.println(outramensagem);
		
		LocalDateTime escapeRoom = LocalDateTime.now();
		LocalDateTime filme = LocalDateTime.of(2023, 1, 22, 4, 53);
		
		System.out.println(ChronoUnit.HOURS.between(escapeRoom, filme));
		System.out.println(ChronoUnit.MINUTES.between(escapeRoom, filme));
		
		

		Instant end = Instant.now();
		System.out.println(mensagemInicial);
		System.out.println("fim do progrma..." + end);
		
		Duration total = Duration.between(start, end);
		
		System.out.println("total..." + total.getSeconds());
		
		
		
		
		
		
		
	}
}
